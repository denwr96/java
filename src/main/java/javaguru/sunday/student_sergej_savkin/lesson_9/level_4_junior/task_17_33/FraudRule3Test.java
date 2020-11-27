package main.java.javaguru.sunday.student_sergej_savkin.lesson_9.level_4_junior.task_17_33;

//task26

public class FraudRule3Test {
    public static void main(String[] args) {
        FraudRule3Test fraudRule3Test = new FraudRule3Test();
        fraudRule3Test.isFraudTestOne();
        fraudRule3Test.isFraudTestTwo();
    }

    public void isFraudTestOne() {
        FraudRule3 test = new FraudRule3("banSidney");
        check(test.isFraud(new Transaction(new Trader("Pokemon", "Sidney", "Australia"), 100000)),"isFraudTestOne");
    }

    public void isFraudTestTwo() {
        FraudRule3 test = new FraudRule3("banSidney");
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
