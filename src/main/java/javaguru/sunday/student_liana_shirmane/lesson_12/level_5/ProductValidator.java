package javaguru.sunday.student_liana_shirmane.lesson_12.level_5;
//task32
//task33

import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.List;
@CodeReview(approved = true)
interface ProductValidator {

    List<ValidationException> validate(Product product);

}