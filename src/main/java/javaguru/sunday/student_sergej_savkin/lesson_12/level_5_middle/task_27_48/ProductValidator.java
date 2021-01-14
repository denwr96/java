package javaguru.sunday.student_sergej_savkin.lesson_12.level_5_middle.task_27_48;

//task33

import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.List;
@CodeReview(approved = true)
interface ProductValidator {

    List<ValidationException> validate(Product product);

}
