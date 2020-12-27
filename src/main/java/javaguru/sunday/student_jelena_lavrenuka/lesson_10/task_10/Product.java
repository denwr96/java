package javaguru.sunday.student_jelena_lavrenuka.lesson_10.task_10;

import javaguru.sunday.teacher.annotations.CodeReview;

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