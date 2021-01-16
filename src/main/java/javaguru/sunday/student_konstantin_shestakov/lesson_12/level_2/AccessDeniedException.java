package javaguru.sunday.student_konstantin_shestakov.lesson_12.level_2;

import javaguru.sunday.teacher.annotations.CodeReview;

// Task 11
@CodeReview(approved = true)
class AccessDeniedException extends Exception {

    public AccessDeniedException(String message) {
        super(message);
    }
}
