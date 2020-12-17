package main.java.javaguru.sunday.student_natalia_kochkina.lesson_10.level_1;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;
import main.java.javaguru.sunday.teacher.annotations.CodeReviewComment;

//Task_1
@CodeReview(approved = true)
@CodeReviewComment(comment = "Все методы интерфейса, по дефолту публичные. public можно не писать")
public interface JavaStarLoginService {

    public boolean canLogin(String login, String password);

}
