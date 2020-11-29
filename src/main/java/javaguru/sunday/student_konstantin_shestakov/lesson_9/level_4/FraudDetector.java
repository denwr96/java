package main.java.javaguru.sunday.student_konstantin_shestakov.lesson_9.level_4;

// Task 17 - 21

class FraudDetector {

    boolean isFraud(Transaction transaction) {
        Trader trader = transaction.getTrader();

        if (trader.getFullName() == "Pokemon") {
//            System.out.println("Sorry, your transaction is blocked (code 1)");
            return true;
        } else {
            return false;
        }
    }

    boolean isFraudIfMoreThanMillion(Transaction transaction) {
        if (transaction.getAmount() > 1000000) {
//            System.out.println("Sorry, your transaction is blocked (code 2)");
            return true;
        } else {
            return false;
        }
    }

    boolean isFraudIfFromSydneyCity(Transaction transaction) {
        Trader trader = transaction.getTrader();

        if (trader.getCity() == "Sydney") {
//            System.out.println("Sorry, your transaction is blocked (code 3)");
            return true;
        } else {
            return false;
        }
    }

    boolean isFraudIfFromJamaicaCountry(Transaction transaction) {
        Trader trader = transaction.getTrader();

        if (trader.getCountry() == "Jamaica") {
//            System.out.println("Sorry, your transaction is blocked (code 4)");
            return true;
        } else {
            return false;
        }
    }

    boolean isFraudIfFromGermanyCountryAndMoreThanThousand(Transaction transaction) {
        Trader trader = transaction.getTrader();

        if (trader.getCountry() == "Germany" && transaction.getAmount() > 1000) {
//            System.out.println("Sorry, your transaction is blocked (code 5)");
            return true;
        } else {
            return false;
        }
    }

}
