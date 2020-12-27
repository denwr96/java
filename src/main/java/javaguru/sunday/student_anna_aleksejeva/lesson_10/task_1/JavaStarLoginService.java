package main.java.javaguru.sunday.student_anna_aleksejeva.lesson_10.task_1;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;
import main.java.javaguru.sunday.teacher.annotations.CodeReviewComment;

@CodeReview(approved = true)
@CodeReviewComment(comment = "А зачем метод notNull в интерфейсе?")
public interface JavaStarLoginService {

    boolean canLogin(String login, String password) ;
    private boolean notNull(String text) {
        return text != null;
    }
}