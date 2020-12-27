package javaguru.sunday.student_glebs_surtajevs.lesson_3.level_3;

//Task_11
//Task_12
//Task_13

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class RobotDemo {

    public static void main(String[] args) {

        Robot robot1 = new Robot("Rider");
        robot1.sayHello();
        robot1.sayYourName();

        Robot robot2 = new Robot("John");
        robot2.sayHello();
        robot2.sayYourName();
    }
}
