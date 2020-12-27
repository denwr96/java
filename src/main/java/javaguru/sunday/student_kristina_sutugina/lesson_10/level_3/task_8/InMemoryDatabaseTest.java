package javaguru.sunday.student_kristina_sutugina.lesson_10.level_3.task_8;

class InMemoryDatabaseTest {
    public static void main(String[] args) {
        InMemoryDatabaseTest inMemoryDatabaseTest = new InMemoryDatabaseTest();
        inMemoryDatabaseTest.saveTest();
    }

    public void saveTest() {
        Database database = new InMemoryDatabase();
        Product product1 = new Product("Apple");
        Product product2 = new Product("Banana");
        database.save(product1);
        database.save(product2);
        check(database.findByTitle("Banana").equals(product2), "saveTest");

    }

    public void check(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " passed");
        } else {
            System.out.println(testName + " failed");
        }
    }
}
