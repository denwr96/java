package javaguru.sunday.student_deniss_lobacs.lesson_9.level_4_5_6;

import javaguru.sunday.teacher.annotations.CodeReview;
import javaguru.sunday.teacher.annotations.CodeReviewComment;

import java.util.Arrays;
@CodeReview(approved = false)
@CodeReviewComment(comment = "А почему столько лишних методов в классе? Методы для тестов это очень плохая идея. Надо переделать.")
public class FraudDetector {

    private FraudRule[] fraudRules;

    public FraudDetector(FraudRule[] fraudRules) {
        this.fraudRules = fraudRules;
    }

    public FraudDetector() {

    }

    public FraudDetectionResult isFraud(Transaction t) {
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

    public boolean isFraud1(Transaction t) {
        Trader trader = t.getTrader();
        return trader.getFullName().equals("Pokemon");
    }

    public boolean isFraud2(Transaction t) {

        return t.getAmount() > 1000000;
    }

    public boolean isFraud3(Transaction t) {
        Trader trader = t.getTrader();
        return trader.getCity().equals("Sydney");
    }

    public boolean isFraud4(Transaction t) {
        Trader trader = t.getTrader();
        return trader.getCountry().equals("Jamaica");
    }

    public boolean isFraud5(Transaction t) {
        Trader trader = t.getTrader();
        return trader.getCountry().equals("Germany") && t.getAmount() > 10000;
    }

    @Override
    public String toString() {
        return "FraudDetector{" +
                "fraudRules=" + Arrays.toString(fraudRules) +
                '}';
    }
}
