package main.java.javaguru.sunday.student_anna_aleksejeva.lesson_4;

import java.util.Scanner;

public class LowestOfTwo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter two numbers ");
        int numberOne = sc.nextInt();
        int numberTwo = sc.nextInt();
        if
        (numberOne == numberTwo) {
            System.out.println(" Numbers are equal ");
        }
        else if
        (numberOne < numberTwo) {
            System.out.println(" Lowest " + numberOne);
        }
        else {
            System.out.println(" Lowest " + numberTwo);
        }
    }
}
