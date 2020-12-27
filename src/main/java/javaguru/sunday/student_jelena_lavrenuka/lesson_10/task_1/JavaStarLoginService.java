package main.java.javaguru.sunday.student_jelena_lavrenuka.lesson_10.task_1;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
public interface JavaStarLoginService {
    boolean canLogin(String login, String password);

    private boolean notNull(String text) {
        return text != null;
    }
}
