package main.java.javaguru.sunday.student_laura_upelniece.lesson2.lvl1;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Scanner;
//Imports scanner methods

@CodeReview(approved = true)
class CalculatorDouble {
    public static void main(String[] args) {

        //Makes Scanner and prints input message
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two numbers: ");

        //Saves input to variables
        double firstNumber = scan.nextDouble();
        double secondNumber = scan.nextDouble();


        //Stores answers in variables
        double sum = firstNumber + secondNumber;
        double sub = firstNumber - secondNumber;
        double multi = firstNumber * secondNumber;
        double div = firstNumber / secondNumber;

        //Prints result
        System.out.println("Sum of numbers: " + sum);
        System.out.println("Difference of numbers: " + sub);
        System.out.println("Multiplication of numbers: " + multi);
        System.out.println("Division of numbers: " + div);
    }
}
