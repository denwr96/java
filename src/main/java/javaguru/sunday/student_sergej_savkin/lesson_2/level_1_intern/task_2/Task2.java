package javaguru.sunday.student_sergej_savkin.lesson_2.level_1_intern.task_2;

import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
public class Task2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter first number:");
        double firstDoubleNumber = scanner.nextDouble();

        System.out.println("PLease enter second number:");
        double secondDoubleNumber = scanner.nextDouble();

        System.out.println("The sum of entered numbers is: " + (firstDoubleNumber + secondDoubleNumber));
        System.out.println("The difference of entered numbers is: " + (firstDoubleNumber - secondDoubleNumber));
        System.out.println("The multiplication of entered numbers is: " + (firstDoubleNumber * secondDoubleNumber));
        System.out.println("The division of entered numbers is: " + (firstDoubleNumber / secondDoubleNumber));
    }
}
