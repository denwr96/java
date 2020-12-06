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

        if (trader.getFullName() == "Pokemon") {
            return true;
        } else {
            return false;
        }
    }

    boolean isFraudIfMoreThanMillion(Transaction transaction) {
        if (transaction.getAmount() > 1000000) {
            return true;
        } else {
            return false;
        }
    }

    boolean isFraudIfFromSydneyCity(Transaction transaction) {
        Trader trader = transaction.getTrader();

        if (trader.getCity() == "Sydney") {
            return true;
        } else {
            return false;
        }
    }

    boolean isFraudIfFromJamaicaCountry(Transaction transaction) {
        Trader trader = transaction.getTrader();

        if (trader.getCountry() == "Jamaica") {
            return true;
        } else {
            return false;
        }
    }

    boolean isFraudIfFromGermanyCountryAndMoreThanThousand(Transaction transaction) {
        Trader trader = transaction.getTrader();

        if (trader.getCountry() == "Germany" && transaction.getAmount() > 1000) {
            return true;
        } else {
            return false;
        }
    }

}
