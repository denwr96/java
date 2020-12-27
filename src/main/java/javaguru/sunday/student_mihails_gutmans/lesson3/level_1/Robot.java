package javaguru.sunday.student_mihails_gutmans.lesson3.level_1;

import javaguru.sunday.teacher.annotations.CodeReview;
import javaguru.sunday.teacher.annotations.CodeReviewComment;

@CodeReview(approved = true)
@CodeReviewComment(comment = "Давайте договоримся, что вы просто будете в самом верху класса писать задания" +
        "которые он в себя включает. Я сам пойму, где что, а то из за этого у вас страдает формат." +
        "Переменные должны находиться сверху")
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