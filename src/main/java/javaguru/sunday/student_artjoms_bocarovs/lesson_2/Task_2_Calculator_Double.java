package main.java.javaguru.sunday.student_artjoms_bocarovs.lesson_2;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
public class Task_2_Calculator_Double {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double firstDoubleNumber = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double secondDoubleNumber = scanner.nextDouble();

        System.out.println(" ");
        System.out.println("Addition: " + (firstDoubleNumber + secondDoubleNumber));
        System.out.println("Subtraction: " + (firstDoubleNumber - secondDoubleNumber));
        System.out.println("Multiplication: " + (firstDoubleNumber * secondDoubleNumber));
        System.out.println("Division: " + (firstDoubleNumber / secondDoubleNumber));

    }

}
