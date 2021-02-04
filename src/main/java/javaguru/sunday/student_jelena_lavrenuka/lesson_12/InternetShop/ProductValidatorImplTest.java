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

import javaguru.sunday.teacher.annotations.CodeReview;
import javaguru.sunday.teacher.annotations.CodeReviewComment;

import java.util.List;

@CodeReview(approved = true)
@CodeReviewComment(comment = "Все хорошо, только можно было не создавать объекты exception, а проверять message, который вернулся. Но так тоже не плохо.")
class ProductValidatorImplTest {
    ValidationException exception1 = new ValidationException("Error", "RULE-1", "Title can not be empty", "title");
    ValidationException exception2 = new ValidationException("Error", "RULE-2", "Title can not be shorter than 3 symbols", "title");
    ValidationException exception3 = new ValidationException("Error", "RULE-3", "Title can not be longer than 100 symbols", "title");
    ValidationException exception4 = new ValidationException("Error", "RULE-4", "Title must contain only English letters and numbers, other characters are not allowed", "title");
    ValidationException exception5 = new ValidationException("Error", "RULE-5", "Price can not be empty", "price");
    ValidationException exception6 = new ValidationException("Error", "RULE-6", "Price must be higher than 0", "price");
    ValidationException exception7 = new ValidationException("Error", "RULE-7", "Description must be shorter than 200 symbols", "description");
    ValidationException exception8 = new ValidationException("Error", "RULE-8", "Description must contain only English letters and numbers, other characters are not allowed", "description");

    private ProductTitleValidationRule titleRule = new ProductTitleValidationRule();
    private ProductPriceValidationRule priceRule = new ProductPriceValidationRule();
    private ProductDescriptionValidationRule descriptionRule = new ProductDescriptionValidationRule();
    private ProductValidator validator = new ProductValidatorImpl(titleRule, priceRule, descriptionRule);

    public static void main(String[] args) {
        ProductValidatorImplTest test = new ProductValidatorImplTest();
        test.rule1_v1();
        test.rule1_v2();
        test.rule2_v1();
        test.rule3_v1();
        test.rule4_v1();
        test.rule4_v2();
        test.rule4_v3();
        test.rule5_v1();
        test.rule6_v1();
        test.rule6_v2();
        test.rule7_v1();
        test.rule8_v1();
        test.rule8_v2();
        test.ruleMix_v1();
        test.ruleMix_v2();
        test.ruleMix_v3();
        test.ruleMix_v4();
        test.ruleMix_v5();
        test.ruleMix_v6();
    }

