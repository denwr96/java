package javaguru.sunday.student_liana_shirmane.lesson_12.level_6;
//task36

import java.util.List;

class ProductValidatorImpl implements ProductValidator{
    @Override
    public List<ValidationException> validate(Product product) {
        return null;
    }
}

// получает продукт и в случае ошибки кидает ошибку в которой
// указано название правила, описание ошибки и название поля