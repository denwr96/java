package javaguru.sunday.student_konstantin_shestakov.lesson_3.level_3_junior;

import javaguru.sunday.teacher.annotations.CodeReview;

// Task12
// Task 13
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
