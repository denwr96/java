package javaguru.sunday.student_laura_upelniece.lesson3.lvl1;

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class RobotDemo {
    public static void main(String[] args) {

        Robot firstRobot = new Robot(); //Creates Robot class example and saves it's link in variable (makes object)
        firstRobot.sayHello(); //Method sayHello() is called on newRobot object
        firstRobot.sayYourName(); //Method sayYourName() is called on newRobot object

        Robot secondRobot = new Robot("Bob"); //Creates object and passes name parameter TASK 12
        secondRobot.sayHello();
        secondRobot.sayYourName();

        Robot thirdRobot = new Robot("Tom");
        thirdRobot.sayHello();
        thirdRobot.sayYourName();

        Robot fourthRobot = new Robot("Rob");
        fourthRobot.sayHello();
        fourthRobot.sayYourName();

    }
}
