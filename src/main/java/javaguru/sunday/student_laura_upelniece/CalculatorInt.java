package main.java.javaguru.sunday.student_laura_upelniece;

import java.util.Scanner;

public class CalculatorInt {
    public static void main(String[] args) {
        //Adds first input
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();

        //Adds second input
        Scanner scanner2 = new Scanner(System.in);
        int secondNumber = scanner2.nextInt();

        //Stores answers in variables
        int sum = firstNumber + secondNumber;
        int sub = firstNumber - secondNumber;
        int multi = firstNumber * secondNumber;
        int div = firstNumber / secondNumber;

        System.out.println(sum);
        System.out.println(sub);
        System.out.println(multi);
        System.out.println(div);
    }

}
