package main.java.javaguru.sunday.student_konstantin_shestakov.lesson_9.level_5_and_6;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;
import main.java.javaguru.sunday.teacher.annotations.CodeReviewComment;

// Task 29 (level 5)
// Task 30, 32 (level 6)
@CodeReview(approved = false)
@CodeReviewComment(comment = "Зачем вы добавляете закомментированный код? Когда вы пишите конструктор таким образом" +
        "вы совершаете не нужное действия, приравнивание значение переменной fraud в неё саму." +
        "Просто удалите эти конструкторы, если вам не надо создавать объекты сразу с каким-то параметрами." +
        "")
class FraudDetector {

    FraudRule[] fraudRuleArray() {
        FraudRule[] fraudRule = new FraudRule[5];
        fraudRule[0] = new FraudRule1("Rule 1, 'Pokemon'");
        fraudRule[1] = new FraudRule2("Rule 2, '> 1 000 000'");
        fraudRule[2] = new FraudRule3("Rule 3, 'Sydney'");
        fraudRule[3] = new FraudRule4("Rule 4, 'Jamaica'");
        fraudRule[4] = new FraudRule5("Rule 5, 'Germany & > 1000'");
        return fraudRule;
    }

    FraudDetectionResult isFraud(Transaction transaction) {
        FraudRule[] fraudRule = fraudRuleArray();
        FraudDetectionResult fraudDetectionResult = new FraudDetectionResult();

        for (int i = 0; i < fraudRule.length; i++) {
            if(fraudRule[i].isFraud(transaction)) {
                fraudDetectionResult.setFraud(true);
                fraudDetectionResult.setRuleName(fraudRule[i].getRuleName());
                System.out.println(fraudDetectionResult.toString());
                System.out.println(transaction.toString());
                return fraudDetectionResult;
            }
        }
        return fraudDetectionResult;
    }
}
