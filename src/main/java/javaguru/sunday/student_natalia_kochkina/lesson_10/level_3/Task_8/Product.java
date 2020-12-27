package javaguru.sunday.student_natalia_kochkina.lesson_10.level_3.Task_8;

import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Objects;

//Task_8
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
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(title, product.title);
    }

}