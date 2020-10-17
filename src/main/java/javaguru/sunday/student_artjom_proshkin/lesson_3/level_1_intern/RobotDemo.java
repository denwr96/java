package main.java.javaguru.sunday.student_artjom_proshkin.lesson_3.level_1_intern;

// Task_3
// Task_4
// Task_5
// Task_6
// Task_11
// Task_12
// Task_13

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class RobotDemo {

    public static void main(String[] args) {
        Robot myNewRobot = new Robot();
        myNewRobot.sayHello();

        Robot myNewRobot1 = new Robot("Terminator");
        myNewRobot1.sayHello();
        myNewRobot1.sayYourName();

        Robot myNewRobot2 = new Robot("WALL-E");
        myNewRobot2.sayHello();
        myNewRobot2.sayYourName();



    }
}
