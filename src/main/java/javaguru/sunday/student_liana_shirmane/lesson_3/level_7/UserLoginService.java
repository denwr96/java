package javaguru.sunday.student_liana_shirmane.lesson_3.level_7;

import javaguru.sunday.teacher.annotations.CodeReview;
import javaguru.sunday.teacher.annotations.CodeReviewComment;

@CodeReview(approved = false)
@CodeReviewComment(comment = "Не похоже, что тут выполнены все требования задания. Недо блокировки после " +
        "неудачных попыток")
class UserLoginService {

    boolean login(User user, String password) {
        if (password == password)
            return true;


        UserLoginService service = new UserLoginService();
        User userOne = new User("user-login", "user-password");
        return false;
    }
}
