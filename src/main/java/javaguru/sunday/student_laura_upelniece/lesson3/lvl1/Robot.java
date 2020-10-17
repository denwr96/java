package main.java.javaguru.sunday.student_laura_upelniece.lesson3.lvl1;

public class Robot {
    String name; //Creates name property ype String TASK 11

    Robot(String robotName) {   //Creates constructor with one param TASK 12
        this.name = robotName;
    }

    public Robot() {

    }

    public void sayHello() { System.out.println("Hello!"); } //Method sayHello() prints "Hello!"
    //public void sayYourName() { System.out.println("My name is ROBO"); } //Method sayYourName() prints "My name is ROBO"
    public void sayYourName() { System.out.println("My name is " + this.name); } //TASK 13


}
