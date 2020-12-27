package javaguru.sunday.student_natalia_kochkina.lesson_10.level_1;

import javaguru.sunday.teacher.annotations.CodeReview;

//Task_1
@CodeReview(approved = true)
class JavaStarLoginServiceImpl implements JavaStarLoginService{

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