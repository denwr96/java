package javaguru.sunday.student_laura_upelniece.lesson3.lvl5;

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class DogDemo {
    public static void main(String[] args) {

        Dog pug = new Dog("Bread",5, "Black"); //TASK 18
        pug.voice(); //TASK 18
        pug.voice(); //TASK 19
        
        Dog collie = new Dog("Luna", 3, "Brown"); //TASK 20
        collie.voice();
        collie.happyBirthday();                                           //TASK 20
        collie.voice();

        Dog poodle = new Dog("Rosa", 1, "Grey");  //TASK 21
        poodle.voice();
        poodle.changeColor("White");                              //TASK 22
        poodle.voice();

    }
}
