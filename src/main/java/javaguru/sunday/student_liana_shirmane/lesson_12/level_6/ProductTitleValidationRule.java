package javaguru.sunday.student_liana_shirmane.lesson_12.level_6;
//task36
//task40

class ProductTitleValidationRule implements FieldValidationRule {
    @Override
    public void validate(Product product) throws ValidationException {
        try {
            String Name = null; //null value
        } catch(NullPointerException e) {
            System.out.println("NullPointerException..");
        }
        // реализуйте все требования для валидации названия продукта:
//        К названию продукта выдвигаются следующие требования:
//        -RULE - 1:не должно быть пустым
//        -RULE - 2:не должно быть короче 3 символов
//                - RULE - 3:не должно быть длиннее 100 символов
//                - RULE - 4:должно содержать только английские буквы и цифры, другие символы не допустимы
    }

}
