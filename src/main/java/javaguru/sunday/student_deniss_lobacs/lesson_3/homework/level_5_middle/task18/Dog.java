package javaguru.sunday.student_deniss_lobacs.lesson_3.homework.level_5_middle.task18;

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class Dog {

    String name;

     public Dog(String dogName) {

         this.name = dogName;

     }
     public void doVoice() {

         System.out.println(name + name + name);
     }
}
