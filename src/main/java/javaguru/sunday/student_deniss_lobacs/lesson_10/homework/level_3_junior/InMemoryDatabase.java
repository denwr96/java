package javaguru.sunday.student_deniss_lobacs.lesson_10.homework.level_3_junior;

import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.ArrayList;
@CodeReview(approved = true)
public class InMemoryDatabase implements Database {

    private ArrayList<Product> products;

    public InMemoryDatabase() {
        this.products = new ArrayList<Product>();
    }

    @Override
    public void save(Product product) {
        this.products.add(product);
    }

    @Override
    public Product findByTitle(String productTitle) {
        for (Product product : products) {
            if (product.getTitle().equals(productTitle)) {
                return product;
            }
        }
        return null;
    }

    public boolean check(Product product) {
        return products.contains(product);
    }

}
