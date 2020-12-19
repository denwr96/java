package main.java.javaguru.sunday.student_anna_aleksejeva.lesson_10.task_7_8;

// не могу разобраться, в чем именно проблема...
class InMemoryDatabaseTest {

    public static void main(String[] args) {
        InMemoryDatabaseTest test = new InMemoryDatabaseTest();
        test.inMemoryDatabaseTest();
        test.returnNull();
    }

    public void inMemoryDatabaseTest() {
        InMemoryDatabase vic = new InMemoryDatabase();
        Product prod = new Product("Snickers ");
        Product prod1 = new Product("Milka ");
        Product prod2 = new Product("Laima");
        vic.save(prod);
        vic.save(prod1);
        vic.save(prod2);
        if (vic.findByTitle("Milka ").equals(prod1)) {
            System.out.println("Is okay ");
        } else {
            System.out.println("Is failed ");
        }

    }

    public void returnNull() {
        InMemoryDatabase vic = new InMemoryDatabase();
        Product prod = new Product("Snickers ");
        Product prod1 = new Product("Milka ");
        Product prod2 = new Product("Laima");
        vic.save(prod);
        vic.save(prod1);
        vic.save(prod2);
        if (vic.findByTitle("Twix") == null) {
            System.out.println("Is failed");
        }
    }
}