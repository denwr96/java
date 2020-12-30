package javaguru.sunday.student_liana_shirmane.lesson_12.level_6;
//task36
//task44

public class ProductDescriptionValidationRule implements FieldValidationRule {
    @Override
    public void validate(Product product) throws ValidationException {
        if (product.getDescription().length() > 2000) {
            throw new ValidationException("RULE-8", "Description can't be more 2000", "description");
        } else if (!product.getDescription().matches("^[a-zA-Z0-9]+$")) {
            throw new ValidationException("RULE-9", "Description can contain only letters on numbers", "description");
        }
    }
}
