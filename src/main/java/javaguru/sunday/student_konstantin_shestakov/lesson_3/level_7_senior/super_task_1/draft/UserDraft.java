package javaguru.sunday.student_konstantin_shestakov.lesson_3.level_7_senior.super_task_1.draft;

// Черновик

import javaguru.sunday.teacher.annotations.CodeReview;
import javaguru.sunday.teacher.annotations.CodeReviewComment;

import java.util.Scanner;
@CodeReview(approved = true)
@CodeReviewComment(comment = "Очень сложно читать код =) Но мы потом научимся делать его понятнее.")
class UserDraft {

    String user;
    String password;
    boolean accessBlock;
    int loginAttemptsRemaining;
    boolean userEqualsUserLogin;
    boolean passwordEqualsUserPassword;

    UserDraft(String userLogin, String userPassword, boolean userAccessBlock, int userLoginAttemptsRemaining) {
        this.user = userLogin;
        this.password = userPassword;
        this.accessBlock = userAccessBlock;
        this.loginAttemptsRemaining = userLoginAttemptsRemaining;
    }

    boolean login() {
        System.out.println("Enter user login: ");
        Scanner scanner = new Scanner(System.in);
        String userLogin = scanner.nextLine();
        boolean userEqualsUserLogin = user.equals(userLogin);

        if (userEqualsUserLogin) {

            while (loginAttemptsRemaining > 0) {
                System.out.println("Enter user password: ");
                String userPassword = scanner.nextLine();
                boolean passwordEqualsUserPassword = password.equals(userPassword);

                if (passwordEqualsUserPassword) {
                    System.out.println("Welcome " + user + "!");
                    loginAttemptsRemaining = 3;
                    break;

                } else {

                    if (!passwordEqualsUserPassword) {
                        loginAttemptsRemaining--;
                        System.out.println("Incorrect password, attempts remain: " + loginAttemptsRemaining);

                        if(loginAttemptsRemaining == 0) {
                            accessBlock = true;
                            System.out.println("Your account has been blocked");
                        }
                    }
                }
            }
        }
        else{
            System.out.println("There's no such user.");
        }
//            return this.userEqualsUserLogin;
        return this.passwordEqualsUserPassword;
    }

    int resetLoginAttemptsRemaining() {
        loginAttemptsRemaining = 3;
        return this.loginAttemptsRemaining;
    }

    boolean userAcessBlock(){
        accessBlock = true;
        return this.accessBlock;
    }

}
