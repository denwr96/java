package main.java.javaguru.sunday.student_konstantin_shestakov.lesson_6.level_x.super_task_1;

import java.util.Arrays;

class Policy {
    String customerName;
    String[] mainInsuranceObjects = {"0", "0"};
    double[] mainInsuranceObjectsPrice = {0, 0};
    String[] additionalInsuranceObjects = {"0", "0"};
    double[] additionalInsuranceObjectsPrice = {0, 0};
    double mainCoef = 0.0015;

    boolean fireInsurance;
    double fireAdditionalCoef;
    boolean theftInsurance;
    double theftAdditionalCoef;

    double sumMainInsuranceObjectsPrice;
    double sumAdditionalInsuranceObjectsPrice;
    double policyPrice;

    Policy(String customerName, boolean fireInsurance, boolean theftInsurance) {
        this.customerName = customerName;
//        this.mainInsuranceObjects = mainInsuranceObjects;
//        this.mainInsuranceObjectsPrice = mainInsuranceObjectsPrice;
//        this.additionalInsuranceObjects = additionalInsuranceObjects;
//        this.additionalInsuranceObjectsPrice = additionalInsuranceObjectsPrice;
        this.fireInsurance = fireInsurance;
        this.theftInsurance = theftInsurance;
    }

    double calculateMainInsuranceObjectsPrice() {
        sumMainInsuranceObjectsPrice = 0;
        for (double v : mainInsuranceObjectsPrice) {
            sumMainInsuranceObjectsPrice = sumMainInsuranceObjectsPrice + v;
        }
        System.out.println("Sum main insurance objects = " + sumMainInsuranceObjectsPrice);
        return sumMainInsuranceObjectsPrice;
    }

    double calculateAdditionalInsuranceObjectsPrice() {
        sumAdditionalInsuranceObjectsPrice = 0;
        for (double v : additionalInsuranceObjectsPrice) {
            sumAdditionalInsuranceObjectsPrice = sumAdditionalInsuranceObjectsPrice + v;
        }
        System.out.println("Sum additional insurance objects = " + sumAdditionalInsuranceObjectsPrice);
        return sumAdditionalInsuranceObjectsPrice;
    }

    double calculate(Policy policy) {
        sumMainInsuranceObjectsPrice = calculateMainInsuranceObjectsPrice();
        sumAdditionalInsuranceObjectsPrice = calculateAdditionalInsuranceObjectsPrice();

        if (policy.fireInsurance) {
            policy.fireAdditionalCoef = 0.03;
        }
        if (policy.theftInsurance) {
            policy.theftAdditionalCoef = 0.01;
        }
        if (policy.fireInsurance && policy.sumAdditionalInsuranceObjectsPrice >= 2000) {
            policy.fireAdditionalCoef = 0.04;
        }
        if (policy.theftInsurance && policy.sumAdditionalInsuranceObjectsPrice >= 2000) {
            policy.theftAdditionalCoef = 0.02;
        }

        System.out.println("Fire coef = " + fireAdditionalCoef);
        System.out.println("Theft coef = " + theftAdditionalCoef);

        policy.policyPrice = (sumMainInsuranceObjectsPrice * mainCoef) + (sumAdditionalInsuranceObjectsPrice * fireAdditionalCoef) + (sumAdditionalInsuranceObjectsPrice * theftAdditionalCoef);

        return policyPrice;
    }

    void printInfo() {
        System.out.println("Customer: " + customerName);
        System.out.println("List of main insurance objects: " + Arrays.toString(mainInsuranceObjects));
        System.out.println("List of main insurance objects prices: " + Arrays.toString(mainInsuranceObjectsPrice));
        System.out.println("List of additional insurance objects: " + Arrays.toString(additionalInsuranceObjects));
        System.out.println("List of additional insurance objects prices: " + Arrays.toString(additionalInsuranceObjectsPrice));
    }


}
