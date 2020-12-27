package javaguru.sunday.student_liana_shirmane.lesson_3.level_7;

import javaguru.sunday.teacher.annotations.CodeReview;
import javaguru.sunday.teacher.annotations.CodeReviewComment;

@CodeReview(approved = true)
class User {
    String login;
    String password;
    boolean block;
    int attempts;

    User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    void blockUser() {
        block = true;
    }

    int attepmtsDrop() {
        attempts = 0;
        return attempts;
    }
}