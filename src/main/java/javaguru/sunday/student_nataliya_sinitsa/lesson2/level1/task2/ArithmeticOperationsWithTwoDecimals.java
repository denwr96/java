package main.java.javaguru.sunday.student_nataliya_sinitsa.lesson2.level1.task2;

import java.util.Scanner;

public class ArithmeticOperationsWithTwoDecimals {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first decimal");
        double firstDoubleNumber = scanner.nextDouble();

        System.out.println("Enter second decimal");
        double secondDoubleNumber = scanner.nextDouble();

        double sum = firstDoubleNumber + secondDoubleNumber;
        double subtraction = firstDoubleNumber - secondDoubleNumber;
        double multiplication = firstDoubleNumber * secondDoubleNumber;
        double division = firstDoubleNumber / secondDoubleNumber;

        System.out.println("Sum = " + sum);
        System.out.println("Difference = " + subtraction);
        System.out.println("Multiplication = "+ multiplication);
        System.out.println("Quotient = " + division);
    }
}
