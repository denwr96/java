package javaguru.sunday.student_sergej_savkin.lesson_3.level_5_middle.task_19;

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class Dog {
    String dogName;
    int dogAge;

    Dog(String dogName, int dogAge){

        this.dogName = dogName;
        this.dogAge = dogAge;
    }
    void voice(){

        System.out.println(dogName);
        System.out.println(dogAge);

    }
}
