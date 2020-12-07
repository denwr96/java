package main.java.javaguru.sunday.student_artjom_proshkin.lesson_9.level_4_junior;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

//Task_17, Task_18, Task_19, Task_20, Task_21
@CodeReview(approved = true)
class FraudDetectorTest {

    public static void main(String[] args) {
        FraudDetectorTest test = new FraudDetectorTest();
        test.pokemonIsFraudTest();
        test.moreThenMillionTest();
        test.transactionFromSidneyTest();
        test.transactionFromJamaicaTest();
        test.transactionFromGermanyTest();
    }

    FraudDetector victim = new FraudDetector();

    void pokemonIsFraudTest() {
        Trader testTrader = new Trader("Pokemon", "New York","USA");
        Transaction testTransaction = new Transaction(testTrader, 111);
        checkResult(victim.isFraud(testTransaction), "pokemonIsFraud");
    }

    void moreThenMillionTest(){
        Trader testTrader = new Trader("Pikachu","Tokyo","Japan");
        Transaction testTransaction = new Transaction(testTrader,1000001);
        checkResult(victim.isFraud(testTransaction),"moreThenMillionTest");
    }

    void transactionFromSidneyTest(){
        Trader testTrader = new Trader("Hugh","Sidney", "Australia");
        Transaction testTransaction = new Transaction(testTrader,50);
        checkResult(victim.isFraud(testTransaction),"transactionFromSidneyTest");
    }
    void transactionFromJamaicaTest (){
        Trader testTrader = new Trader("Bolt","Kingston", "Jamaica");
        Transaction testTransaction = new Transaction(testTrader,500);
        checkResult(victim.isFraud(testTransaction),"transactionFromJamaicaTest");
    }
    void transactionFromGermanyTest (){
        Trader testTrader = new Trader("Van Beethoven","Bonn", "Germany");
        Transaction testTransaction = new Transaction(testTrader,1001);
        checkResult(victim.isFraud(testTransaction),"transactionFromGermanyTest");
    }

    void checkResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " PASSED !");
        } else {
            System.out.println(testName + " FAILED !");
        }
    }
}
