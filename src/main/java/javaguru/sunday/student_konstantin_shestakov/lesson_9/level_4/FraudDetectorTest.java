package javaguru.sunday.student_konstantin_shestakov.lesson_9.level_4;

import javaguru.sunday.teacher.annotations.CodeReview;
import javaguru.sunday.teacher.annotations.CodeReviewComment;

// Task 17 - 21
@CodeReview(approved = true)
public class FraudDetectorTest {

    public static void main(String[] args) {
        FraudDetectorTest test = new FraudDetectorTest();
        test.isFraudTest();
        test.isFraudIfMoreThanMillionTest();
        test.isFraudIfFromSydneyCityTest();
        test.isFraudIfFromJamaicaCountryTest();
        test.isFraudIfFromGermanyCountryAndMoreThanThousandTest();
    }

    void isFraudTest() {
        Trader traderPokemon = new Trader("Pokemon", "Tokyo", "Japan");
        Transaction transaction = new Transaction(traderPokemon, 100);
        FraudDetector fraudDetector = new FraudDetector();
        checkResults(fraudDetector.isFraud(transaction), "'Pokemon' fraud detector rule 1 test");
    }

    void isFraudIfMoreThanMillionTest() {
        Trader traderPokemon = new Trader("Kojima", "Tokyo", "Japan");
        Transaction transaction = new Transaction(traderPokemon, 1000001);
        FraudDetector fraudDetector = new FraudDetector();
        checkResults(fraudDetector.isFraud(transaction), "'> 1 000 000' fraud detector rule 2 test");
    }

    void isFraudIfFromSydneyCityTest() {
        Trader traderKenguroff = new Trader("Kenguroff", "Sydney", "Australia");
        Transaction transaction = new Transaction(traderKenguroff, 1000);
        FraudDetector fraudDetector = new FraudDetector();
        checkResults(fraudDetector.isFraud(transaction), "'Sydney' fraud detector rule 3 test");
    }

    void isFraudIfFromJamaicaCountryTest() {
        Trader traderJamaica = new Trader("Bob Marley", "Kingston", "Jamaica");
        Transaction transaction = new Transaction(traderJamaica, 1000);
        FraudDetector fraudDetector = new FraudDetector();
        checkResults(fraudDetector.isFraud(transaction), "'Jamaica' fraud detector rule 4 test");
    }

    void isFraudIfFromGermanyCountryAndMoreThanThousandTest() {
        Trader traderGermany = new Trader("Kolodzej", "Hamburg", "Germany");
        Transaction transaction = new Transaction(traderGermany, 1001);
        FraudDetector fraudDetector = new FraudDetector();
        checkResults(fraudDetector.isFraud(transaction), "'Germany & > 1000' fraud detector rule 5 test");
    }

    public void checkResults(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK \n");
        } else {
            System.out.println(testName + " = FAIL \n");
        }
    }
}
