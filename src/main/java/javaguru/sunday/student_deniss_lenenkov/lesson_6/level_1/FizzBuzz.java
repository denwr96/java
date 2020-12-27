package javaguru.sunday.student_deniss_lenenkov.lesson_6.level_1;

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class FizzBuzz {

   public String detect(int initialNumber){
       if(initialNumber % 3 == 0 && initialNumber % 5 == 0){
           return "FizzBuzz";
       }else if(initialNumber % 3 == 0){
           return "Fizz";
       }else if(initialNumber % 5 == 0){
           return "Buzz";
       }else{
           return Integer.toString(initialNumber);
       }
   }
}
