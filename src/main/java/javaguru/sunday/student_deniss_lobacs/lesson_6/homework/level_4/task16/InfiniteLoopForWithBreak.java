package javaguru.sunday.student_deniss_lobacs.lesson_6.homework.level_4.task16;

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class InfiniteLoopForWithBreak {
    public static void main(String[] args) {
        for ( ; ; ) {
            System.out.println("Hello");
            break;
        }
    }
}
