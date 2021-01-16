package javaguru.sunday.student_liana_shirmane.lesson_10.level_3;
//task10

import javaguru.sunday.teacher.annotations.CodeReview;
import javaguru.sunday.teacher.annotations.CodeReviewComment;

import java.util.Objects;
import java.util.Optional;

@CodeReview(approved = false)
@CodeReviewComment(comment = "Если вы используете Optional, то перед .get() вы должен проверить, что значение там есть при помощи проверки .isPresent()" +
        "" +
        "NEW: Не, вы чуть-чуть не поняли. Вы сделали isPresent(), это хорошо, но вы не знаете, какой там объект. Надо сначала сделать isPresent() а потом сделать .get() и получить реальный объект и его сравнивать.")
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
        if ((victim.findByTitle("Apple").isPresent())) {
            check(product1, victim.findByTitle("Apple").get(), "Find product in the list");
        } else System.out.println("Product is not present");
    }

    public void check(Product expectedResult, Product actualResult, String testName) {
        if (expectedResult.equals(actualResult)) {
            System.out.println(testName + " has passed!");
        } else {
            System.out.println(testName + " failed!");
            System.out.println("Expected: " + expectedResult + " but Actual: " + actualResult);
        }
    }

        void shouldNotFindProduct () {
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
