package javaguru.sunday.student_jelena_lavrenuka.lesson_12.InternetShop;

import java.util.List;

interface ProductValidator {

    List<ValidationException> validate(Product product);
}
