package javaguru.sunday.student_konstantin_shestakov.lesson_12.level_5_to_6;

import javaguru.sunday.teacher.annotations.CodeReview;

// Task 36
@CodeReview(approved = true)
interface FieldValidationRule {

    void validate(Product product) throws ValidationException;
}
