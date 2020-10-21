package main.java.javaguru.sunday.student_deniss_lenenkov.lesson_3.level_1;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class Robot {

    //Task_1_2_3_4_5_6_11_12_13
     public void sayHello(){
         System.out.println("Hello");
     }

     public String name;



     public Robot(String robotName){
         this.name = robotName;




     }
     public void sayYourName(){
         System.out.println("My name is " + this.name);
     }


}
