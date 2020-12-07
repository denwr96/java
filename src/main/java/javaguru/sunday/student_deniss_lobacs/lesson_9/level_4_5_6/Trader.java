package main.java.javaguru.sunday.student_deniss_lobacs.lesson_9.level_4_5_6;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;
import main.java.javaguru.sunday.teacher.annotations.CodeReviewComment;

import java.util.Arrays;

// task17, task18, task19, task20, task21, task22, task23, task24, task25, task26, task27, task28 , task29, task30, task31, task32, task33;
@CodeReview(approved = false)
@CodeReviewComment(comment = "Разбить на раздельные классы. Не нужно тут писать классы второго уровня.")
class Trader {

    private String fullName;
    private String city;
    private String country;

    public Trader(String fullName, String city, String country) {
        this.fullName = fullName;
        this.city = city;
        this.country = country;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Trader{" +
                "fullName='" + fullName + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}

class Transaction {
    public Transaction(Trader trader, int amount) {
        this.trader = trader;
        this.amount = amount;
    }

    public Transaction() {

    }

    private Trader trader;
    private int amount;

    public Trader getTrader() {
        return trader;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "trader=" + trader +
                ", amount=" + amount +
                '}';
    }
}

class FraudDetector {

    private FraudRule[] fraudRules;

    public FraudDetector(FraudRule[] fraudRules) {
        this.fraudRules = fraudRules;
    }

    public FraudDetector() {

    }

    FraudDetectionResult isFraud(Transaction t) {
        FraudDetectionResult fraudDetectionResult = new FraudDetectionResult();
        for (FraudRule fraudRule : fraudRules) {
            if (fraudRule.isFraud(t)) {
                fraudDetectionResult.setFraud(true);
                fraudDetectionResult.setRuleName(fraudRule.getRuleName());
                System.out.println("Rule name detect : " +  fraudRule.getRuleName());
                System.out.println(fraudDetectionResult.toString());
                System.out.println(t.toString());
            }
        }
        return fraudDetectionResult;
    }

    boolean isFraud1(Transaction t) {
        Trader trader = t.getTrader();
        if (trader.getFullName().equals("Pokemon")) {
            return true;
        }
        return false;
    }

    boolean isFraud2(Transaction t) {

        if (t.getAmount() > 1000000) {
            return true;
        }
        return false;
    }

    boolean isFraud3(Transaction t) {
        Trader trader = t.getTrader();
        if (trader.getCity().equals("Sydney")) {
            return true;
        }
        return false;
    }

    boolean isFraud4(Transaction t) {
        Trader trader = t.getTrader();
        if (trader.getCountry().equals("Jamaica")) {
            return true;
        }
        return false;
    }

    boolean isFraud5(Transaction t) {
        Trader trader = t.getTrader();
        if (trader.getCountry().equals("Germany") && t.getAmount() > 10000) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "FraudDetector{" +
                "fraudRules=" + Arrays.toString(fraudRules) +
                '}';
    }
}

class FraudDetectionResult {

    private boolean fraud;
    private String ruleName;

    public FraudDetectionResult() {
        this.fraud = fraud;
        this.ruleName = ruleName;
    }

    public boolean isFraud() {
        return fraud;
    }

    public String getRuleName() {
        return ruleName;
    }

    public boolean getFraud() {
        return fraud;
    }

    public void setFraud(boolean fraud) {
        this.fraud = fraud;
    }

    public void setRuleName(String ruleName) {
        this.ruleName = ruleName;
    }

    @Override
    public String toString() {
        return "FraudDetectionResult{" +
                "fraud=" + fraud +
                ", ruleName='" + ruleName + '\'' +
                '}';
    }
}

abstract class FraudRule {

    private String ruleName;

    public FraudRule(String ruleName) {
        this.ruleName = ruleName;
    }

    public String getRuleName() {
        return ruleName;
    }

    public abstract boolean isFraud(Transaction t);

}

class FraudRule1 extends FraudRule {

    public FraudRule1(String ruleName) {
        super(ruleName);
    }

    @Override
    public boolean isFraud(Transaction t) {
        Trader trader = t.getTrader();
        if (trader.getFullName().equals("Pokemon")) {
            return true;
        }
        return false;
    }

}

class FraudRule2 extends FraudRule {

    public FraudRule2(String ruleName) {
        super(ruleName);
    }

    @Override
    public boolean isFraud(Transaction t) {
        if (t.getAmount() > 1000000) {
            return true;
        }
        return false;
    }

}

class FraudRule3 extends FraudRule {

    public FraudRule3(String ruleName) {
        super(ruleName);
    }

    @Override
    public boolean isFraud(Transaction t) {
        Trader trader = t.getTrader();
        if (trader.getCity().equals("Sydney")) {
            return true;
        }
        return false;
    }

}

class FraudRule4 extends FraudRule {

    public FraudRule4(String ruleName) {
        super(ruleName);
    }

    @Override
    public boolean isFraud(Transaction t) {
        Trader trader = t.getTrader();
        if (trader.getCountry().equals("Jamaica")) {
            return true;
        }
        return false;
    }

}

class FraudRule5 extends FraudRule {

    public FraudRule5(String ruleName) {
        super(ruleName);
    }

    @Override
    public boolean isFraud(Transaction t) {
        Trader trader = t.getTrader();
        if (trader.getCountry().equals("Germany") && t.getAmount() > 10000) {
            return true;
        }
        return false;
    }

}
