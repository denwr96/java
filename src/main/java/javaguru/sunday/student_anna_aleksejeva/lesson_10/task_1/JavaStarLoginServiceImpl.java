package main.java.javaguru.sunday.student_anna_aleksejeva.lesson_10.task_1;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class JavaStarLoginServiceImpl {

    public boolean canLogin(String login, String password) {
        return notNull(login)
                && login.equals("javastar")
                && notNull(password)
                && password.equals("pass");
    }

    private boolean notNull(String text) {
        return text != null;
    }
}

