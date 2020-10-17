package main.java.javaguru.sunday.student_liana_shirmane.lesson_3.level_1;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class RobotDemo {
    public static void main(String[] args) {
        Robot myRobot = new Robot();
        myRobot.sayHello();
        myRobot.sayYourName();

        Robot myOtherRobot = new Robot();
        myOtherRobot.sayHello();
        myOtherRobot.sayYourName();

        Robot myThirdRobot = new Robot();
        myThirdRobot.sayHello();
        myThirdRobot.sayYourName();
    }
}