    public void rule1_v1() {
        Product product = new Product(null, 1, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule1");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-1"), "rule1");
        checkResult(exceptions.get(0).getFieldName().equals("title"), "rule1");
        checkResult(exceptions.get(0).getDescription().equals("Title can not be empty"), "rule1");
    }

    public void rule1_v2() {
        Product product = new Product("", 1, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule1");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-1"), "rule1");
        checkResult(exceptions.get(0).getFieldName().equals("title"), "rule1");
        checkResult(exceptions.get(0).getDescription().equals("Title can not be empty"), "rule1");
    }

    public void rule2_v1() {
        Product product = new Product("ti", 1, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule2");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-2"), "rule2");
        checkResult(exceptions.get(0).getFieldName().equals("title"), "rule2");
        checkResult(exceptions.get(0).getDescription().equals("Title can not be shorter than 3 symbols"), "rule2");
    }

    public void rule3_v1() {
        Product product = new Product("TitleTitleTitleTitleTitleTitleTitleTitleTitleTitleTitleTitleTitleTitleTitleTitleTitleTitleTitleTitleTitle", 1, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule3");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-3"), "rule3");
        checkResult(exceptions.get(0).getFieldName().equals("title"), "rule3");
        checkResult(exceptions.get(0).getDescription().equals("Title can not be longer than 100 symbols"), "rule3");
    }

    public void rule4_v1() {
        Product product = new Product("Title/", 1, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule4");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-4"), "rule4");
        checkResult(exceptions.get(0).getFieldName().equals("title"), "rule4");
        checkResult(exceptions.get(0).getDescription().equals("Title must contain only English letters and numbers, other characters are not allowed"), "rule4");
    }

    public void rule4_v2() {
        Product product = new Product("Титул", 1, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule4");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-4"), "rule4");
        checkResult(exceptions.get(0).getFieldName().equals("title"), "rule4");
        checkResult(exceptions.get(0).getDescription().equals("Title must contain only English letters and numbers, other characters are not allowed"), "rule4");
    }

    public void rule4_v3() {
        Product product = new Product("Title.", 1, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule4");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-4"), "rule4");
        checkResult(exceptions.get(0).getFieldName().equals("title"), "rule4");
        checkResult(exceptions.get(0).getDescription().equals("Title must contain only English letters and numbers, other characters are not allowed"), "rule4");
    }

    public void rule5_v1() {
        Product product = new Product("Title", null, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule5");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-5"), "rule5");
        checkResult(exceptions.get(0).getFieldName().equals("price"), "rule5");
        checkResult(exceptions.get(0).getDescription().equals("Price can not be empty"), "rule5");
    }

    public void rule6_v1() {
        Product product = new Product("Title", 0, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule6");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-6"), "rule6");
        checkResult(exceptions.get(0).getFieldName().equals("price"), "rule6");
        checkResult(exceptions.get(0).getDescription().equals("Price must be higher than 0"), "rule6");
    }

    public void rule6_v2() {
        Product product = new Product("Title", -2, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule6");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-6"), "rule6");
        checkResult(exceptions.get(0).getFieldName().equals("price"), "rule6");
        checkResult(exceptions.get(0).getDescription().equals("Price must be higher than 0"), "rule6");
    }

    public void rule7_v1() {
        Product product = new Product("Title", 1, "DescriptionDescriptionDescriptionDescriptionDescriptionDescriptionDescriptionDescriptionDescriptionDescriptionDescriptionDescriptionDescriptionDescriptionDescriptionDescriptionDescriptionDescriptionDescription");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule7");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-7"), "rule7");
        checkResult(exceptions.get(0).getFieldName().equals("description"), "rule7");
        checkResult(exceptions.get(0).getDescription().equals("Description must be shorter than 200 symbols"), "rule7");
    }

    public void rule8_v1() {
        Product product = new Product("Title", 1, "описание");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule8");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-8"), "rule8");
        checkResult(exceptions.get(0).getFieldName().equals("description"), "rule8");
        checkResult(exceptions.get(0).getDescription().equals("Description must contain only English letters and numbers, other characters are not allowed"), "rule8");
    }

    public void rule8_v2() {
        Product product = new Product("Title", 1, ".");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule8");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-8"), "rule8");
        checkResult(exceptions.get(0).getFieldName().equals("description"), "rule8");
        checkResult(exceptions.get(0).getDescription().equals("Description must contain only English letters and numbers, other characters are not allowed"), "rule8");
    }

    public void ruleMix_v1() {
        Product product = new Product("Ti", 1, ".");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 2, "ruleMix");
        checkResult(exceptions.contains(exception2), "ruleMix");
        checkResult(exceptions.contains(exception8), "ruleMix");
    }

    public void ruleMix_v2() {
        Product product = new Product("Ti", -1, ".");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 3, "ruleMix");
        checkResult(exceptions.contains(exception8), "ruleMix");
        checkResult(exceptions.contains(exception2), "ruleMix");
        checkResult(exceptions.contains(exception6), "ruleMix");
    }

    public void ruleMix_v3() {
        Product product = new Product("Title", -1, ".");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 2, "ruleMix");
        checkResult(exceptions.contains(exception8), "ruleMix");
        checkResult(exceptions.contains(exception6), "ruleMix");
    }

    public void ruleMix_v4() {
        Product product = new Product("", null, "Description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 2, "ruleMix");
        checkResult(exceptions.contains(exception1), "ruleMix");
        checkResult(exceptions.contains(exception5), "ruleMix");
    }

    public void ruleMix_v5() {
        Product product = new Product("TitleTitleTitleTitleTitleTitleTitleTitleTitleTitleTitleTitleTitleTitleTitleTitleTitleTitleTitleTitleTitle", 2, "DescriptionDescriptionDescriptionDescriptionDescriptionDescriptionDescriptionDescriptionDescriptionDescriptionDescriptionDescriptionDescriptionDescriptionDescriptionDescriptionDescriptionDescriptionDescription");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 2, "ruleMix");
        checkResult(exceptions.contains(exception3), "ruleMix");
        checkResult(exceptions.contains(exception7), "ruleMix");
    }

    public void ruleMix_v6() {
        Product product = new Product("Титул", null, "Description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 2, "ruleMix");
        checkResult(exceptions.contains(exception4), "ruleMix");
        checkResult(exceptions.contains(exception5), "ruleMix");
    }

    private void checkResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FAIL");
        }
    }
}
