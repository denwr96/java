package javaguru.sunday.student_jelena_lavrenuka.lesson_12.InternetShop;

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class ProductDescriptionValidationRule implements FieldValidationRule {
    @Override
    public void validate(Product product) throws ValidationException {
        if (product.getDescription().length() > 200) {
            throw new ValidationException("Error", "RULE-7", "Description must be shorter than 200 symbols", "description");
        } else if (!product.getDescription().matches("^[a-zA-Z0-9]+$")) {
            throw new ValidationException("Error", "RULE-8", "Description must contain only English letters and numbers, other characters are not allowed", "description");
        }
    }
}

