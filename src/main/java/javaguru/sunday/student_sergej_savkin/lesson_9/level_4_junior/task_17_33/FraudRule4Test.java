package main.java.javaguru.sunday.student_sergej_savkin.lesson_9.level_4_junior.task_17_33;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

//task27
@CodeReview(approved = true)
public class FraudRule4Test {
    public static void main(String[] args) {

        FraudRule4Test fraudRule4Test = new FraudRule4Test();
        fraudRule4Test.isFraudTestOne();
        fraudRule4Test.isFraudTestTwo();
    }

    public void isFraudTestOne() {
        FraudRule4 test = new FraudRule4("banJamaica");
        check(test.isFraud(new Transaction(new Trader("Pokemon", "Sidney", "Jamaica"), 100000)),"isFraudTestOne");
    }

    public void isFraudTestTwo() {
        FraudRule4 test = new FraudRule4("banJamaica");
        check(!test.isFraud(new Transaction(new Trader("Pokemon", "Riga", "Latvia"), 100)),"isFraudTestTwo");
    }

    public void check(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " OK!");
        } else {
            System.out.println(testName + " failed!");
        }
    }

}
