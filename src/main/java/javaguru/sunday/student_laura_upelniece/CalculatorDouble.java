package main.java.javaguru.sunday.student_laura_upelniece;

import java.util.Scanner;
//Imports scanner methods

public class CalculatorDouble {
    public static void main(String[] args) {

        //Adds first input
        Scanner scan1 = new Scanner(System.in);
        double firstNumber = scan1.nextDouble();

        //Adds second input
        Scanner scan2 = new Scanner(System.in);
        double secondNumber = scan2.nextDouble();

        //Stores answers in variables
        double sum = firstNumber + secondNumber;
        double sub = firstNumber - secondNumber;
        double multi = firstNumber * secondNumber;
        double div = firstNumber / secondNumber;

        System.out.println("Sum of numbers: " + sum);
        System.out.println("Difference of numbers: " + sub);
        System.out.println("Multiplication of numbers: " + multi);
        System.out.println("Division of numbers: " + div);
    }
}
