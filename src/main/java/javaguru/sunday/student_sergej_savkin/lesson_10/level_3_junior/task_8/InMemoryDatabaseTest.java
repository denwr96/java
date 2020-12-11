package main.java.javaguru.sunday.student_sergej_savkin.lesson_10.level_3_junior.task_8;

import java.util.Arrays;

class InMemoryDatabaseTest {

    public static void main(String[] args) {
        InMemoryDatabaseTest inMemoryDatabaseTest = new InMemoryDatabaseTest();
        inMemoryDatabaseTest.saveProductTest();
        inMemoryDatabaseTest.findByTitleTest();
    }

    InMemoryDatabase inMemoryDatabase = new InMemoryDatabase();

    public void saveProductTest(){
        inMemoryDatabase.save(new Product("Coffee"));
        inMemoryDatabase.save(new Product("Tea"));
        inMemoryDatabase.save(new Product("Mango"));
        inMemoryDatabase.save(new Product("Bread"));
        inMemoryDatabase.save(new Product("Cheese"));

        Product[] expectedArray = new Product[5];

        expectedArray[0] = new Product("Coffee");
        expectedArray[1] = new Product("Tea");
        expectedArray[2] = new Product("Mango");
        expectedArray[3] = new Product("Bread");
        expectedArray[4] = new Product("Cheese");

        check(expectedArray, inMemoryDatabase.productArray, "saveProductTest");
    }

    public void findByTitleTest(){
        inMemoryDatabase.save(new Product("Coffee"));
        inMemoryDatabase.save(new Product("Tea"));
        inMemoryDatabase.save(new Product("Mango"));
        inMemoryDatabase.save(new Product("Bread"));
        inMemoryDatabase.save(new Product("Cheese"));

        check(inMemoryDatabase.findByTitle("Tea").getTitle(), "Tea", "findByTitleTest");
    }

    public void check(Product[] expectedArray, Product[] actualArray, String testName) {
        if(Arrays.deepEquals(expectedArray, actualArray)) {
            System.out.println(testName + " OK!");
        } else {
            System.out.println(testName + " failed!");
        }
    }

    public void check(String actualResult, String expectedResult, String testName) {
        if(actualResult.equals(expectedResult)) {
            System.out.println(testName + " OK!");
        } else {
            System.out.println(testName + " failed!");
        }
    }

}
