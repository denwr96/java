package main.java.javaguru.sunday.student_konstantin_shestakov.lesson_9.level_4;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;
import main.java.javaguru.sunday.teacher.annotations.CodeReviewComment;

// Task 17 - 21
@CodeReview(approved = false)
@CodeReviewComment(comment = "Сравнивать строки необходимо через метод .equals." +
        "Этот класс должен пропустить транзакцию через все проверки, но сделать это надо внутри. Подали транзакцию, " +
        "она прошла через все проверки внутри FraudDetector и тот вернул вам результат проверки. ")
class FraudDetector {

    boolean isFraud(Transaction transaction) {
        Trader trader = transaction.getTrader();

        if (trader.getFullName().equals("Pokemon")) {
            return true;
        }
        else if (transaction.getAmount() > 1000000) {
            return true;
        }
        else if (trader.getCity().equals("Sydney")) {
            return true;
        }
        else if (trader.getCountry().equals("Jamaica")) {
            return true;
        }
        else if (trader.getCountry().equals("Germany") && transaction.getAmount() > 1000) {
            return true;
        } else {
            return false;
        }
    }
}
