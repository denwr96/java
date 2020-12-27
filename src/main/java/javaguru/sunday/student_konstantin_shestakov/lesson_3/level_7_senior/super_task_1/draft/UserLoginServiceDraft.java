package javaguru.sunday.student_konstantin_shestakov.lesson_3.level_7_senior.super_task_1.draft;

// Черновик

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class UserLoginServiceDraft {

    public static void main(String[] args) {
        UserDraft userOne = new UserDraft("userOne","qwerty1",false, 3);
        userOne.login();
        userOne.userAcessBlock();
        userOne.resetLoginAttemptsRemaining();
    }
}
