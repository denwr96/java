package main.java.javaguru.sunday.student_jelena_lavrenuka.lesson_9.SingleResponsibilityPrinciple;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;
import main.java.javaguru.sunday.teacher.annotations.CodeReviewComment;

@CodeReview(approved = true)
@CodeReviewComment(comment = "А если вы подадите в такой метод транзакцию, у которой Trader будет null, то у вас будет ошибка :P")
class FraudRule4 extends FraudRule {

    public FraudRule4(String ruleName) {
        super(ruleName);
    }

    public boolean isFraud(Transaction t) {
        String country = t.getTrader().getCountry();
        return (country.equals("Jamaica"));
    }

    @Override
    public String getRuleName() {
        return ruleName;
    }
}
