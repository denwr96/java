package main.java.javaguru.sunday.student_konstantin_shestakov.lesson_9.level_4;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;
import main.java.javaguru.sunday.teacher.annotations.CodeReviewComment;

// Task 17 - 21
@CodeReview(approved = false)
@CodeReviewComment(comment = "Зачем checkResults возвращает значение, которое вы не используете?")
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
        Trader traderPokemon = new Trader("Pokemon", "Tokyo");
        Transaction transaction = new Transaction(traderPokemon, 100);
        FraudDetector fraudDetector = new FraudDetector();
        checkResults(fraudDetector.isFraud(transaction), "'Pokemon' fraud detector rule 1 test");
    }

    void isFraudIfMoreThanMillionTest() {
        Trader traderPokemon = new Trader("Kojima", "Tokyo");
        Transaction transaction = new Transaction(traderPokemon, 1000001);
        FraudDetector fraudDetector = new FraudDetector();
        checkResults(fraudDetector.isFraudIfMoreThanMillion(transaction), "'> 1 000 000' fraud detector rule 2 test");
    }

    void isFraudIfFromSydneyCityTest() {
        Trader traderKenguroff = new Trader("Kenguroff", "Sydney");
        Transaction transaction = new Transaction(traderKenguroff, 1000);
        FraudDetector fraudDetector = new FraudDetector();
        checkResults(fraudDetector.isFraudIfFromSydneyCity(transaction), "'Sydney' fraud detector rule 3 test");
    }

    void isFraudIfFromJamaicaCountryTest() {
        Trader traderJamaica = new Trader("Jamaica");
        Transaction transaction = new Transaction(traderJamaica, 1000);
        FraudDetector fraudDetector = new FraudDetector();
        checkResults(fraudDetector.isFraudIfFromJamaicaCountry(transaction), "'Jamaica' fraud detector rule 4 test");
    }

    void isFraudIfFromGermanyCountryAndMoreThanThousandTest() {
        Trader traderGermany = new Trader("Germany");
        Transaction transaction = new Transaction(traderGermany, 1001);
        FraudDetector fraudDetector = new FraudDetector();
        checkResults(fraudDetector.isFraudIfFromGermanyCountryAndMoreThanThousand(transaction), "'Germany & > 1000' fraud detector rule 5 test");
    }

    public boolean checkResults(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK \n");
            return condition;
        } else {
            System.out.println(testName + " = FAIL \n");
            return !condition;
        }
    }
}
