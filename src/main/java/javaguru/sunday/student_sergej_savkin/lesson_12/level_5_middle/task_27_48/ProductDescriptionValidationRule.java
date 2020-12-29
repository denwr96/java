package javaguru.sunday.student_sergej_savkin.lesson_12.level_5_middle.task_27_48;

class ProductDescriptionValidationRule implements FieldValidationRule {
    @Override
    public void validate(Product product) throws ValidationException {
        if(product.getProductDescription().length() > 200) {
            throw new ValidationException("RULE-7", "Description should be less than 2000 characters", "description");
        } else if (!product.getProductDescription().matches("^[a-zA-Z0-9]+$")) {
            throw new ValidationException("RULE-8", "Description should contain only English letters and digits", "description");
        }
    }
}
