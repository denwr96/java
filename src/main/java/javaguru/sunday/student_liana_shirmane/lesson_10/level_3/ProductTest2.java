package javaguru.sunday.student_liana_shirmane.lesson_10.level_3;
//task10

import javaguru.sunday.teacher.annotations.CodeReview;
import javaguru.sunday.teacher.annotations.CodeReviewComment;

@CodeReview(approved = false)
@CodeReviewComment(comment = "Если вы используете Optional, то перед .get() вы должен проверить, что значение там есть при помощи проверки .isPresent()")
public class ProductTest2 {
    public static void main(String[] args) {
        ProductTest2 productTest = new ProductTest2();
        productTest.shouldFindProduct();
        productTest.shouldNotFindProduct();
    }
    void shouldFindProduct() {
        Database2 victim = new InMemoryDatabase2();
        Product product1 = new Product("Apple");
        Product product2 = new Product("Banana");
        victim.save(product1);
        victim.save(product2);
        if (victim.findByTitle("Apple").get().equals(product1)) {
            System.out.println("Find product in the list has passed!");
        } else System.out.println("Find product in the list has failed!");

    }

    void shouldNotFindProduct() {
        Database2 victim = new InMemoryDatabase2();
        Product product1 = new Product("Apple");
        Product product2 = new Product("Banana");
        victim.save(product1);
        victim.save(product2);
        if (victim.findByTitle("Carrot").isEmpty()) {
            System.out.println("Do not find product in the list has passed!");
        } else System.out.println("Do not find product in the list has failed!");
    }

}
