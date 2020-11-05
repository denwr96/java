package main.java.javaguru.sunday.student_mihails_gutmans.lesson3.level_1;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class RobotDemo {
    public static void main (String[] args){

        Robot myFirstRobot = new Robot(); // Task_3 , peremennaja myRobot

        myFirstRobot.sayHello(); // Task_4

        myFirstRobot.sayYourName(); // Task_5

        Robot mySecondRobor = new Robot();
        mySecondRobor.sayHello();
        mySecondRobor.sayYourName();

        Robot myThirdRobot = new Robot();
        myThirdRobot.sayYourName();
        myThirdRobot.sayHello(); // Task_6

        Robot myFourthRoboth = new Robot("Janis");
        myFourthRoboth.sayYourRealName();

        Robot myFivesRobot = new Robot ("Peteris");
        myFivesRobot.sayYourRealName();
        myFivesRobot.sayHello(); //Task_12 + Tas_13 ( sdelal otdlejnij metod sayYourRealName )

    }

}
