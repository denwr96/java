package javaguru.sunday.student_deniss_lobacs.lesson_12.level_5_and_6;

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class ProductPriceValidationRule implements FieldValidationRule {


    public void validate(Product product) throws ValidationException {

//        - RULE-5: не должна быть пустой
//        - RULE-6: должна быть больше 0

        if (product.getPrice() == null) {
            throw new ValidationException("RULE-5", "Price can't be null", "price");
        } else if (product.getPrice() <= 0) {
            throw new ValidationException("RULE-6", "Price can't be less than 0", "price");
        }

    }
}
