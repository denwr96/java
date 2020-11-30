package main.java.javaguru.sunday.student_artjom_proshkin.lesson_9.level_5_middle;


//Task_27
class FraudRule4Test {
    public static void main(String[] args) {
        FraudRule4Test test = new FraudRule4Test();
        test.transactionFromJamaicaTest();
        test.transactionFromUKTest();
    }

    FraudRule4 victim = new FraudRule4("JamaicaFraud");

    void transactionFromJamaicaTest() {
        Trader testTrader = new Trader("Bolt", "Kingston", "Jamaica");
        Transaction testTransaction = new Transaction(testTrader, 500);
        checkResult(victim.isFraud(testTransaction), "transactionFromJamaicaTest");
    }

    void transactionFromUKTest() {
        Trader testTrader = new Trader("Bolt", "Coventry", "UK");
        Transaction testTransaction = new Transaction(testTrader, 500);
        checkResult(!victim.isFraud(testTransaction), "transactionFromUKTest");
    }


    void checkResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " PASSED !");
        } else {
            System.out.println(testName + " FAILED !");
        }
    }
}
