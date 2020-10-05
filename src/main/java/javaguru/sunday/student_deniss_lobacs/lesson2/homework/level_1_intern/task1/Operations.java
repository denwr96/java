package main.java.javaguru.sunday.student_deniss_lobacs.lesson2.homework.level_1_intern.task1;

import java.util.Scanner;

public class Operations {

    static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {


        System.out.print("Enter first number: ");
        int numberOne = scn.nextInt();

        System.out.print("Enter first number: ");
        int numberTwo = scn.nextInt();


        System.out.println("Result1: " + (numberOne + numberTwo));
        System.out.println("Result2: " + (numberOne - numberTwo));
        System.out.println("Result3: " + (numberOne * numberTwo));
        System.out.println("Result4: " + (numberOne / numberTwo));

    }
}
