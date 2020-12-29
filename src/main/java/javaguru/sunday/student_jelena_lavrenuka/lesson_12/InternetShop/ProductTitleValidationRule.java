package javaguru.sunday.student_jelena_lavrenuka.lesson_12.InternetShop;


class ProductTitleValidationRule implements FieldValidationRule {
    @Override
    public void validate(Product product) throws ValidationException {
        if (product.getTitle() == null) {
            throw new ValidationException("Error", "RULE-1", "Title can not be empty", "title");
        }else if(product.getTitle().equals("")){
            throw new ValidationException("Error", "RULE-1", "Title can not be empty", "title");
        }else if(product.getTitle().length() < 3){
            throw new ValidationException("Error", "RULE-2", "Title can not be shorter than 3 symbols", "title");
        }else if(product.getTitle().length() > 100){
            throw new ValidationException("Error", "RULE-3", "Title can not be longer than 100 symbols", "title");
        }else if(!product.getTitle().matches("^[a-zA-Z0-9]+$")){
            throw new ValidationException("Error", "RULE-4", "Title must contain only English letters and numbers, other characters are not allowed", "title");
        }
    }
}
