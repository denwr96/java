package javaguru.sunday.teacher.lesson_7.lessoncode.demo;


import javaguru.sunday.teacher.lesson_7.lessoncode.domen.Flat;
import javaguru.sunday.teacher.lesson_7.lessoncode.domen.House;
import javaguru.sunday.teacher.lesson_7.lessoncode.domen.InsuredObject;
import javaguru.sunday.teacher.lesson_7.lessoncode.domen.enums.InsuranceRisk;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Demo {

    public static void main(String[] args) {
        InsuredObject[] myHouses = new InsuredObject[4];
        List<InsuranceRisk> insuredObjectRisks = new ArrayList<>();
        insuredObjectRisks.add(InsuranceRisk.FIRE);
        myHouses[0] = new House(new BigDecimal("100"), new ArrayList<>(), insuredObjectRisks);
        myHouses[1] = new House(new BigDecimal("200"), new ArrayList<>(), insuredObjectRisks);
        myHouses[2] = new Flat(new BigDecimal("300"), new ArrayList<>(), insuredObjectRisks);
        myHouses[3] = new Flat(new BigDecimal("300"), new ArrayList<>(), insuredObjectRisks);

        System.out.println(myHouses[1].getCadastralValue());
        ;
    }
}
