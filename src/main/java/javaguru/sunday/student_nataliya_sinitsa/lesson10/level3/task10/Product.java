package main.java.javaguru.sunday.student_nataliya_sinitsa.lesson10.level3.task10;

//Task 7 -> Task 8

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Objects;
@CodeReview(approved = true)
class Product {

    private String title;

    public Product(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;
        Product product = (Product) o;
        return title.equals(product.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title);
    }
}
