package javaguru.sunday.student_jelena_lavrenuka.lesson_9.task_4;

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class Safe {
    public int pinCode;
    public int moneyAmount;

    public Safe(int pinCode, int moneyAmount) {
        this.pinCode = pinCode;
        this.moneyAmount = moneyAmount;
    }
}
