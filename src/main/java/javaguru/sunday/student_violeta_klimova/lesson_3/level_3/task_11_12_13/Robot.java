package main.java.javaguru.sunday.student_violeta_klimova.lesson_3.level_3.task_11_12_13;

//Task 11
//Task 12
//Task 13

class Robot {

    String name;

    Robot (String robotName) {
        this.name = robotName;
    }

    public void sayHello() {
        System.out.println("Hello!");
    }

    public void sayYourName() {
        System.out.println("My name is " + this.name);
    }

}
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