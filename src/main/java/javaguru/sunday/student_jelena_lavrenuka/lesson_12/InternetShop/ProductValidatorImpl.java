package javaguru.sunday.student_jelena_lavrenuka.lesson_12.InternetShop;

// lesson_12 task_27
// lesson_12 task_28
// lesson_12 task_29
// lesson_12 task_30
// lesson_12 task_31
// lesson_12 task_32
// lesson_12 task_33
// lesson_12 task_34
// lesson_12 task_35
// lesson_12 task_36
// lesson_12 task_37
// lesson_12 task_38
// lesson_12 task_39
// lesson_12 task_40
// lesson_12 task_41
// lesson_12 task_42
// lesson_12 task_43
// lesson_12 task_44
// lesson_12 task_45
// lesson_12 task_46
// lesson_12 task_47
// lesson_12 task_48

import java.util.ArrayList;
import java.util.List;


class ProductValidatorImpl implements ProductValidator {

    private List<FieldValidationRule> validationRules = new ArrayList<>();

    public ProductValidatorImpl(ProductTitleValidationRule titleValidationRule,
                                ProductPriceValidationRule priceValidationRule,
                                ProductDescriptionValidationRule descriptionValidationRule) {
        validationRules.add(titleValidationRule);
        validationRules.add(priceValidationRule);
        validationRules.add(descriptionValidationRule);
    }

    public List<ValidationException> validate(Product product) {
        List<ValidationException> exceptions = new ArrayList<>();
        for (FieldValidationRule validationRule : validationRules) {
            try {
                validationRule.validate(product);
            } catch (ValidationException e) {
                exceptions.add(e);
            }
        }
        return exceptions;
    }
}
