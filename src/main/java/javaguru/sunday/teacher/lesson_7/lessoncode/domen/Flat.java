package main.java.javaguru.sunday.teacher.lesson_7.lessoncode.domen;


import main.java.javaguru.sunday.teacher.lesson_7.lessoncode.domen.enums.InsuranceRisk;

import java.math.BigDecimal;
import java.util.List;

public class Flat extends InsuredObject{

    public Flat(BigDecimal cadastralValue, List<SubInsuredObject> subInsuredObjects, List<InsuranceRisk> insuranceRisk) {
        super(cadastralValue, subInsuredObjects, insuranceRisk);
    }

    @Override
    public BigDecimal getRiskCoefficient(InsuranceRisk insuranceRisk) {
        if (InsuranceRisk.FIRE.equals(insuranceRisk)) {
            return new BigDecimal("0.02");
        } else if (InsuranceRisk.THEFT.equals(insuranceRisk)) {
            return new BigDecimal("0.10");
        }
        return null;
    }
}
