package main.java.javaguru.sunday.student_sergej_savkin.lesson_3.level_3_junior.task_13;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class RobotDemo {
    public static void main(String[] args) {
        Robot robot1 = new Robot("Rider"); // пусть этого робота зовут "Rider"
        robot1.sayHello();
        robot1.sayYourName();

        Robot robot2 = new Robot("John"); // а этого робота зовут "John"
        robot2.sayHello();
        robot2.sayYourName();
    }
}
