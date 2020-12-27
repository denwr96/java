package javaguru.sunday.student_sergej_savkin.lesson_3.level_7_senior.solutions.super_task_1;

import javaguru.sunday.teacher.annotations.CodeReview;
import javaguru.sunday.teacher.lesson_3.homework.level_7_senior.solutions.super_task_1.User;

@CodeReview(approved = true)
public class UserLoginService {

	public boolean login(User user, String password){
		if (user.isBlocked()) {
			return false;
		}
		if (user.isPasswordEquals(password)) {
			user.unblock();
			return true;
		} else {
			user.reduceLoginAttempts();
			return false;
		}
	}

}