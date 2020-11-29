package main.java.javaguru.sunday.student_mihails_gutmans.lesson4.level3;

import java.util.Scanner;

public class ThreeNumbersEqualOrDifferent {

    public static void main(String[] args) {
        System.out.println("Please enter three numbers");

        Scanner enterNumberOne = new Scanner(System.in);
        int consoleNumberOne = enterNumberOne.nextInt();

        Scanner enterNumberTwo = new Scanner(System.in);
        int consoleNumberTwo = enterNumberTwo.nextInt();

        Scanner enterNumberThree = new Scanner(System.in);
        int consoleNumberThree = enterNumberThree.nextInt();


        if (consoleNumberOne > consoleNumberTwo && consoleNumberTwo > consoleNumberThree  ) {
            System.out.println("Decreasing order ");
        } else if (consoleNumberOne<consoleNumberTwo && consoleNumberTwo<consoleNumberThree ) {
            System.out.println("Increasing order");
        } else{
            System.out.println("Neither increasing or decreasing order");
        }
    }
}
