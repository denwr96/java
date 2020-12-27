package javaguru.sunday.student_anna_aleksejeva.lesson_8.task_13;

import javaguru.sunday.teacher.annotations.CodeReview;
import javaguru.sunday.teacher.annotations.CodeReviewComment;

@CodeReview(approved = false)
@CodeReviewComment(comment = "Не должно быть методов в одну строчку.")
abstract class Fruit {
    protected String fruitName;

    public Fruit(String shapeName){this.fruitName = fruitName;}

    abstract void fruitfruit();
}

