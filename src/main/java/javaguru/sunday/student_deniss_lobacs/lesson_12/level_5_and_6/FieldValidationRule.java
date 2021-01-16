package javaguru.sunday.student_deniss_lobacs.lesson_12.level_5_and_6;

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
public interface FieldValidationRule {

    void validate(Product product) throws ValidationException;

}
