package javaguru.sunday.student_konstantin_shestakov.lesson_12.level_5_to_6;

import javaguru.sunday.teacher.annotations.CodeReview;

// Task 36, 42
@CodeReview(approved = true)
class ProductPriceValidationRule implements FieldValidationRule {

    public void validate(Product product) throws ValidationException {
        if(product.getPrice() == null) {
            throw new ValidationException("RULE-5", "Price field can't be empty", "price");
        }
        if(product.getPrice() <= 0) {
            throw new ValidationException("RULE-6", "Price field has to be more than 0", "price");
        }
    }
}

