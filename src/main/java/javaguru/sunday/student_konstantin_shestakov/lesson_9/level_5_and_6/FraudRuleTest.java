package main.java.javaguru.sunday.student_konstantin_shestakov.lesson_9.level_5_and_6;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;
import main.java.javaguru.sunday.teacher.annotations.CodeReviewComment;

// Task 24 - 28 (level 5)
@CodeReview(approved = false)
@CodeReviewComment(comment = "Зачем checkResults возвращает значение, которое вы не используете?")
public class FraudRuleTest {

    public static void main(String[] args) {
        FraudRuleTest test = new FraudRuleTest();
        test.isFraudTest();
        test.isFraudIfMoreThanMillionTest();
        test.isFraudIfFromSydneyCityTest();
        test.isFraudIfFromJamaicaCountryTest();
        test.isFraudIfFromGermanyCountryAndMoreThanThousandTest();
    }

    void isFraudTest() {
        Trader traderPokemon = new Trader("Pokemon", "Tokyo", "Japan");
        Transaction transaction = new Transaction(traderPokemon, 100);
        FraudRule1 fraudRule1 = new FraudRule1("Pokemon");
        checkResults(fraudRule1.isFraud(transaction), "'Pokemon' fraud detector rule 1 test");
    }

    void isFraudIfMoreThanMillionTest() {
        Trader traderPokemon = new Trader("Kojima", "Tokyo", "Japan");
        Transaction transaction = new Transaction(traderPokemon, 1000001);
        FraudRule2 fraudRule2 = new FraudRule2("> 1 000 000");
        checkResults(fraudRule2.isFraud(transaction), "'> 1 000 000' fraud detector rule 2 test");
    }

    void isFraudIfFromSydneyCityTest() {
        Trader traderKenguroff = new Trader("Kenguroff", "Sydney", "Australia");
        Transaction transaction = new Transaction(traderKenguroff, 1000);
        FraudRule3 fraudRule3 = new FraudRule3("Sydney");
        checkResults(fraudRule3.isFraud(transaction), "'Sydney' fraud detector rule 3 test");
    }

    void isFraudIfFromJamaicaCountryTest() {
        Trader traderJamaica = new Trader("Bob Marley", "Kingston", "Jamaica");
        Transaction transaction = new Transaction(traderJamaica, 1000);
        FraudRule4 fraudRule4 = new FraudRule4("Jamaica");
        checkResults(fraudRule4.isFraud(transaction), "'Jamaica' fraud detector rule 4 test");
    }

    void isFraudIfFromGermanyCountryAndMoreThanThousandTest() {
        Trader traderGermany = new Trader("Kolodzej", "Hamburg", "Germany");
        Transaction transaction = new Transaction(traderGermany, 1001);
        FraudRule5 fraudRule5 = new FraudRule5("Germany & > 1000");
        checkResults(fraudRule5.isFraud(transaction), "'Germany & > 1000' fraud detector rule 5 test");
    }

    public void checkResults(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK \n");
        } else {
            System.out.println(testName + " = FAIL \n");
        }
    }
}
