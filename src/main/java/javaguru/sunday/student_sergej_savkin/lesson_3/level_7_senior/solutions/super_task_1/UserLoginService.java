package main.java.javaguru.sunday.student_sergej_savkin.lesson_3.level_7_senior.solutions.super_task_1;

import main.java.javaguru.sunday.teacher.lesson_3.homework.level_7_senior.solutions.super_task_1.User;

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