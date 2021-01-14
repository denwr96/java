package javaguru.sunday.student_liana_shirmane.lesson_12.level_6;

import javaguru.sunday.teacher.annotations.CodeReview;

//task36
//task42
@CodeReview(approved = true)
public class ProductPriceValidationRule implements FieldValidationRule {
    @Override
    public void validate(Product product) throws ValidationException {
        if (product.getPrice() == null) {
            throw new ValidationException("RULE-5", "Price of the product can not be null", "price");
        } else if (product.getPrice() <= 0) {
            throw new ValidationException("RULE-6", "Price of the product can not be less than 0", "price");
        }
    }
}

