package javaguru.sunday.student_liana_shirmane.lesson_12.level_6;
//task36
//task40

class ProductTitleValidationRule implements FieldValidationRule {

    @Override
    public void validate(Product product) throws ValidationException {
        if (product.getTitle() == null) {
            throw new ValidationException("RULE-1", "Title can not be empty", "title");
        } else if (product.getTitle().equals("")) {
            throw new ValidationException("RULE-1", "Title can not be empty", "title");
        } else if (product.getTitle().length() < 3) {
            throw new ValidationException("RULE-2", "Title of the product should be at least 3 symbols", "title");
        } else if (product.getTitle().length() > 100) {
            throw new ValidationException("RULE-3", "Title of the product should not be more than 100 symbols", "title");
        } else if (!product.getTitle().matches("^[a-zA-Z0-9]+$")) {
            throw new ValidationException("RULE-4", "Title must contain only letters or numbers", "title");
        }
    }
}


