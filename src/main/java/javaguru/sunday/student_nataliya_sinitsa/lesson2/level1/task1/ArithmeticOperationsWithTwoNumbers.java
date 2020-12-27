package javaguru.sunday.student_nataliya_sinitsa.lesson2.level1.task1;

import java.util.Scanner;

public class ArithmeticOperationsWithTwoNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number");
        int firstNumber = scanner.nextInt();

        System.out.println("Enter second number");
        int secondNumber = scanner.nextInt();

        int sum = firstNumber + secondNumber;
        int subtraction = firstNumber - secondNumber;
        int multiplication = firstNumber * secondNumber;
        double division = firstNumber / (double) secondNumber; // возможно деление с остатком, int не годится

        System.out.println("Sum = " + sum);
        System.out.println("Difference = " + subtraction);
        System.out.println("Multiplication = "+ multiplication);
        System.out.println("Quotient = " + division);
    }
}
