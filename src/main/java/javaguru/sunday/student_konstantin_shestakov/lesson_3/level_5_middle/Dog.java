package main.java.javaguru.sunday.student_konstantin_shestakov.lesson_3.level_5_middle;

// Task 18
// Task 19
// Task 20
// Task 21
// Task 22

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class Dog {

    String name; // Task 18
    int age; // Task 19
    String color;

    Dog(String dogName, int dogAge, String dogColor){
        this.name = dogName;
        this.age = dogAge;
        this.color = dogColor;
    }

    void voice(){
        System.out.println("Dog's name is " + name);
        System.out.println("Dog's color is " + color);
    }

    void voice2(){
        System.out.println("Dog's name is " + name);
        System.out.println("Dog's age is " + age);
    }

    void happyBirthday(){ // Task 20
        age++;
        System.out.println("Happy Birthday " + name + "!!");
    }

    void changeColor(String dogColor){
        this.color = dogColor;
        System.out.println("Dog's color is " + color);
    }
}
