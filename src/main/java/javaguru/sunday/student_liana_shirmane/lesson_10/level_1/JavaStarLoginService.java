package javaguru.sunday.student_liana_shirmane.lesson_10.level_1;

import javaguru.sunday.teacher.annotations.CodeReview;

//task1
@CodeReview(approved = true)
public interface JavaStarLoginService {

    boolean canLogin(String login, String password);

    private boolean notNull(String text) {
        return text != null;
    }
}
