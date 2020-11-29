package main.java.javaguru.sunday.student_deniss_lobacs.lesson_4.level_7_senior.super_task_1;

public class FizzBuzz {

    public String detect(int number) {

        if (number % 3 == 0 && number % 5 == 0) {
            return "FizzBuzz";
        }   else if (number % 3 == 0) {
            return "Fizz";
        }   else if (number % 5 == 0) {
            return "Buzz";
        }   else {
            return "" + number;
        }
    }
}
