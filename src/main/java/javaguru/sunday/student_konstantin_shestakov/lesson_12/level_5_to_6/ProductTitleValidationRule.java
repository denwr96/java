package javaguru.sunday.student_konstantin_shestakov.lesson_12.level_5_to_6;

// Tak 36, 40

class ProductTitleValidationRule implements FieldValidationRule {

    public void validate(Product product) throws ValidationException {
        if(product.getTitle() == null || product.getTitle().equals("")) {
            throw new ValidationException("RULE-1", "Title can not be empty", "title");
        }
        if(product.getTitle().toCharArray().length < 3) {
            throw new ValidationException("RULE-2", "Title can not be less than 3 symbols", "title");
        }
        if(product.getTitle().toCharArray().length > 100) {
            throw new ValidationException("RULE-3", "Title can not be more than 100 symbols", "title");
        }
        if(!product.getTitle().matches("[a-zA-Z0-1]+")) {
            throw new ValidationException("RULE-4", "Title can contain only english letters and digits", "title");
        }

    }
}
