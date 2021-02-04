package javaguru.sunday.student_deniss_lobacs.lesson_12.level_5_and_6;

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class ProductDescriptionValidationRule implements  FieldValidationRule {

    public void validate(Product product) throws ValidationException {

//        - RULE-8: не должно быть длиннее 2000 символов
//        - RULE-9: должно содержать только английские буквы и цифры, другие символы не допустимы

        if (product.getDescription().length() > 2000) {
            throw new ValidationException("RULE-8", "Description can't be more 2000", "description");
        } else if (!product.getDescription().matches("^[a-zA-Z0-9]+$")) {
            throw new ValidationException("RULE-9", "Description can contain only letters on numbers", "description");
        }
    }
}
