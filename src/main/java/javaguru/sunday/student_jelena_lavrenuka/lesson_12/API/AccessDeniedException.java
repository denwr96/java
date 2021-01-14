package javaguru.sunday.student_jelena_lavrenuka.lesson_12.API;

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class AccessDeniedException extends Exception {

    public AccessDeniedException(String message) {
        super(message);
    }

}
