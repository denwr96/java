package main.java.javaguru.sunday.student_liana_shirmane.lesson_10.level_1;
//task1

public interface JavaStarLoginService {

    boolean canLogin(String login, String password);

    private boolean notNull(String text) {
        return text != null;
    }
}
