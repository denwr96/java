package javaguru.sunday.teacher.lesson_7.lessoncode.domen;


import javaguru.sunday.teacher.lesson_7.lessoncode.domen.enums.InsuranceRisk;

import java.math.BigDecimal;
import java.util.List;

public class House extends InsuredObject {

    public House(BigDecimal cadastralValue, List<SubInsuredObject> subInsuredObjects, List<InsuranceRisk> insuranceRisk) {
        super(cadastralValue, subInsuredObjects, insuranceRisk);
    }

    @Override
    public BigDecimal getRiskCoefficient(InsuranceRisk insuranceRisk) {
        if (InsuranceRisk.FIRE.equals(insuranceRisk)) {
            return new BigDecimal("0.05");
        }
        return null;
    }
}
