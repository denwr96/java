package main.java.javaguru.sunday.student_liana_shirmane.lesson_9.level_6;
//task30

class FraudDetectionResult {

    private boolean fraud;
    private String ruleName;


    public boolean isFraud() {
        return fraud;
    }

    public void setFraud(boolean fraud) {
        this.fraud = fraud;
    }

    public String getRuleName() {
        return ruleName;
    }

    public void setRuleName(String ruleName) {
        this.ruleName = ruleName;
    }
}