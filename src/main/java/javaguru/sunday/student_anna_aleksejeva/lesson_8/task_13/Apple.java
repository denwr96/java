package main.java.javaguru.sunday.student_anna_aleksejeva.lesson_8.task_13;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;
import main.java.javaguru.sunday.teacher.annotations.CodeReviewComment;

@CodeReview(approved = false)
@CodeReviewComment(comment = "А что с названием метода? fruitfruit? Надо назвать правильно.")
public class Apple extends Fruit {
    double appleLength;
    double appleForm;

    public Apple(String fruitName) {
        super(fruitName);
        this.appleLength = appleLength;
        this.appleForm = appleForm;
    }

    void fruitfruit() {
        double fruitfruit = appleLength * appleForm;
        System.out.println(" Apple fruit is " + fruitfruit);
    }
}
