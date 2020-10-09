package main.java.javaguru.sunday.student_valeri_rozov.lesson2.lvl3;

import java.util.Scanner;

public class NumbersAverage {
    public static void main(String[] args) {
        Scanner numberOne = new Scanner(System.in);
                double number1 = numberOne.nextDouble();
        Scanner numberTwo = new Scanner(System.in);
                double number2 = numberTwo.nextDouble();
        Scanner numberThree = new Scanner(System.in);
                double number3 = numberThree.nextDouble();

                double result = (number1 + number2 + number3) / 3;
        System.out.println(result);

    }
}
