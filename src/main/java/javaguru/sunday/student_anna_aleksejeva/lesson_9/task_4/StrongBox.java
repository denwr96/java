package javaguru.sunday.student_anna_aleksejeva.lesson_9.task_4;

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class StrongBox {

    public int pinCode;
    public int moneyAmount;

    public StrongBox (int pinCode, int moneyAmount ){
        this.pinCode = pinCode;
        this.moneyAmount = moneyAmount;
    }
}
