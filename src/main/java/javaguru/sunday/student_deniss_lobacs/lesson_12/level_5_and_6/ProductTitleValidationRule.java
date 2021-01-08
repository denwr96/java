package javaguru.sunday.student_deniss_lobacs.lesson_12.level_5_and_6;

public class ProductTitleValidationRule implements  FieldValidationRule {

    @Override
    public void validate(Product product) throws ValidationException {

//        - RULE-1: не должно быть пустым
//        - RULE-2: не должно быть короче 3 символов
//        - RULE-3: не должно быть длиннее 100 символов
//        - RULE-4: должно содержать только английские буквы и цифры, другие символы не допустимы

        if (product.getTitle() == null || product.getTitle().isEmpty()) {
            throw new ValidationException("RULE-1", "Title can't be empty", "title");
        } else if (product.getTitle().length() < 3) {
            throw new ValidationException("RULE-2", "Title should be at least 3 symbols", "title");
        } else if (product.getTitle().length() > 100) {
            throw new ValidationException("RULE-3", "Title shouldn't  be more than 100 symbols", "title");
        } else if (!product.getTitle().matches("^[a-zA-Z0-9]+$")) {
            throw new ValidationException("RULE-4", "Title must contain only letters or numbers", "title");
        }

    }
}
