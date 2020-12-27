package javaguru.sunday.student_sergej_savkin.lesson_6.level_1.task_3;

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class FizzBuzz {

    public String detect(int initialNumber) {
        if ((initialNumber % 3 == 0) && (initialNumber % 5 == 0)) {
            return "FizzBuzz";
        }
        else if (initialNumber % 3 == 0) {
            return "Fizz";
        }
        else if (initialNumber % 5 == 0) {
            return "Buzz";
        } else {
            return Integer.toString(initialNumber);
        }
    }
}
