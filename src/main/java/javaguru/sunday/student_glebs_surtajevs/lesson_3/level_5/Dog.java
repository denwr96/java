package javaguru.sunday.student_glebs_surtajevs.lesson_3.level_5;

import javaguru.sunday.teacher.annotations.CodeReview;
import javaguru.sunday.teacher.annotations.CodeReviewComment;

//Task_18
//Task_19
//Task_20
//Task_21
//Task_22
@CodeReview(approved = true)
class Dog {

    String name;
    int age;
    String color;

    Dog(String dogName, int dogAge, String dogColor) {
        this.name = dogName;
        this.age = dogAge;
        this.color = dogColor;
    }
    void voice1() {
        System.out.println(this.name +" "+ this.name +" "+ this.name);
    }
    void voice2() {
        System.out.println(this.name +" "+ this.age + " years old");
    }
    void happyBirthday() {
        System.out.println(this.age + 1 + " years old");
    }
    void color() {
        System.out.println(this.name + " " + this.age + " years old " + this.color);
    }
    void changeColor(String newColor) {
        this.color = newColor;
    }
    void voice3() {
        System.out.println(this.name + " " + this.color + " " + this.name);
    }

}

