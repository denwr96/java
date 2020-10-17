package main.java.javaguru.sunday.student_laura_upelniece.lesson3.lvl5;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class Dog {
    String name; //TASK 18
    int age;     //Task 19
    String color;


    public Dog(String dogName, int dogAge) {  //Creates dog object with param as a dogs name TASK 18, creates age param TASK 19, creates color param
        this.name = dogName;
        System.out.println("Dogs name: " + dogName);

        this.age = dogAge;
        System.out.println("Dogs age: " + dogAge);

    }

    public void voice(String dogName) {  //TASK 18
        this.name = dogName;
        System.out.println(this.name + " " + this.name + " " + this.name); //Prints dog name three times
    }

    public void voice(String dogName, int dogAge) {   //TASK 19
        this.name = dogName;
        this.age = dogAge;
        System.out.println(this.name + " " + this.age); //Prints dog name and age
    }
    public void happyBirthday() {   //TASK 20
        this.age = age + 1;

    }

    public void voice(String dogName, int dogAge, String dogColor) {
        System.out.println(this.name + this.age + this.color);
    }

}
