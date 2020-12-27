package javaguru.sunday.teacher.lesson_7.lessoncode.demo;


import javaguru.sunday.teacher.lesson_7.lessoncode.domen.Flat;
import javaguru.sunday.teacher.lesson_7.lessoncode.domen.House;
import javaguru.sunday.teacher.lesson_7.lessoncode.domen.Policy;
import javaguru.sunday.teacher.lesson_7.lessoncode.domen.SubInsuredObject;
import javaguru.sunday.teacher.lesson_7.lessoncode.domen.enums.InsuranceRisk;
import javaguru.sunday.teacher.lesson_7.lessoncode.service.InsurancePremiumCalculator;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class RiskCalcTest {

    public static void main(String[] args) {
        RiskCalcTest testRunner = new RiskCalcTest();
        testRunner.test1();
    }

    private void test1() {
        //Dom = 100
            //TV 500
            //MacBook 2000
                //=5 + 100 + 25 = 130
        //Flat = 200
            //TV 500
            //Lenovo 500
                //=4 + 30 + 20 = 54
                    //184
        Policy policy = new Policy();
        List<InsuranceRisk> insuredObjectRisks = new ArrayList<>();
        insuredObjectRisks.add(InsuranceRisk.FIRE);
        List<InsuranceRisk> insuredSubObjectRisks = new ArrayList<>();
        insuredSubObjectRisks.add(InsuranceRisk.FIRE);
        insuredSubObjectRisks.add(InsuranceRisk.THEFT);

        List<SubInsuredObject> houseSubObjects = new ArrayList<>();
        houseSubObjects.add(new SubInsuredObject("TV", new BigDecimal("500"), insuredSubObjectRisks));
        houseSubObjects.add(new SubInsuredObject("MacBook", new BigDecimal("2000"), insuredSubObjectRisks));

        House houseOne = new House(new BigDecimal("100"), houseSubObjects, insuredObjectRisks);

        List<SubInsuredObject> flatSubObjects = new ArrayList<>();
        flatSubObjects.add(new SubInsuredObject("TV", new BigDecimal("500"), insuredSubObjectRisks));
        flatSubObjects.add(new SubInsuredObject("MacBook", new BigDecimal("500"), insuredSubObjectRisks));
        Flat flatOne = new Flat(new BigDecimal("200"), flatSubObjects, insuredObjectRisks);

        policy.addInsObject(houseOne);
        policy.addInsObject(flatOne);

        InsurancePremiumCalculator calculator = new InsurancePremiumCalculator();

        BigDecimal result = calculator.calculate(policy);
        System.out.println(result);

    }
}
