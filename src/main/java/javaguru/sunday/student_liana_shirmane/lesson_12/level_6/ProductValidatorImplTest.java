package javaguru.sunday.student_liana_shirmane.lesson_12.level_6;
//task37
//task38
//task41
//task42
//task46

import java.util.List;

public class ProductValidatorImplTest {

    private ProductTitleValidationRule nameRule = new ProductTitleValidationRule();
    private ProductPriceValidationRule priceRule = new ProductPriceValidationRule();
    private ProductDescriptionValidationRule descriptionRule = new ProductDescriptionValidationRule();

    private ProductValidator validator = new ProductValidatorImpl(nameRule, priceRule, descriptionRule);

    public static void main(String[] args) {
        ProductValidatorImplTest test = new ProductValidatorImplTest();
        test.rule1_v1();
        test.rule1_v2();
        test.rule2_v1();
        test.rule3_v1();
        test.rule4_v1();
        test.rule5_v1();
        test.rule6_v1();
        test.rule8_v1();
        test.rule9_v1();
        test.ruleTitleAndPrice();
        test.ruleTitleAndDescription();
        test.ruleTitleAndPriceAndDescription();
        test.rulePriceAndDescription();


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
        Product product = new Product("te", 1, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule2");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-2"), "rule2");
        checkResult(exceptions.get(0).getFieldName().equals("title"), "rule2");
        checkResult(exceptions.get(0).getDescription().equals("Title of the product should be at least 3 symbols"), "rule2");
    }

    public void rule3_v1() {
        Product product = new Product("namenamenamenamenamenamenamenamenamenamenamenamenamenamenamenamenamenamenamenamenamenamenamenamename1()", 1, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule3");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-3"), "rule3");
        checkResult(exceptions.get(0).getFieldName().equals("title"), "rule3");
        checkResult(exceptions.get(0).getDescription().equals("Title of the product should not be more than 100 symbols"), "rule3");
    }

    public void rule4_v1() {
        Product product = new Product("Lorem ipsum dolor sit amet,", 1, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule4");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-4"), "rule4");
        checkResult(exceptions.get(0).getFieldName().equals("title"), "rule4");
        checkResult(exceptions.get(0).getDescription().equals("Title must contain only letters or numbers"), "rule4");
    }

    public void rule5_v1() {
        Product product = new Product("BestProduct", null, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule5");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-5"), "rule5");
        checkResult(exceptions.get(0).getFieldName().equals("price"), "rule5");
        checkResult(exceptions.get(0).getDescription().equals("Price of the product can not be null"), "rule5");
    }

    public void rule6_v1() {
        Product product = new Product("BestProduct", 0, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule6");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-6"), "rule6");
        checkResult(exceptions.get(0).getFieldName().equals("price"), "rule6");
        checkResult(exceptions.get(0).getDescription().equals("Price of the product can not be less than 0"), "rule6");
    }

    public void rule8_v1() {
        Product product = new Product("BestProduct", 1, "testestestetestesttttdescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescription");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule8");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-8"), "rule8");
        checkResult(exceptions.get(0).getFieldName().equals("description"), "rule8");
        checkResult(exceptions.get(0).getDescription().equals("Description can't be more 2000"), "rule8");
    }

    public void rule9_v1() {
        Product product = new Product("BestProduct", 1, "description-0)(;");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule9");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-9"), "rule9");
        checkResult(exceptions.get(0).getFieldName().equals("description"), "rule9");
        checkResult(exceptions.get(0).getDescription().equals("Description can contain only letters on numbers"), "rule9");
    }

    public void ruleTitleAndPrice(){
        Product product = new Product("", null, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 2, "rule 1 and 5");
        checkResult(exceptions.contains(new ValidationException("RULE-1", "Title can not be empty", "title")), "rule title and price");
        checkResult(exceptions.contains(new ValidationException("RULE-5", "Price of the product can not be null", "price")), "rule title and price");

    }

    public void ruleTitleAndDescription(){
        Product product = new Product("", 1, "description-0)(;");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 2, "rule 1 and 9");
        checkResult(exceptions.contains(new ValidationException("RULE-1", "Title can not be empty", "title")), "rule title and description");
        checkResult(exceptions.contains(new ValidationException("RULE-9", "Description can contain only letters on numbers", "description")), "rule title and description");
    }

    public void ruleTitleAndPriceAndDescription(){
        Product product = new Product("", null, "description-0)(;");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 3, "rule 1, 5 and 9");
        checkResult(exceptions.contains(new ValidationException("RULE-1", "Title can not be empty", "title")), "rule title, price and description");
        checkResult(exceptions.contains(new ValidationException("RULE-5", "Price of the product can not be null", "price")), "rule title, price and description");
        checkResult(exceptions.contains(new ValidationException("RULE-9", "Description can contain only letters on numbers", "description")), "rule title, price and description");

    }

    public void rulePriceAndDescription() {
        Product product = new Product("BestProduct", null, "description-0)(;");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 2, "rule 5 and 9");
        checkResult(exceptions.contains(new ValidationException("RULE-5", "Price of the product can not be null", "price")), "rule price and description");
        checkResult(exceptions.contains(new ValidationException("RULE-9", "Description can contain only letters on numbers", "description")), "rule price and description");
    }

    private void checkResult(boolean condition, String testName) {
        if (condition){
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FAIL");
        }
    }

}
