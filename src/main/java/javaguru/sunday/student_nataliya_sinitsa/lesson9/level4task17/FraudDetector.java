package main.java.javaguru.sunday.student_nataliya_sinitsa.lesson9.level4task17;

//Task 17 --> Task 21

class FraudDetector {

    boolean isFraud(Transaction t) {
        if (t.getTrader().getFullName().equals("Pokemon")) {
            return true;
        } else if (t.getAmount() > 1000000) {
            return true;
        } else if (t.getTrader().getCity().equals("Sidney")) {
            return true;
        } else if (t.getTrader().getCountry().equals("Jamaica")) {
            return true;
        } else if (t.getTrader().getCountry().equals("Germany") && t.getAmount() > 1000) {
            return true;
        } else {
            return false;
        }
    }

}
