package main.java.javaguru.sunday.student_kristina_sutugina.lesson_9.level_4;


import main.java.javaguru.sunday.teacher.annotations.CodeReview;
import main.java.javaguru.sunday.teacher.annotations.CodeReviewComment;

//Task_29
@CodeReview(approved = false)
@CodeReviewComment(comment = "Очень плохой стиль в методе isFraud. Мы говорили, что проверять на true в условии условного переходе не нужно, что джава сама оценит условие на true." +
        "for может быть заменен на расширенный for. " +
        "Как ваш код вообще работает? Вы сравниваете два объекта, которые пренадлежат разным классам? Почему идет сравнение наших правил и транзакции?")
class FraudDetector {
    FraudRule[] fraudRule;

    public FraudDetector(FraudRule[] fraudRule) {
        this.fraudRule = fraudRule;
    }


    boolean isFraud(Transaction t) {
        for (int i = 0; i < fraudRule.length; i++) {
            if (fraudRule[i].equals(t)) {
                if (t.equals(true)) {
                    return true;
                } else {
                    return false;
                }
            }

        }
        return false;
    }

}