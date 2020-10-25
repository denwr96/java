package main.java.javaguru.sunday.student_artjom_proshkin.lesson_3.level_5_middle;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;
import main.java.javaguru.sunday.teacher.annotations.CodeReviewComment;

// Task_18
// Task_19
// Task_20
// Task_21
// Task_22
@CodeReview(approved = false)
@CodeReviewComment(comment = "очень плохо с форматом кода. Мы не пишем целые конструкции в строчку. Надо поправить конструкторы")
class Dog {

    String dogName;
    int dogAge;
    String dogColour;

    Dog(String dogName){
        this.dogName = dogName;
    }
    Dog(String dogName,int dogAge){
        this.dogName = dogName;
        this.dogAge = dogAge;
    }
    Dog(String dogName,int dogAge, String dogColour){
        this.dogName = dogName;
        this.dogAge = dogAge;
        this.dogColour = dogColour;
    }

    void voice3 (){
        System.out.print(dogName + " ");
        System.out.print(dogName + " ");
        System.out.println(dogName + " ");
    }

    void voice (){
        System.out.println(dogName + " " + dogAge + " " + dogColour);
    }

    void happyBirthday(){
        dogAge = dogAge + 1;
    }

    void changeColour(String newColour){
        dogColour = newColour;
    }

}
