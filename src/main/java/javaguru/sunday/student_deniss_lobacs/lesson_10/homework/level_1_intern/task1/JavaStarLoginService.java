package main.java.javaguru.sunday.student_deniss_lobacs.lesson_10.homework.level_1_intern.task1;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;
import main.java.javaguru.sunday.teacher.annotations.CodeReviewComment;

@CodeReview(approved = true)
@CodeReviewComment(comment = "Описывая интерфейс, можно не писать слово public." +
        "У интерфейса все метода по дефолту public")
public interface JavaStarLoginService {

    public boolean canLogin(String login, String password);

}
