package main.java.javaguru.sunday.student_artjom_proshkin.lesson_2.level_1_intern.task_2;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
public class OperationsDouble {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hi! I'll be glad to calculate instead of you, give me a number : ");
        double firstDoubleNumber = scanner.nextDouble();

        System.out.println("Good job! How about you give me another number : ");
        double secondDoubleNumber = scanner.nextDouble();

        System.out.println("Results are here:");
        System.out.println("Sum of numbers is : " + (firstDoubleNumber + secondDoubleNumber));
        System.out.println("Difference of numbers is : " + (firstDoubleNumber - secondDoubleNumber));
        System.out.println("Multiplication result is : " + (firstDoubleNumber * secondDoubleNumber));
        System.out.println("Division of numbers is : " + (firstDoubleNumber / secondDoubleNumber));

    }
}
