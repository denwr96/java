package javaguru.sunday.student_deniss_lobacs.lesson_12.level_5_and_6;

import java.util.List;

public interface ProductValidator {
    List<ValidationException> validate(Product product);
}
