package main.java.javaguru.sunday.student_anna_aleksejeva.lesson_10.task_10;

public class InMemoryDatabaseTest {

    public static void main(String[] args) {
        InMemoryDatabaseTest test = new InMemoryDatabaseTest();
        test.inMemoryDatabaseTest();
    }

    public void inMemoryDatabaseTest() {
        InMemoryDatabase vic = new InMemoryDatabase();
        Product prod = new Product("Snickers ");
        Product prod1 = new Product("Milka ");
        Product prod2 = new Product("Laima");
        vic.save(prod);
        vic.save(prod1);
        vic.save(prod2);
        if (vic.findByTitle("Milka ").get().equals(prod1)) {
            System.out.println("Is okay ");
        } else {
            System.out.println("Is failed ");
        }
    }
}