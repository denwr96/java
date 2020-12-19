package main.java.javaguru.sunday.student_anna_aleksejeva.lesson_10.task_1;

public interface JavaStarLoginService {

    boolean canLogin(String login, String password) ;
    private boolean notNull(String text) {
        return text != null;
    }
}
