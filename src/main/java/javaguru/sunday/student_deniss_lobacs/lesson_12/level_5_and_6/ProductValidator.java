package javaguru.sunday.student_deniss_lobacs.lesson_12.level_5_and_6;

import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.List;
@CodeReview(approved = true)
public interface ProductValidator {
    List<ValidationException> validate(Product product);
}
