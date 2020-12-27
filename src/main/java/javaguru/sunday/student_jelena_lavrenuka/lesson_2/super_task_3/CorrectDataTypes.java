package javaguru.sunday.student_jelena_lavrenuka.lesson_2.super_task_3;

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class CorrectDataTypes {
    public static void main(String[] args) {

        int numberOne = 10;
        double numberTwo = 20.0;

        System.out.println("Number 1 = " + numberOne);
        System.out.println("Number 2 = " + numberTwo);

        double sum = numberOne + numberTwo;
        /* исправлен тип суммы */
        System.out.println("Sum = " + sum);
    }

}

