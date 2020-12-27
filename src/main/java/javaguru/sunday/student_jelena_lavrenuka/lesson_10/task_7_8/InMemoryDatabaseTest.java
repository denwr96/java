package main.java.javaguru.sunday.student_jelena_lavrenuka.lesson_10.task_7_8;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;
import main.java.javaguru.sunday.teacher.annotations.CodeReviewComment;

@CodeReview(approved = true)
@CodeReviewComment(comment = "Можно было бы еще null вариант проверить.")
class InMemoryDatabaseTest {
    public static void main(String[] args) {
        InMemoryDatabaseTest test = new InMemoryDatabaseTest();
        test.inMemoryDatabaseTest1();
        test.inMemoryDatabaseTest2();
    }

    public void inMemoryDatabaseTest1() {
        InMemoryDatabase victim = new InMemoryDatabase();
        Product product = new Product("Coca-Cola");
        Product product1 = new Product("Fanta");
        Product product2 = new Product("Sprite");
        victim.save(product);
        victim.save(product1);
        victim.save(product2);
        if (victim.findByTitle("Fanta").equals(product1)) {
            System.out.println("inMemoryDatabaseTest1 is OK");
        }else{
            System.out.println("inMemoryDatabaseTest1 is failed");
        }
    }

    public void inMemoryDatabaseTest2() {
        InMemoryDatabase victim = new InMemoryDatabase();
        Product product = new Product("Coca-Cola");
        Product product1 = new Product("Fanta");
        Product product2 = new Product("Sprite");
        victim.save(product);
        victim.save(product1);
        victim.save(product2);
        if (victim.findByTitle("Fanta") != null) {
            System.out.println("inMemoryDatabaseTest2 is OK");
        }else{
            System.out.println("inMemoryDatabaseTest2 is failed");
        }
    }
}
