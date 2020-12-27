package javaguru.sunday.student_mihails_gutmans.lesson4.level3;

import java.util.Scanner;

public class BiggerNumberFromThree {

    public static void main(String[] args) {
        System.out.println("Please enter three numbers");

        Scanner enterNumberOne = new Scanner(System.in);
        int consoleNumberOne = enterNumberOne.nextInt();

        Scanner enterNumberTwo = new Scanner(System.in);
        int consoleNumberTwo = enterNumberTwo.nextInt();

        Scanner enterNumberThree = new Scanner(System.in);
        int consoleNumberThree = enterNumberThree.nextInt();

        int maxNumber;

        if (consoleNumberOne >= consoleNumberTwo && consoleNumberOne >= consoleNumberThree) {
            maxNumber = consoleNumberOne;
        }
        if (consoleNumberTwo >= consoleNumberOne && consoleNumberTwo >= consoleNumberThree) {
            maxNumber = consoleNumberTwo;
        } else {
            maxNumber = consoleNumberThree;
        }
        System.out.println("Bigger bumber is " + maxNumber);
    }
}