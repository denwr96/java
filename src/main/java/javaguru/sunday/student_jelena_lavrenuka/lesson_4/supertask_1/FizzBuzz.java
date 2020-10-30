package main.java.javaguru.sunday.student_jelena_lavrenuka.lesson_4.supertask_1;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class FizzBuzz {

    // Реализуйте следующие требования:
    // - если переданное число делится на три возвращайте "Fizz"
    // - если переданное число делится на пять возвращайте "Buzz"
    // - если переданное число делится на три и на пять возвращайте "FizzBuzz"
    // - иначе возвращайте само число в виде строки (подсказка: return "" +  number)

    public String fizzBuzzdetect(int number) {
        if (number % 3 == 0 && number % 5 == 0) {
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
