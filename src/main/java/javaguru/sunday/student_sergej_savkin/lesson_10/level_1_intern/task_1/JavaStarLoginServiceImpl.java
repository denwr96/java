package javaguru.sunday.student_sergej_savkin.lesson_10.level_1_intern.task_1;

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class JavaStarLoginServiceImpl implements JavaStarLoginService {

    @Override
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