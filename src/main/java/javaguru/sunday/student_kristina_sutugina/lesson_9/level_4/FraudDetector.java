package javaguru.sunday.student_kristina_sutugina.lesson_9.level_4;


import javaguru.sunday.teacher.annotations.CodeReview;
import javaguru.sunday.teacher.annotations.CodeReviewComment;

//Task_29
//Task_32
@CodeReview(approved = false)
@CodeReviewComment(comment = "Очень плохой стиль в методе isFraud. Мы говорили, что проверять на true в условии условного переходе не нужно, что джава сама оценит условие на true." +
        "for может быть заменен на расширенный for. " +
        "Как ваш код вообще работает? Вы сравниваете два объекта, которые пренадлежат разным классам? Почему идет сравнение наших правил и транзакции?")
class FraudDetector {

    FraudRule[] fraudRules = new FraudRule[5];

    FraudDetector() {
        fraudRules[0] = new FraudRule1("Fraud rule 1 ban Pokemon");
        fraudRules[1] = new FraudRule2("Fraud rule 2 ban more than 1000000");
        fraudRules[2] = new FraudRule3("Fraud rule 3 ban Sidney");
        fraudRules[3] = new FraudRule4("Fraud rule 4 ban Jamaica");
        fraudRules[4] = new FraudRule5("Fraud rule 5 ban Germany & more >1000");
    }


    FraudDetectionResult isFraud(Transaction t) {
        for (FraudRule fraudRule : fraudRules) {
            if (fraudRule.isFraud(t)) {
                FraudDetectionResult fraudDetectionResult = new FraudDetectionResult(fraudRule.isFraud(t), fraudRule.getRuleName());
                System.out.println(t.toString() + " fraud rule " + fraudRule.getRuleName());
                return fraudDetectionResult;

            }

        }
        System.out.println("User is accepted");
        return new FraudDetectionResult(false, null);
    }
}