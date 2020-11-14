package main.java.javaguru.sunday.student_natalia_kochkina.lesson_4.level_7;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;
import main.java.javaguru.sunday.teacher.annotations.CodeReviewComment;

//Super_task_1
@CodeReview(approved = true)
public class FizzBuzz {

    public String detect(int number) {
        // Реализуйте следующие требования:
        // - если переданное число делится на три возвращайте "Fizz"
        if (((number % 3) == 0) && ((number % 5) != 0)) {
            return "Fizz";
        }
        // - если переданное число делится на пять возвращайте "Buzz"
        else if (((number % 5) == 0) && ((number % 3) != 0)) {
            return "Buzz";
        }
        // - если переданное число делится на три и на пять возвращайте "FizzBuzz"
        else if (number % 5 == 0) {
            return "FizzBuzz";
        } else {
            return "" + number;
        }
        // - иначе возвращайте само число в виде строки (подсказка: return "" +  number)

    }
}
