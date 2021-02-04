package javaguru.sunday.student_artjom_proshkin.lesson_6.level_1.task_3;

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class FizzBuzz {

    public String detect(int number) {
        if ((number % 3 == 0) && (number % 5 == 0)){
            return "FizzBuzz";
        } else if (number % 3 == 0) {
            return "Fizz";
        }else if (number % 5 == 0) {
            return "Buzz";
        }
        else return Integer.toString(number);
    }
}
