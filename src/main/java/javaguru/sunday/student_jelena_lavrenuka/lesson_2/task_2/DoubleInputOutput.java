package main.java.javaguru.sunday.student_jelena_lavrenuka.lesson_2.task_2;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
public class DoubleInputOutput {

    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);

        System.out.println("");

        System.out.println("Type your first number: ");
        double firstDoubleNumber = Scanner.nextDouble();

        System.out.println("");

        System.out.println("Type your second number: ");
        double secondDoubleNumber = Scanner.nextDouble();

        System.out.println("");

        double sum = firstDoubleNumber + secondDoubleNumber;
        System.out.println("Sum = " + sum);

        double sub = firstDoubleNumber - secondDoubleNumber;
        System.out.println("Subtraction = " + sub);

        double mult = firstDoubleNumber * secondDoubleNumber;
        System.out.println("Multiplication = " + mult);

        double div = firstDoubleNumber / secondDoubleNumber;
        System.out.println("Divide = " + div);

    }
}


