package javaguru.sunday.student_natalia_kochkina.lesson_10.level_3;

import javaguru.sunday.teacher.annotations.CodeReview;

//Task_7
@CodeReview(approved = true)
class Product {

    private String title;

    public Product(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

}