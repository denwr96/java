package javaguru.sunday.student_konstantin_shestakov.lesson_10.level_3.task_10;

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class ProductTest {

    public static void main(String[] args) {
        ProductTest productTest = new ProductTest();
        productTest.findByTitleNullPointExceptionTest();
        productTest.findByTitleTest();
    }

    Database database = new DatabaseImpl();
    Product product1 = new Product("Book 1");
    Product product2 = new Product("Book 2");

    void findByTitleNullPointExceptionTest() {
        database.save(product1);
        database.save(product2);
        System.out.println("Null point exception test (for product not included in database) = OK");
        database.findByTitle("Entry not included in database");
    }

    void findByTitleTest() {
        database.save(product1);
        database.save(product2);
        checkResults(database.findByTitle("Book 1").get().equals(product1), "Find by title test");
    }

    void checkResults(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FAIL");
        }
    }
}
