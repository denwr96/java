package javaguru.sunday.student_sergej_savkin.lesson_12.level_5_middle.task_27_48;

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
interface FieldValidationRule {

    void validate(Product product) throws ValidationException;

}
