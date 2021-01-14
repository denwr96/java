package javaguru.sunday.student_sergej_savkin.lesson_12.level_5_middle.task_27_48;

//task37

import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.List;
@CodeReview(approved = true)
class ProductValidatorImplTest {

    private ProductValidator validator = new ProductValidatorImpl(new ProductTitleValidationRule(), new ProductPriceValidationRule(), new ProductDescriptionValidationRule());
    ValidationException validationExceptionOne = new ValidationException("RULE-1", "Title can not be empty", "title");
    ValidationException validationExceptionTwo = new ValidationException("RULE-2", "Title length can not be less than 3 characters", "title");
    ValidationException validationExceptionThree = new ValidationException("RULE-3", "Title length can not be bigger than 100 characters", "title");
    ValidationException validationExceptionFour = new ValidationException("RULE-4", "Title should contain only English letters and digits", "title");
    ValidationException validationExceptionFive = new ValidationException("RULE-5", "Price can not be empty", "price");
    ValidationException validationExceptionSix = new ValidationException("RULE-6", "Price should be bigger than 0", "price");
    ValidationException validationExceptionSeven = new ValidationException("RULE-7", "Description should be less than 2000 characters", "description");
    ValidationException validationExceptionEight = new ValidationException("RULE-8", "Description should contain only English letters and digits", "description");

    public static void main(String[] args) {
        ProductValidatorImplTest test = new ProductValidatorImplTest();
        test.rule1_v1();
        test.rule1_v2();
        test.rule2_v1();
        test.rule3_v1();
        test.rule4_v1();
        test.rule5_v1();
        test.rule6_v1();
        test.rule7_v1();
        test.rule8_v1();
        test.ruleMixOne();
        test.ruleMixTwo();
        test.ruleMixThree();
        test.ruleMixFour();
    }

