package main.java.javaguru.sunday.student_mihails_gutmans.lesson2;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        System.out.println("Please enter first number");
        Scanner myNymber = new Scanner(System.in);
        int myFirstNumber = myNymber.nextInt();
        System.out.println("Please enter second number");
        int mySecondNumber = myNymber.nextInt();
        System.out.println("Please enter third number");
        int myThirdNumber = myNymber.nextInt();


        System.out.println("Average = " + (((double)myFirstNumber + mySecondNumber+myThirdNumber))/3);


    }
}