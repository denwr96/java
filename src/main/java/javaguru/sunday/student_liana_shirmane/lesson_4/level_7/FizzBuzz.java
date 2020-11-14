package main.java.javaguru.sunday.student_liana_shirmane.lesson_4.level_7;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class FizzBuzz {
    public String detect(int number) {
        if (div3(number)&& div5(number)) {
            return "FizzBuzz";
        }
        if (div5(number)) {
            return "Buzz";
        }
        if (div3(number)) {
            return "Fizz";
        }
        return "" + number;
    }

    private boolean div3(int number) {
        return number % 3 == 0;
    }

    private boolean div5(int number) {
        return number % 5 == 0;
    }
}
