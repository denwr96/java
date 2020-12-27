package javaguru.sunday.teacher.lesson_7.lessoncode.service;


import javaguru.sunday.teacher.lesson_7.lessoncode.domen.InsuredObject;
import javaguru.sunday.teacher.lesson_7.lessoncode.domen.enums.InsuranceRisk;

import java.math.BigDecimal;
import java.util.List;

public class InsuranceObjectCalculator {

    private InsuranceSubObjectPremiumCalculator subObjectPremiumCalculator = new InsuranceSubObjectPremiumCalculator();

    public BigDecimal calculateInsuredObject(InsuredObject insuredObject) {
        //Премия самого объекта (кадастр. стоимость * коэф. риска)
        BigDecimal objectItselfPremium = calculateInsuredObjectPremiumForItself(insuredObject);

        //Премия для всех под объектов с учетом рисков
        BigDecimal subObjectPremium = subObjectPremiumCalculator.calculateInsuranceSubObjectPriemium(insuredObject);
        return objectItselfPremium.add(subObjectPremium);
    }

    public BigDecimal calculateInsuredObjectPremiumForItself(InsuredObject insuredObject) {
        BigDecimal insuredObjectRiskPremium = BigDecimal.ZERO;
        List<InsuranceRisk> insuranceRisk = insuredObject.getInsuranceRisk();
        for (InsuranceRisk risk : insuranceRisk) {
            BigDecimal premium = calculateInsuredObjectRiskPremium(insuredObject, risk);
            insuredObjectRiskPremium = insuredObjectRiskPremium.add(premium);
        }
        return insuredObjectRiskPremium;
    }

    private BigDecimal calculateInsuredObjectRiskPremium(InsuredObject insuredObject, InsuranceRisk risk) {
        BigDecimal riskCoefficient = insuredObject.getRiskCoefficient(risk);
        return insuredObject.getCadastralValue().multiply(riskCoefficient); //100 * 0.02
    }
}
