package javaguru.sunday.student_artjom_proshkin.lesson_9.level_5_middle;


import javaguru.sunday.teacher.annotations.CodeReview;

//Task_17, Task_18, Task_19, Task_20, Task_21
//Task_29, Task_32, Task_33
@CodeReview(approved = true)
class FraudDetectorTest {

    public static void main(String[] args) {
        FraudDetectorTest test = new FraudDetectorTest();
        test.pokemonIsFraudTest();
        System.out.println();
        test.notAFraudTest();
        System.out.println();
        test.moreThanMillionTest();
        System.out.println();
        test.transactionFromSydneyTest();
        System.out.println();
        test.transactionFromJamaicaTest();
        System.out.println();
        test.transactionFromGermanyTest();
    }

    FraudDetector victim = new FraudDetector();

    void pokemonIsFraudTest() {
        System.out.println("Expected = PokemonFraud");
        Trader testTrader = new Trader("Pokemon", "New York", "USA");
        Transaction testTransaction = new Transaction(testTrader, 111);
        victim.isFraud(testTransaction);

    }

    void notAFraudTest() {
        System.out.println("Not A Fraud Test");
        Trader testTrader = new Trader("Bob", "New York", "USA");
        Transaction testTransaction = new Transaction(testTrader, 111);
        victim.isFraud(testTransaction);

    }

    void moreThanMillionTest() {
        Trader testTrader = new Trader("Pikachu", "Tokyo", "Japan");
        Transaction testTransaction = new Transaction(testTrader, 1000001);
        victim.isFraud(testTransaction);

    }

    void transactionFromSydneyTest() {
        Trader testTrader = new Trader("Hugh", "Sydney", "Australia");
        Transaction testTransaction = new Transaction(testTrader, 50);
        victim.isFraud(testTransaction);

    }

    void transactionFromJamaicaTest() {
        Trader testTrader = new Trader("Bolt", "Kingston", "Jamaica");
        Transaction testTransaction = new Transaction(testTrader, 500);
        victim.isFraud(testTransaction);

    }

    void transactionFromGermanyTest() {
        Trader testTrader = new Trader("Van Beethoven", "Bonn", "Germany");
        Transaction testTransaction = new Transaction(testTrader, 1001);
        victim.isFraud(testTransaction);

    }

}
