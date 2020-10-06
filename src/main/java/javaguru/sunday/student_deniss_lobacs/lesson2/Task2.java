package main.java.javaguru.sunday.student_deniss_lobacs.lesson2;

import java.util.Scanner;

public class Task2 {

    static Scanner scn = new Scanner(System.in);


    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);


        System.out.print("Enter first number = ");
        double a = scn.nextDouble();

        System.out.print("Enter first number = ");
        double b = scn.nextDouble();

        System.out.println("Result1: " + (a + b));
        System.out.println("Result2: " + (a - b));
        System.out.println("Result3: " + (a * b));
        System.out.println("Result4: " + (a / b));

    }


}