package javaguru.sunday.teacher.lesson_7.lessoncode.service;


import javaguru.sunday.teacher.lesson_7.lessoncode.domen.InsuredObject;
import javaguru.sunday.teacher.lesson_7.lessoncode.domen.SubInsuredObject;
import javaguru.sunday.teacher.lesson_7.lessoncode.domen.enums.InsuranceRisk;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

public class InsuranceSubObjectPremiumCalculator {


    public static final String PRICE_BORDER = "2000";
    public static final String STANDART_FIRE_COEF = "0.03";
    public static final String OVERPRICED_FIRE_COEF = "0.04";
    public static final String STANDART_THEFT_COEF = "0.02";
    public static final String OVERPRICED_THEFT_COEF = "0.01";

    public BigDecimal calculateInsuranceSubObjectPriemium(InsuredObject insuredObject) {
        Set<InsuranceRisk> insuranceRisks = identifyAllRiskForSubObject(insuredObject);
        BigDecimal subInsurancePremium = BigDecimal.ZERO;
        for (InsuranceRisk insuranceRisk : insuranceRisks) {
            //calculate premium per risk
            BigDecimal subObjectPremiumPerRisk = calculatePremiumPerRisk(insuranceRisk, insuredObject);
            //get coef according to risk
            BigDecimal coef = getRiskCoefficientForSubInsuredObject(subObjectPremiumPerRisk, insuranceRisk);
            //add them
            BigDecimal result = subObjectPremiumPerRisk.multiply(coef);
            subInsurancePremium = subInsurancePremium.add(result);
        }

        return subInsurancePremium;
    }

    private BigDecimal getRiskCoefficientForSubInsuredObject(BigDecimal sum, InsuranceRisk insuranceRisk) {
        if (InsuranceRisk.FIRE == insuranceRisk) {
            if (sum.compareTo(new BigDecimal(PRICE_BORDER)) < 0) {
                return new BigDecimal(STANDART_FIRE_COEF);
            } else {
                return new BigDecimal(OVERPRICED_FIRE_COEF);
            }
        } else if (InsuranceRisk.THEFT == insuranceRisk) {
            if (sum.compareTo(new BigDecimal(PRICE_BORDER)) < 0) {
                return new BigDecimal(STANDART_THEFT_COEF);
            } else {
                return new BigDecimal(OVERPRICED_THEFT_COEF);
            }
        }
        return null;
    }

    private BigDecimal calculatePremiumPerRisk(InsuranceRisk insuranceRisk, InsuredObject insuredObject) {
        BigDecimal subObjectPricePerRisk = BigDecimal.ZERO;
        for (SubInsuredObject subInsuredObject : insuredObject.getSubInsuredObjects()) {
            if (subInsuredObject.getInsuranceRisks().contains(insuranceRisk)) {
                subObjectPricePerRisk = subObjectPricePerRisk.add(subInsuredObject.getPrice());
            }
        }
        return subObjectPricePerRisk;
    }

    public Set<InsuranceRisk> identifyAllRiskForSubObject(InsuredObject insuredObject) {
        Set<InsuranceRisk> subObjectRisks = new HashSet<>();
        for (SubInsuredObject subInsuredObject : insuredObject.getSubInsuredObjects()) {
            subObjectRisks.addAll(subInsuredObject.getInsuranceRisks());
        }
        return subObjectRisks;
    }
}