    public void rule1_v1() {
        Product product = new Product(null, 1, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResults(exceptions.size() == 1, "rule1");
        checkResults(exceptions.get(0).getRuleName().equals("RULE-1"), "rule1");
        checkResults(exceptions.get(0).getFieldName().equals("title"), "rule1");
        checkResults(exceptions.get(0).getDescription().equals("Title can not be empty"), "rule1");
    }

    public void rule1_v2() {
        Product product = new Product("", 1, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResults(exceptions.size() == 1, "rule1");
        checkResults(exceptions.get(0).getRuleName().equals("RULE-1"), "rule1");
        checkResults(exceptions.get(0).getFieldName().equals("title"), "rule1");
        checkResults(exceptions.get(0).getDescription().equals("Title can not be empty"), "rule1");
    }

    public void rule2_v1() {
        Product product = new Product("Br", 1, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResults(exceptions.size() == 1, "rule2");
        checkResults(exceptions.get(0).getRuleName().equals("RULE-2"), "rule2");
        checkResults(exceptions.get(0).getFieldName().equals("title"), "rule2");
        checkResults(exceptions.get(0).getDescription().equals("Title length can not be less than 3 characters"), "rule2");
    }

    public void rule3_v1() {
        Product product = new Product("Brrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrr", 1, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResults(exceptions.size() == 1, "rule3");
        checkResults(exceptions.get(0).getRuleName().equals("RULE-3"), "rule3");
        checkResults(exceptions.get(0).getFieldName().equals("title"), "rule3");
        checkResults(exceptions.get(0).getDescription().equals("Title length can not be bigger than 100 characters"), "rule3");
    }

    public void rule4_v1() {
        Product product = new Product("Appleз", 1, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResults(exceptions.size() == 1, "rule4");
        checkResults(exceptions.get(0).getRuleName().equals("RULE-4"), "rule4");
        checkResults(exceptions.get(0).getFieldName().equals("title"), "rule4");
        checkResults(exceptions.get(0).getDescription().equals("Title should contain only English letters and digits"), "rule4");
    }

    public void rule5_v1() {
        Product product = new Product("Apple", null, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResults(exceptions.size() == 1, "rule5");
        checkResults(exceptions.get(0).getRuleName().equals("RULE-5"), "rule5");
        checkResults(exceptions.get(0).getFieldName().equals("price"), "rule5");
        checkResults(exceptions.get(0).getDescription().equals("Price can not be empty"), "rule5");
    }

    public void rule6_v1() {
        Product product = new Product("Apple", 0, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResults(exceptions.size() == 1, "rule6");
        checkResults(exceptions.get(0).getRuleName().equals("RULE-6"), "rule6");
        checkResults(exceptions.get(0).getFieldName().equals("price"), "rule6");
        checkResults(exceptions.get(0).getDescription().equals("Price should be bigger than 0"), "rule6");
    }

    public void rule7_v1() {
        Product product = new Product("Apple", 1, "description description description description description description description description description description description description description description description description description description description description description description description description description description description description description description description description description description description description description description description description description description description description description description description description description description description description description description description description description description description description description description description description description description description description description description description description description description description description description description description ");
        List<ValidationException> exceptions = validator.validate(product);
        checkResults(exceptions.size() == 1, "rule7");
        checkResults(exceptions.get(0).getRuleName().equals("RULE-7"), "rule7");
        checkResults(exceptions.get(0).getFieldName().equals("description"), "rule7");
        checkResults(exceptions.get(0).getDescription().equals("Description should be less than 2000 characters"), "rule7");
    }

    public void rule8_v1() {
        Product product = new Product("Apple", 1, "Описание");
        List<ValidationException> exceptions = validator.validate(product);
        checkResults(exceptions.size() == 1, "rule8");
        checkResults(exceptions.get(0).getRuleName().equals("RULE-8"), "rule8");
        checkResults(exceptions.get(0).getFieldName().equals("description"), "rule8");
        checkResults(exceptions.get(0).getDescription().equals("Description should contain only English letters and digits"), "rule8");
    }

    public void ruleMixOne() {
        Product product = new Product("", 1, "Описание");
        List<ValidationException> exceptions = validator.validate(product);
        checkResults(exceptions.size() == 2, "ruleMixOne");
        checkResults(exceptions.contains(validationExceptionOne), "ruleMixOne");
        checkResults(exceptions.contains(validationExceptionEight), "ruleMixOne");
    }

    public void ruleMixTwo() {
        Product product = new Product("gr", 0, "description description description description description description description description description description description description description description description description description description description description description description description description description description description description description description description description description description description description description description description description description description description description description description description description description description description description description description description description description description description description description description description description description description description description description description description description description description description description description description description ");
        List<ValidationException> exceptions = validator.validate(product);
        checkResults(exceptions.size() == 3, "ruleMixTwo");
        checkResults(exceptions.contains(validationExceptionTwo), "ruleMixTwo");
        checkResults(exceptions.contains(validationExceptionSix), "ruleMixTwo");
        checkResults(exceptions.contains(validationExceptionSeven), "ruleMixTwo");
    }

    public void ruleMixThree() {
        Product product = new Product("Банан", null, "Banana");
        List<ValidationException> exceptions = validator.validate(product);
        checkResults(exceptions.size() == 2, "ruleMixThree");
        checkResults(exceptions.contains(validationExceptionFour), "ruleMixThree");
        checkResults(exceptions.contains(validationExceptionFive), "ruleMixThree");
    }

    public void ruleMixFour() {
        Product product = new Product("BananaBananaBananaBananaBananaBananaBananaBananaBananaBananaBananaBananaBananaBananaBananaBananaBananaBananaBananaBananaBananaBananaBananaBananaBananaBananaBananaBananaBananaBananaBananaBanana", 1, "Banana");
        List<ValidationException> exceptions = validator.validate(product);
        checkResults(exceptions.size() == 1, "ruleMixFour");
        checkResults(exceptions.contains(validationExceptionThree), "ruleMixFour");
    }

    private void checkResults(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FAIL");
        }
    }

}
