package main.java.javaguru.sunday.student_liana_shirmane.lesson_10.level_3;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

//task8
@CodeReview(approved = true)
public class ProductTest {
    public static void main(String[] args) {
        ProductTest productTest = new ProductTest();
        productTest.shouldFindProduct();
        productTest.shouldNotFindProduct();
    }
    void shouldFindProduct() {
        Database database = new InMemoryDatabase();
        Product product1 = new Product("Apple");
        Product product2 = new Product("Banana");
        database.save(product1);
        database.save(product2);
        Product actualResult = database.findByTitle("Apple");
        check(product1, actualResult, "Find product in the list");
    }

    void shouldNotFindProduct() {
        Database database = new InMemoryDatabase();
        Product product1 = new Product("Apple");
        Product product2 = new Product("Banana");
        database.save(product1);
        database.save(product2);
        Product actualResult = database.findByTitle("Carrot");
        if (actualResult == null) {
            System.out.println("Do not find product in the list has passed!");
        } else System.out.println("Do not find product in the list has failed!");
    }
    public void check(Product expectedResult, Product actualResult, String testName) {
        if (expectedResult.equals(actualResult)) {
            System.out.println(testName + " has passed!");
        } else {
            System.out.println(testName + " failed!");
            System.out.println("Expected: " + expectedResult + " but Actual: " + actualResult);
        }
    }

}
