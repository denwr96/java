package main.java.javaguru.sunday.student_artjom_proshkin.lesson_4.level_7_senior.super_task_1;

class FizzBuzz {

    String detect(int number) {
        if ((number % 3 == 0) && (number % 5 == 0)) {
            return "FizzBuzz";
        } else if (number % 5 == 0) {
            return "Buzz";
        } else if (number % 3 == 0) {
            return "Fizz";
        } else {
            return "" + number;
        }
    }
}
