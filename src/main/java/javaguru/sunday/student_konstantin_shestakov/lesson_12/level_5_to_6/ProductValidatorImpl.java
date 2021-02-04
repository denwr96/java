package javaguru.sunday.student_konstantin_shestakov.lesson_12.level_5_to_6;

// Task 34, 41, 43, 47, 48

import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.ArrayList;
import java.util.List;
@CodeReview(approved = true)
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

