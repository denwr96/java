package main.java.javaguru.sunday.student_deniss_lenenkov.lesson_4.level_2;

import java.util.Scanner;

public class EqualsDifferent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int numberOne = scanner.nextInt();

        System.out.println("Enter second number: ");
        int numberTwo = scanner.nextInt();


        if (numberOne == numberTwo){
            System.out.println("Numbers are equals");
        }else if (numberOne != numberTwo){
            System.out.println("Number are different");
        }
    }
}
