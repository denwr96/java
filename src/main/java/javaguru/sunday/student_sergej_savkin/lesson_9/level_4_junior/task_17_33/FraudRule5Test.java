package javaguru.sunday.student_sergej_savkin.lesson_9.level_4_junior.task_17_33;

import javaguru.sunday.teacher.annotations.CodeReview;

//task28
@CodeReview(approved = true)
public class FraudRule5Test {
    public static void main(String[] args) {

        FraudRule5Test fraudRule5Test = new FraudRule5Test();
        fraudRule5Test.isFraudTestOne();
        fraudRule5Test.isFraudTestTwo();
    }

    public void isFraudTestOne() {
        FraudRule5 test = new FraudRule5("banGermany");
        check(test.isFraud(new Transaction(new Trader("Pokemon", "Sidney", "Germany"), 100000)),"isFraudTestOne");
    }

    public void isFraudTestTwo() {
        FraudRule5 test = new FraudRule5("banGermany");
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
