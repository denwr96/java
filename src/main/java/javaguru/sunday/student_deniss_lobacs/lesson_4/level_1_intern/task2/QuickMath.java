package main.java.javaguru.sunday.student_deniss_lobacs.lesson_4.level_1_intern.task2;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class QuickMath {

    public int function(int number) {

        if (number > 0){
            return 1;
        } else if (number == 0) {
            return 0;
        } else {
            return -1;
        }
    }


}