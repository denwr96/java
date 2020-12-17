package main.java.javaguru.sunday.student_natalia_kochkina.lesson_10.level_3.Task_8;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;
import main.java.javaguru.sunday.teacher.annotations.CodeReviewComment;

import java.util.ArrayList;
import java.util.Objects;

//Task_8
@CodeReview(approved = false)
@CodeReviewComment(comment = "Используйте интерфейс коллекции List." +
        "Метод findByTitle можно было сделать проще." +
        "Просто добавить выражение productOneTitle.equals(productTitle)" +
        "в скобки if (), при этом поменять productTitle на productTitle.getTitle()" +
        "" +
        "" +
        "    @Override\n" +
        "    public Product findByTitle(String productTitle) {\n" +
        "        for (Product product : products) {\n" +
        "            if (product.getTitle().equals(productTitle)) {\n" +
        "                return product;\n" +
        "            }\n" +
        "        }\n" +
        "        return null;\n" +
        "    }")
public class InMemoryDatabase implements Database {

    ArrayList<Product> products = new ArrayList<>();

    @Override
    public void save(Product product) {
        products.add(product);

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

}
