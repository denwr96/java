package main.java.javaguru.sunday.teacher.lesson_7.lessoncode.demo;


import main.java.javaguru.sunday.teacher.lesson_7.lessoncode.domen.Flat;
import main.java.javaguru.sunday.teacher.lesson_7.lessoncode.domen.House;
import main.java.javaguru.sunday.teacher.lesson_7.lessoncode.domen.Policy;
import main.java.javaguru.sunday.teacher.lesson_7.lessoncode.domen.enums.InsuranceRisk;
import main.java.javaguru.sunday.teacher.lesson_7.lessoncode.service.InsurancePremiumCalculator;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class RiskDemo {

    public static void main(String[] args) {

        Policy policy = new Policy();
        List<InsuranceRisk> insuredObjectRisks = new ArrayList<>();
        insuredObjectRisks.add(InsuranceRisk.FIRE);
        insuredObjectRisks.add(InsuranceRisk.THEFT);

        House houseOne = new House(new BigDecimal("100"), new ArrayList<>(), insuredObjectRisks);
        Flat flatOne = new Flat(new BigDecimal("2000"), new ArrayList<>(), insuredObjectRisks);
        policy.addInsObject(houseOne);
        policy.addInsObject(flatOne);

        InsurancePremiumCalculator calculator = new InsurancePremiumCalculator();

        BigDecimal premium = calculator.calculate(policy);
        System.out.println(premium);
    }
}
