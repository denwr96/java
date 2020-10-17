package main.java.javaguru.sunday.student_laura_upelniece.lesson3.lvl5;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class DogDemo {
    public static void main(String[] args) {

        Dog pug = new Dog("Bread",5); //TASK 18
        pug.voice(pug.name); //TASK 18
        pug.voice(pug.name, pug.age); //TASK 19
        
        Dog collie = new Dog("Luna", 3); //TASK 20
        collie.voice(collie.name, collie.age);
        collie.happyBirthday();
        collie.voice(collie.name, collie.age);

    }
}
