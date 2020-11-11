package main.java.javaguru.sunday.teacher.lesson_7.lessoncode.service;


import main.java.javaguru.sunday.teacher.lesson_7.lessoncode.domen.InsuredObject;
import main.java.javaguru.sunday.teacher.lesson_7.lessoncode.domen.Policy;

import java.math.BigDecimal;
import java.util.List;

public class InsurancePremiumCalculator {

    private InsuranceObjectCalculator objectCalculator = new InsuranceObjectCalculator();

    public BigDecimal calculate(Policy policy) {
        BigDecimal premium = BigDecimal.ZERO;
        List<InsuredObject> insuredObjects = policy.getInsuredObjects();
        for (InsuredObject insuredObject : insuredObjects) {
            BigDecimal insuredObjectPremium = objectCalculator.calculateInsuredObject(insuredObject);
            premium = premium.add(insuredObjectPremium);
        }
        return premium;
    }



}
