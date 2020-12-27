package javaguru.sunday.student_deniss_lobacs.lesson_9.level_1_intern.task4;

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class SafeDemo {

    public static void main(String[] args) {
        Safe safeDemo = new Safe();
        System.out.println(safeDemo.pinCode);
        System.out.println(safeDemo.moneyAmount);
    }
}
