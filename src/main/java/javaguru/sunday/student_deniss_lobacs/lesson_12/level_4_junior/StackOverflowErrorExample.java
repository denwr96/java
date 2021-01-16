package javaguru.sunday.student_deniss_lobacs.lesson_12.level_4_junior;

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class StackOverflowErrorExample {
    public static void main(String[] args) {
        StackOverflowErrorExample.recursivePrint(1);
    }

    public static void recursivePrint(int num) {
        System.out.println("Number: " + num);

        if (num == 0)
            return;
        else
            recursivePrint(++num);
    }
}
