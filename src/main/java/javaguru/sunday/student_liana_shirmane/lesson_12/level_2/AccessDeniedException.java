package javaguru.sunday.student_liana_shirmane.lesson_12.level_2;

import javaguru.sunday.teacher.annotations.CodeReview;

//task11
@CodeReview(approved = true)
public class AccessDeniedException extends Exception {
    public AccessDeniedException(String message) {
        super(message);
    };

}