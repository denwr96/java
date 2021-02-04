package javaguru.sunday.student_jelena_lavrenuka.lesson_12.InternetShop;

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
interface FieldValidationRule {
    void validate(Product product) throws ValidationException;
// получает продукт и в случае ошибки кидает ошибку в которой
// указано название правила, описание ошибки и название поля
}
