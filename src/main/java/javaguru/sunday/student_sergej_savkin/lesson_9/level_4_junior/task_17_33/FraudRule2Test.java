package javaguru.sunday.student_sergej_savkin.lesson_9.level_4_junior.task_17_33;

import javaguru.sunday.teacher.annotations.CodeReview;

//task25
@CodeReview(approved = true)
class FraudRule2Test {

    public static void main(String[] args) {
        FraudRule2Test fraudRule2Test = new FraudRule2Test();
        fraudRule2Test.isFraudTestOne();
        fraudRule2Test.isFraudTestTwo();
    }

    public void isFraudTestOne() {
        FraudRule2 test = new FraudRule2("moreThan1000000");
        check(test.isFraud(new Transaction(new Trader("Pokemon", "Riga", "Latvia"), 1000001)),"isFraudTestOne");
    }

    public void isFraudTestTwo() {
        FraudRule2 test = new FraudRule2("moreThan1000000");
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
