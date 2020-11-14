package main.java.javaguru.sunday.student_nataliya_sinitsa.lesson6.level1.task3;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

// ? нужно ли свойство класса initialNumber? Или метод detect можно реализовать без него?
// ! Метод можно реализовать без него
@CodeReview(approved = true)
class FizzBuzz {

    public String detect(int number) {
        if ((number % 3 == 0) && (number % 5 == 0)) return "FizzBuzz";
        else if (number % 3 == 0) return "Fizz";
        else if (number % 5 == 0) return "Buzz";
        else return "" + number; // Integer.toString(initialNumber);
    }

}
