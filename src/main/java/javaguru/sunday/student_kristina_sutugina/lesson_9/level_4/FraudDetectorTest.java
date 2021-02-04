package javaguru.sunday.student_kristina_sutugina.lesson_9.level_4;

import javaguru.sunday.teacher.annotations.CodeReview;
import javaguru.sunday.teacher.annotations.CodeReviewComment;

import java.util.Objects;
//
@CodeReview(approved = false)
@CodeReviewComment(comment = "Этот тест ничего не тестирует. У вас не правильная логика в классе FraudDetector, а тест это не может показать.")
class FraudDetectorTest {
    public static void main(String[] args) {
        FraudDetectorTest fraudDetectorTest = new FraudDetectorTest();
        fraudDetectorTest.detectFraudOneIsOK();
        fraudDetectorTest.detectFraudOneIsBanned();
        fraudDetectorTest.detectFraudTwoIsBanned();
        fraudDetectorTest.detectFraudThreeIsBanned();
        fraudDetectorTest.detectFraudFourIsBanned();
        fraudDetectorTest.detectFraudFiveIsOK();
        fraudDetectorTest.detectFraudFiveIsBanned();
    }

    public void detectFraudOneIsOK() {
        Trader trader = new Trader("Alan", "Riga");
        Transaction t = new Transaction(trader, 10);
        FraudDetector fraudDetector = new FraudDetector();
        fraudDetector.isFraud(t);
    }

    public void detectFraudOneIsBanned() {
        Trader trader = new Trader("Pokemon", "Riga");
        Transaction t = new Transaction(trader, 10);
        FraudDetector fraudDetector = new FraudDetector();
        fraudDetector.isFraud(t);
    }

    public void detectFraudTwoIsBanned() {
        Trader trader = new Trader("Alan", "Riga");
        Transaction t = new Transaction(trader, 100000000);
        FraudDetector fraud = new FraudDetector();
        fraud.isFraud(t);
    }

    public void detectFraudThreeIsBanned() {
        Trader trader = new Trader("Alan", "Sydney");
        Transaction t = new Transaction(trader, 10);
        FraudDetector fraud = new FraudDetector();
        fraud.isFraud(t);
    }

    public void detectFraudFourIsBanned() {
        Trader trader = new Trader("Alan", "Mandeville");
        Transaction t = new Transaction(trader, 10);
        FraudDetector fraud = new FraudDetector();
        fraud.isFraud(t);
    }

    public void detectFraudFiveIsOK() {
        Trader trader = new Trader("Alan", "Berlin");
        Transaction t = new Transaction(trader, 10);
        FraudDetector fraud = new FraudDetector();
        fraud.isFraud(t);
    }

    public void detectFraudFiveIsBanned() {
        Trader trader = new Trader("Alan", "Berlin");
        Transaction t = new Transaction(trader, 100000);
        FraudDetector fraud = new FraudDetector();
        fraud.isFraud(t);
    }
}
   

