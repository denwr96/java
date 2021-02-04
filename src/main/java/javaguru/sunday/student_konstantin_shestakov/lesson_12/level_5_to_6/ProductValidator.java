package javaguru.sunday.student_konstantin_shestakov.lesson_12.level_5_to_6;

// Task 32, 33

import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.List;
@CodeReview(approved = true)
interface ProductValidator {

    List<ValidationException> validate(Product product);

}
