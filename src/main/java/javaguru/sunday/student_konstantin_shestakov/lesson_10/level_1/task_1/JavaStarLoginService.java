package main.java.javaguru.sunday.student_konstantin_shestakov.lesson_10.level_1.task_1;

// Task 1

interface JavaStarLoginService {

    public boolean canLogin(String login, String password);

    private boolean notNull(String text) {
        return text != null;
    }
}
