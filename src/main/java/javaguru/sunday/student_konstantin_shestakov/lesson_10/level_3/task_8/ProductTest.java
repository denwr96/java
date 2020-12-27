package main.java.javaguru.sunday.student_konstantin_shestakov.lesson_10.level_3.task_8;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class ProductTest {

    public static void main(String[] args) {
        ProductTest productTest = new ProductTest();
        productTest.saveAndfindByTitleTest();
    }

    Database database = new InMemoryDatabase();
    Product product1 = new Product("Book 1");
    Product product2 = new Product("Book 2");

    void saveAndfindByTitleTest() {
        database.save(product1);
        database.save(product2);
        checkResults(database.findByTitle("Book 2").equals(product2), "Find by title test");
    }

    public boolean checkResults(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK");
            return condition;
        } else {
            System.out.println(testName + " = FAIL");
            return !condition;
        }
    }
}
