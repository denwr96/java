package javaguru.sunday.student_anna_aleksejeva.lesson_9.task_5;

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = false)
public class StrongBox2Demo {

    public static void main(String[] args) {
        StrongBox2 myStrongBox = new StrongBox2(3456, 19999);
        myStrongBox.getMoney(3456,100);
        myStrongBox.putMoney(3456);
    }
}
