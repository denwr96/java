package main.java.javaguru.sunday.student_konstantin_shestakov.lesson_9.level_5_and_6;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;
import main.java.javaguru.sunday.teacher.annotations.CodeReviewComment;

// Task 30, 32 (level 6)
@CodeReview(approved = false)
@CodeReviewComment(comment = "Зачем вы добавляете закомментированный код? Когда вы пишите конструктор таким образом" +
        "вы совершаете не нужное действия, приравнивание значение переменной fraud в неё саму." +
        "Просто удалите эти конструкторы, если вам не надо создавать объекты сразу с каким-то параметрами." +
        "")
class FraudDetectionResult {

    private boolean fraud;
    private String ruleName;

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
