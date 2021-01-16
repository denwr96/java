package javaguru.sunday.student_deniss_lobacs.lesson_12.level_1_intern.task4;

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }
}
