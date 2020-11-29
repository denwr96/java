package main.java.javaguru.sunday.student_sergej_savkin.lesson_9.level_4_junior.task_17_33;

//task24

public class FraudRule1Test {
    public static void main(String[] args) {
        FraudRule1Test fraudRule1Test = new FraudRule1Test();
        fraudRule1Test.isFraudTestOne();
        fraudRule1Test.isFraudTestTwo();
    }

    public void isFraudTestOne() {
        FraudRule1 test = new FraudRule1("banPokemon");
        check(test.isFraud(new Transaction(new Trader("Pokemon", "Riga", "Latvia"), 100)),"isFraudTestOne");
    }

    public void isFraudTestTwo() {
        FraudRule1 test = new FraudRule1("banPokemon");
        check(!test.isFraud(new Transaction(new Trader("notPokemon", "Riga", "Latvia"), 100)),"isFraudTestTwo");
    }

    public void check(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " OK!");
        } else {
            System.out.println(testName + " failed!");
        }
    }

}
