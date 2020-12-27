package javaguru.sunday.student_sergej_savkin.lesson_4.level_7_senior.super_task_1;

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class FizzBuzz {
    public String detect(int number) {
        if((number % 3 == 0) && (number % 5 == 0)){
            return "FizzBuzz";
        } else if(number % 5 == 0){
            return "Buzz";
        } else if(number % 3 == 0){
            return "Fizz";
        } else {
            return "" + number;
        }
    }
}
