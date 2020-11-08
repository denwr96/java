package main.java.javaguru.sunday.student_deniss_lobacs.lesson_6.homework.level_1.task3;

public class FizzBuzz {

    public static String detect(int number) {
        if ((number % 3 == 0) && (number % 5 == 0)) {
            return "FizzBuzz";
        } else if (number % 3 == 0) {
            return "Fizz";
        } else if (number % 5 == 0){
            return "Buzz";
        } else {
            return "" + number;
        }
    }
}
