package javaguru.sunday.student_konstantin_shestakov.lesson_6.level_1;

import javaguru.sunday.teacher.annotations.CodeReview;

// Task 3
@CodeReview(approved = true)
class FizzBuzz {

    public String detect(int number) {

        if ((number % 3 == 0) && (number % 5 == 0)) {
            return "FizzBuzz";
        }
        else if (number % 3 == 0) {
            return "Fizz";
        }
        else if (number % 5 == 0) {
            return "Buzz";
        } else {
            return "" + number;
        }
    }
}
