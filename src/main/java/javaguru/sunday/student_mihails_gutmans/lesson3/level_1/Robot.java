package main.java.javaguru.sunday.student_mihails_gutmans.lesson3.level_1;

public class Robot {

    public void sayHello( ) {

        System.out.println ("Hello");
    } // Task_1

    public Robot () {

    } // Task_2

    public void sayYourName(){
        System.out.println("My name is Robo ");

    }

    public String name; // Task_11
    public Robot (String name) {
        this.name = name;
    }
    public void sayYourRealName(){

        System.out.println("My real name is " + this.name);
    }
}