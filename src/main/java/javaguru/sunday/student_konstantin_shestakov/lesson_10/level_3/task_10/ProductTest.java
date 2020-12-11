package main.java.javaguru.sunday.student_konstantin_shestakov.lesson_10.level_3.task_10;

class ProductTest {

    public static void main(String[] args) {
        ProductTest productTest = new ProductTest();
        productTest.findByTitleNullPointExceptionTest();
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
}
