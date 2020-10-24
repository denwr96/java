package main.java.javaguru.sunday.student_laura_upelniece.lesson2.lvl1;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
class CalculatorInt {
    public static void main(String[] args) {

        //Makes scanner, prints input message, stores input in variables
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int firstNumber = scan.nextInt();
        int secondNumber = scan.nextInt();

        //Stores answers in variables
        int sum = firstNumber + secondNumber;
        int sub = firstNumber - secondNumber;
        int multi = firstNumber * secondNumber;
        int div = firstNumber / secondNumber;

        //Prints result
        System.out.println("Sum of numbers: " + sum);
        System.out.println("Difference of numbers: " + sub);
        System.out.println("Multiplication of numbers: " + multi);
        System.out.println("Division of numbers: " + div);
    }

}
