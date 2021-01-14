package javaguru.sunday.student_jelena_lavrenuka.lesson_12.InternetShop;


import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.List;

@CodeReview(approved = true)
interface ProductValidator {

    List<ValidationException> validate(Product product);
}
