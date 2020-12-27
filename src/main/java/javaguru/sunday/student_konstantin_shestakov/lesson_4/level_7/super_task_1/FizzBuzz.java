package javaguru.sunday.student_konstantin_shestakov.lesson_4.level_7.super_task_1;

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class FizzBuzz {

    String fizz = "Fizz";
    String buzz = "Buzz";

    public String detect(int number) {

        if (number % 3 == 0 && number % 5 ==0){
            return fizz+buzz;
        }
        else if (number % 3 == 0) {
            return fizz;
        }
        else if (number % 5 == 0) {
            return buzz;
        }
        else{
            return "" + number;
        }

    }
}