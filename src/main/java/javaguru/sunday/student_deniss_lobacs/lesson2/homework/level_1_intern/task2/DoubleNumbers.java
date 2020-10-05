package main.java.javaguru.sunday.student_deniss_lobacs.lesson2.homework.level_1_intern.task2;

import java.util.Scanner;

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
