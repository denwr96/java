package main.java.javaguru.sunday.student_nataliya_sinitsa.lesson9.level5task22;

class FraudDetectorTest {

    public static void main(String[] args) {
        FraudDetectorTest test = new FraudDetectorTest();
        test.shouldBeFalseByTraderNameAmountCity();
        test.shouldBeTrueByTraderName();
        test.shouldBeTrueByAmount();
        test.shouldBeTrueByCity();
        test.shouldBeTrueByCountry();
        test.shouldBeFalseByAmountGermany();
        test.shouldBeFalseByCountryGermany();
        test.shouldBeTrueByCountryAndAmountGermany();
    }

    public void shouldBeFalseByTraderNameAmountCity() {
        FraudDetector victim = new FraudDetector();
        Trader testTrader = new Trader("Poke", "London", "UK");
        Transaction testTransaction = new Transaction(testTrader, 100);
        check(!victim.isFraud(testTransaction), "shouldBeFalseByTraderNameAndAmount");
    }

    public void shouldBeTrueByTraderName() {
        FraudDetector victim = new FraudDetector();
        Trader testTrader = new Trader("Pokemon", "London", "UK");
        Transaction testTransaction = new Transaction(testTrader, 100);
        check(victim.isFraud(testTransaction), "shouldBeTrueByTraderName");
    }

    public void  shouldBeTrueByAmount() {
        FraudDetector victim = new FraudDetector();
        Trader testTrader = new Trader("Poke", "London", "UK");
        Transaction testTransaction = new Transaction(testTrader, 1000001);
        check(victim.isFraud(testTransaction), "shouldBeTrueByAmount");
    }

    public void shouldBeTrueByCity() {
        FraudDetector victim = new FraudDetector();
        Trader testTrader = new Trader("Poke", "Sidney", "Australia");
        Transaction testTransaction = new Transaction(testTrader, 100);
        check(victim.isFraud(testTransaction), "shouldBeTrueByCity");
    }

    public void shouldBeTrueByCountry() {
        FraudDetector victim = new FraudDetector();
        Trader testTrader = new Trader("Poke", "unknown", "Jamaica");
        Transaction testTransaction = new Transaction(testTrader, 100);
        check(victim.isFraud(testTransaction), "shouldBeTrueByCountry");
    }

    public void shouldBeFalseByAmountGermany() {
        FraudDetector victim = new FraudDetector();
        Trader testTrader = new Trader("Poke", "Bremen", "Germany");
        Transaction testTransaction = new Transaction(testTrader, 100);
        check(!victim.isFraud(testTransaction), "shouldBeFalseByAmountGermany");
    }

    public void shouldBeFalseByCountryGermany() {
        FraudDetector victim = new FraudDetector();
        Trader testTrader = new Trader("Poke", "Bremen", "Gerrmany");
        Transaction testTransaction = new Transaction(testTrader, 1001);
        check(!victim.isFraud(testTransaction), "shouldBeFalseByCountryGermany");
    }

    public  void shouldBeTrueByCountryAndAmountGermany() {
        FraudDetector victim = new FraudDetector();
        Trader testTrader = new Trader("Poke", "Bremen", "Germany");
        Transaction testTransaction = new Transaction(testTrader, 1001);
        check(victim.isFraud(testTransaction), "shouldBeTrueByCountryAndAmountGermany");
    }


    public void check(boolean actualResult, String testName) {
        if (actualResult) {
            System.out.println(testName + " has passed!");
        } else {
            System.out.println(testName + " failed!");
        }
    }

}
