package javaguru.sunday.student_deniss_lobacs.lesson_3.homework.level_3_junior.task13;

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class RobotDemo {
    public static void main(String[] args) {

        Robot robot1 = new Robot("Rider");
        robot1.sayHello();
        robot1.sayYourName();

        Robot robot2 = new Robot("John");
        robot2.sayHello();
        robot2.sayYourName();

    }
}
