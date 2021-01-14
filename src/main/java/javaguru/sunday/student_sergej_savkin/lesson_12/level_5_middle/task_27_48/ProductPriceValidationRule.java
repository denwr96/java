package javaguru.sunday.student_sergej_savkin.lesson_12.level_5_middle.task_27_48;

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class ProductPriceValidationRule implements FieldValidationRule {
    @Override
    public void validate(Product product) throws ValidationException {
        if(product.getProductPrice() == null) {
            throw new ValidationException("RULE-5", "Price can not be empty", "price");
        } else if(product.getProductPrice() == 0) {
            throw new ValidationException("RULE-6", "Price should be bigger than 0", "price");
        }
    }
}
