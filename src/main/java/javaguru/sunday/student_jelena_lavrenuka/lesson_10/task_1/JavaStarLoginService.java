package main.java.javaguru.sunday.student_jelena_lavrenuka.lesson_10.task_1;

public interface JavaStarLoginService {
    boolean canLogin(String login, String password);

    private boolean notNull(String text) {
        return text != null;
    }
}
