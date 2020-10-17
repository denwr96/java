package main.java.javaguru.sunday.student_nataliya_sinitsa.lesson3.level1;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

//Task 1 --> Task 6 + Task 11 --> Task 13 (level 3)
@CodeReview(approved = true)
class RobotDemo {

    public static void main(String[] args) {
        /*
        Robot robot1 = new Robot ();
        robot1.sayHello();
        robot1.sayYourName();

        Robot robot2 = new Robot ();
        robot2.sayHello();
        robot2.sayYourName();
        */

        Robot robot1 = new Robot ("Rider");
        robot1.sayHello();
        robot1.sayYourName();

        Robot robot2 = new Robot ("John");
        robot2.sayHello();
        robot2.sayYourName();

    }

}
