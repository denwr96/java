package javaguru.sunday.student_jelena_lavrenuka.lesson_12.InternetShop;


class ProductPriceValidationRule implements FieldValidationRule{
    @Override
    public void validate(Product product) throws ValidationException {
        if(product.getPrice() == null){
            throw new ValidationException("Error", "RULE-5", "Price can not be empty", "price");
        }else if(product.getPrice() <= 0){
            throw new ValidationException("Error", "RULE-6", "Price must be higher than 0", "price");
        }
    }
}
