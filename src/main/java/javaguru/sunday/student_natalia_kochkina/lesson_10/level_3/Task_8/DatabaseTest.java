package javaguru.sunday.student_natalia_kochkina.lesson_10.level_3.Task_8;

import javaguru.sunday.teacher.annotations.CodeReview;

//Task_8
@CodeReview(approved = true)
public class DatabaseTest {
    public static void main(String[] args) {
        DatabaseTest databaseTest = new DatabaseTest();
        databaseTest.Test1();
        databaseTest.Test2();
    }


    public void Test1() {
        Database database = new InMemoryDatabase();
        Product productOne = new Product("Milk");
        database.save(productOne);
        Product productTwo = database.findByTitle("Milk");
        if (productTwo.equals(productOne)) {
            System.out.println("Test1 OK");
        } else {
            System.out.println("Test1 FAILED");
        }
    }

    public void Test2() {
        Database database = new InMemoryDatabase();
        Product productOne = new Product("Milk");
        Product productTwo = new Product("Meat");
        database.save(productOne);
        database.save(productTwo);
        Product productThree = database.findByTitle("Car");
        if (productThree == null) {
            System.out.println("Test2 OK");
        } else {
            System.out.println("Test2 FAILED");
        }
    }
}
