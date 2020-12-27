package javaguru.sunday.student_anna_aleksejeva.lesson_10.task_10;

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class Product {

    private String title;

    public Product(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }
}
