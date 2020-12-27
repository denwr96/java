package javaguru.sunday.student_artjom_proshkin.lesson_9.level_5_middle;


//Task_25
class FraudRule2Test {

    public static void main(String[] args) {
        FraudRule2Test test = new FraudRule2Test();
        test.moreThanMillionTest();
        test.lessThanMillionTest();
    }

    FraudRule2 victim = new FraudRule2("moreThanMillionFraud");

    void moreThanMillionTest() {
        Trader testTrader = new Trader("Pikachu", "Tokyo", "Japan");
        Transaction testTransaction = new Transaction(testTrader, 1000001);
        checkResult(victim.isFraud(testTransaction), "moreThanMillionTest");
    }

    void lessThanMillionTest() {
        Trader testTrader = new Trader("Pikachu", "Tokyo", "Japan");
        Transaction testTransaction = new Transaction(testTrader, 999999);
        checkResult(!victim.isFraud(testTransaction), "lessThanMillionTest");
    }

    void checkResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " PASSED !");
        } else {
            System.out.println(testName + " FAILED !");
        }
    }

}
