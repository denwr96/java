package main.java.javaguru.sunday.student_jelena_lavrenuka.lesson_2.task_1;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
public class OutputInput {

    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);

        System.out.println("");

        System.out.println("Type your first number: ");
        int firstNumber = Scanner.nextInt();

        System.out.println("");

        System.out.println("Type your second number: ");
        int secondnumber = Scanner.nextInt();

        System.out.println("");

        int sum = firstNumber + secondnumber;
        System.out.println("Sum = " + sum);

        int sub = firstNumber - secondnumber;
        System.out.println("Subtraction = " + sub);

        int mult = firstNumber * secondnumber;
        System.out.println("Multiplication = " + mult);

        int div = firstNumber / secondnumber;
        System.out.println("Divide = " + div);

    }
}
