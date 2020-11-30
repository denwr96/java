package main.java.javaguru.sunday.student_artjom_proshkin.lesson_9.level_5_middle;


//Task_24
class FraudRule1Test {

    public static void main(String[] args) {
        FraudRule1Test test = new FraudRule1Test();
        test.pokemonIsFraudTest();
        test.notFraudTest();

    }

    FraudRule1 victim = new FraudRule1("PokemonFraud");

    void pokemonIsFraudTest() {
        Trader testTrader = new Trader("Pokemon", "New York", "USA");
        Transaction testTransaction = new Transaction(testTrader, 111);
        checkResult(victim.isFraud(testTransaction), "pokemonIsFraudTest");
    }

    void notFraudTest() {
        Trader testTrader = new Trader("Rocky", "New York", "USA");
        Transaction testTransaction = new Transaction(testTrader, 111);
        checkResult(!victim.isFraud(testTransaction), "notFraudTest");
    }

    void checkResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " PASSED !");
        } else {
            System.out.println(testName + " FAILED !");
        }
    }
}
