package javaguru.sunday.student_deniss_lobacs.lesson_9.level_1_intern.task5;

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class Demo {

    public static void main(String[] args) {
        SafeV2 safe = new SafeV2(0000, 0);
        safe.putMoneyAmount(0000,100);
        System.out.println(safe.getMoneyAmount());
    }
}
