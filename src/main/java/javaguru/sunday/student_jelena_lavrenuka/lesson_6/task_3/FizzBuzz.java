package javaguru.sunday.student_jelena_lavrenuka.lesson_6.task_3;

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class FizzBuzz {

    //private int initialNumber;

    public String detect(int number) {
        //this.initialNumber = number;
        if ((number % 3 == 0) && (number % 5 == 0)) return "FizzBuzz";
        else if (number % 3 == 0) return "Fizz";
        else if (number % 5 == 0) return "Buzz";
        else return "" + number; // Integer.toString(initialNumber);
    }
}

