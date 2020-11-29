package main.java.javaguru.sunday.teacher.lesson_10.lessoncode;

import java.math.BigDecimal;

public class InsuranceDemo {

    public static void main(String[] args) {
        InsurancePremiumCalculator calculator = new InsurancePremiumCalculatorNewImpl();

        Broker broker = new Broker(calculator);
        BigDecimal bigDecimal = broker.callToTheCustomerAndCalculatePremiumForHim();
        System.out.println(bigDecimal);

        BigDecimal bigDecimal1 = broker.calculateWithValidation();
        System.out.println(bigDecimal1);
    }
}
