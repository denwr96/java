package javaguru.sunday.student_sergej_savkin.lesson_12.level_5_middle.task_27_48;

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class ProductTitleValidationRule implements FieldValidationRule {
    @Override
    public void validate(Product product) throws ValidationException {
        if (product.getProductName() == null) {
            throw new ValidationException("RULE-1", "Title can not be empty", "title");
        } else if (product.getProductName().equals("")) {
            throw new ValidationException("RULE-1", "Title can not be empty", "title");
        } else if (product.getProductName().length() < 3) {
            throw new ValidationException("RULE-2", "Title length can not be less than 3 characters", "title");
        } else if (product.getProductName().length() > 100) {
            throw new ValidationException("RULE-3", "Title length can not be bigger than 100 characters", "title");
        } else if (!product.getProductName().matches("^[a-zA-Z0-9]+$")) {
        throw new ValidationException("RULE-4", "Title should contain only English letters and digits", "title");
        }
    }

}
