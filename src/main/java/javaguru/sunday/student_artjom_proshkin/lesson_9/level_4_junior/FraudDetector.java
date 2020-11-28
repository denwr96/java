package main.java.javaguru.sunday.student_artjom_proshkin.lesson_9.level_4_junior;

//Task_17, Task_18, Task_19, Task_20, Task_21
class FraudDetector {

    boolean isFraud(Transaction transaction) {
        Trader traderInfo = transaction.getTrader();
        if (traderInfo.getFullName().equals("Pokemon")) {
            return true;
        } else if (transaction.getAmount() > 1000000) {
            return true;
        } else if (traderInfo.getCity().equals("Sidney")) {
            return true;
        } else if (traderInfo.getCountry().equals("Jamaica")) {
            return true;
        } else if (traderInfo.getCountry().equals("Germany") && transaction.getAmount() >= 1000){
            return true;
        }
            return false;


    }

}

