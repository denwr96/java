package main.java.javaguru.sunday.student_konstantin_shestakov.lesson_9.level_5_and_6;

// Task 30, 32 (level 6)

class FraudDetectionResult {

    private boolean fraud;
    private String ruleName;

    FraudDetectionResult() {
        this.fraud = fraud;
        this.ruleName = ruleName;
    }

    public boolean isFraud() {
        return fraud;
    }

    public String getRuleName() {
        return ruleName;
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
