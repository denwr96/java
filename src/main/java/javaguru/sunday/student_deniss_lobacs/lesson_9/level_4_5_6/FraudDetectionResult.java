package javaguru.sunday.student_deniss_lobacs.lesson_9.level_4_5_6;

import javaguru.sunday.teacher.annotations.CodeReview;
import javaguru.sunday.teacher.annotations.CodeReviewComment;

@CodeReview(approved = true)
public class FraudDetectionResult {

    private boolean fraud;
    private String ruleName;

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
