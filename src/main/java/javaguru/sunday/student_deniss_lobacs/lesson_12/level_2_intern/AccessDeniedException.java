package javaguru.sunday.student_deniss_lobacs.lesson_12.level_2_intern;

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class AccessDeniedException extends Exception {

    public AccessDeniedException(String message) {
        super(message);
    }

}
