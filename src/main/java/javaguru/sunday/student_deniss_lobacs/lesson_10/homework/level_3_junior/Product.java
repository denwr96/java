package javaguru.sunday.student_deniss_lobacs.lesson_10.homework.level_3_junior;

import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.ArrayList;
import java.util.Objects;
@CodeReview(approved = true)
public class Product {

    private String title;

    public Product(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

    @Override
    public String toString() {
        return "Product{" +
                "title='" + title + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(title, product.title);
    }


}
