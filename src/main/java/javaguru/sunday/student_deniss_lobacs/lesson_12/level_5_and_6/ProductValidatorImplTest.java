package javaguru.sunday.student_deniss_lobacs.lesson_12.level_5_and_6;

import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.List;

@CodeReview(approved = true)
public class ProductValidatorImplTest {

    private ProductTitleValidationRule nameRule = new ProductTitleValidationRule();
    private ProductPriceValidationRule priceRule = new ProductPriceValidationRule();
    private ProductDescriptionValidationRule descriptionRule = new ProductDescriptionValidationRule();

    private ProductValidator validator = new ProductValidatorImpl(nameRule, priceRule, descriptionRule);

    public static void main(String[] args) {
        ProductValidatorImplTest test = new ProductValidatorImplTest();
        test.rule1_v1();
        test.rule1_v2();
        test.rule2();
        test.rule3();
        test.rule4();
        test.rule5();
        test.rule6();
        test.rule8();
        test.rule9();
        test.ruleMixV1();
        test.ruleMixV2();
        test.ruleMixV3();
        test.ruleMixV4();
    }

    public void rule1_v1() {
        Product product = new Product(null, 1, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule1");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-1"), "rule1");
        checkResult(exceptions.get(0).getFieldName().equals("title"), "rule1");
        checkResult(exceptions.get(0).getDescription().equals("Title can't be empty"), "rule1");
    }

    public void rule1_v2() {
        Product product = new Product("", 1, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule1");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-1"), "rule1");
        checkResult(exceptions.get(0).getFieldName().equals("title"), "rule1");
        checkResult(exceptions.get(0).getDescription().equals("Title can't be empty"), "rule1");
    }

    public void rule2() {
        Product product = new Product("A", 1, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule1");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-2"), "rule2");
        checkResult(exceptions.get(0).getFieldName().equals("title"), "rule2");
        checkResult(exceptions.get(0).getDescription().equals("Title should be at least 3 symbols"), "rule2");
    }

    public void rule3() {
        Product product = new Product("Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 1, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule1");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-3"), "rule3");
        checkResult(exceptions.get(0).getFieldName().equals("title"), "rule3");
        checkResult(exceptions.get(0).getDescription().equals("Title shouldn't  be more than 100 symbols"), "rule3");
    }

    public void rule4() {
        Product product = new Product("Название", 1, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule1");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-4"), "rule4");
        checkResult(exceptions.get(0).getFieldName().equals("title"), "rule4");
        checkResult(exceptions.get(0).getDescription().equals("Title must contain only letters or numbers"), "rule4");
    }

    public void rule5() {
        Product product = new Product("Title", null, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule1");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-5"), "rule5");
        checkResult(exceptions.get(0).getFieldName().equals("price"), "rule5");
        checkResult(exceptions.get(0).getDescription().equals("Price can't be null"), "rule5");
    }

    public void rule6() {
        Product product = new Product("Title", -1, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule1");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-6"), "rule6");
        checkResult(exceptions.get(0).getFieldName().equals("price"), "rule6");
        checkResult(exceptions.get(0).getDescription().equals("Price can't be less than 0"), "rule6");
    }

    public void rule8() {
        Product product = new Product("Title", 1, "diptionasddescriptionasddescriptionasddescriptionasddescriptionasddescriptionasddescriptionasddescriptionasddescriptionasddescriptionasddescriptionasddescriptionasddescriptionasddescriptionasddescriptionasddescriptionasddescriptionasddescriptionasddescriptionasddescriptionasddescriptionasddescriptionasddescriptionasddescriptionasddescriptionasddescriptionasddescriptionasddescriptionasddescriptionasddescriptionasddescriptionasddescriptionasddescriptionasddescriptionasddescriptionasddescriptionasddescriptionasddescriptionasddescriptionasddescriptionasddescriptionasddescriptionasddescriptionasddescriptionasddescriptionasddescriptionasddescriptionasddescriptionasddescriptionasddescriptionasddescriptionasddescriptionasddescriptionasddescriptionasddescriptionasddescriptionasddescriptionasddescriptionasddescriptionasddescriptionasddescriptionasddescriptionasddescriptionasddescriptionasddescriptionasddescriptionasddescriptionasddescriptionasddescriptionasddescriptionasddescriptionasddescriptionasddescriptionasddescriptionasddescriptionasddescriptionasddescriptionasddescriptionasddescriptionasddescriptionasddescriptionasddescriptionasddescriptionasddescriptionasddescriptionasddescriptionasddescriptionasddescriptionasddescriptionasddescriptionasddescriptionasddescriptionasddescriptionasddescriptionasddescriptionasddescriptionasddescriptionasddescriptionasddescriptionasddescriptionasddescriptionasddescriptionasddescriptionasddescriptionasddescriptionasddescriptionasddescriptionasddescriptionasddescriptionasddescriptionasddescriptionasddescriptionasddescriptionasddescriptionasddescriptionasddescriptionasddescriptionasddescriptionasddescriptionasddescriptionasddescriptionasddescriptionasddescriptionasddescriptionasddescriptionasddescriptionasddescriptionasddescriptionasddescriptionasddescriptionasddescriptionasddescriptionasddescriptionasddescriptionasddescriptionasddescriptionasddescriptionasddescriptionasddescriptionasddescriptionasddescriptionasddescriptionasddescriptionasddescriptionasddescriptionasddescriptionasddescriptionasddescriptionasddescriptionasddescriptionasddescriptionasddescriptionasddescriptionasddescriptionasddescriptionasddescriptionasddescriptionasddescriptionasddescriptionasddescriptionasddescriptionasddescriptionasddescriptionasddescriptionasddescriptionasddescriptionasddescriptionasddescriptionasd");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule8");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-8"), "rule8");
        checkResult(exceptions.get(0).getFieldName().equals("description"), "rule8");
        checkResult(exceptions.get(0).getDescription().equals("Description can't be more 2000"), "rule8");
    }

    public void rule9() {
        Product product = new Product("Title", 1, "Описание");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule8");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-9"), "rule9");
        checkResult(exceptions.get(0).getFieldName().equals("description"), "rule9");
        checkResult(exceptions.get(0).getDescription().equals("Description can contain only letters on numbers"), "rule9");
    }

    public void ruleMixV1() {
        Product product = new Product("Название", -1, "Description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 2, "ruleMixV1");
    }

    public void ruleMixV2() {
        Product product = new Product("Название", 1, "Описание");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 2, "ruleMixV2");
    }

    public void ruleMixV3() {
        Product product = new Product("Title", -1, "Описание");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 2, "ruleMixV3");
    }

    public void ruleMixV4() {
        Product product = new Product("Название", -1, "Описание");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 3, "ruleMixV4");
    }

    private void checkResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FAIL");
        }
    }
}
