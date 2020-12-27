package javaguru.sunday.student_deniss_lobacs.lesson_2.homework.level_1_intern.task2;

import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
public class DoubleNumbers {

    static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {


        System.out.print("Enter first number = ");
        double firstDoubleNumber = scn.nextDouble();

        System.out.print("Enter first number = ");
        double secondDoubleNumber = scn.nextDouble();

        System.out.println("Result1: " + (firstDoubleNumber + secondDoubleNumber));
        System.out.println("Result2: " + (firstDoubleNumber - secondDoubleNumber));
        System.out.println("Result3: " + (firstDoubleNumber * secondDoubleNumber));
        System.out.println("Result4: " + (firstDoubleNumber / secondDoubleNumber));

    }
}
