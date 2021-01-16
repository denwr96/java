package javaguru.sunday.student_konstantin_shestakov.lesson_12.level_5_to_6;

import javaguru.sunday.teacher.annotations.CodeReview;

// Task 36, 44
@CodeReview(approved = true)
class ProductDescriptionValidationRule implements FieldValidationRule {

    public void validate(Product product) throws ValidationException {
        if(product.getDescription().toCharArray().length > 2000) {
            throw new ValidationException("RULE-7", "Description can not be more than 2000 symbols", "description");
        }
        if(!product.getDescription().matches("[a-zA-Z0-1]+")) {
            throw new ValidationException("RULE-8", "Description can contain only english letters and digits", "description");
        }
    }

}
