package main.java.javaguru.sunday.student_mihails_gutmans.lesson2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
    System.out.println("Please enter first fractional number");
    Scanner myNymber = new Scanner (System.in);
    double myFirstFractionalNumber = myNymber.nextDouble();
    System.out.println("Please enter second fractional number");
    double mySecondFractionalNumber = myNymber.nextDouble();
    System.out.println("Sum Result = " + (myFirstFractionalNumber+mySecondFractionalNumber));
    System.out.println("Subtraction Result = " + (myFirstFractionalNumber-mySecondFractionalNumber));
    System.out.println("Multiplication Result = " + (myFirstFractionalNumber*mySecondFractionalNumber));
    System.out.println("Devide Result = " + (myFirstFractionalNumber/mySecondFractionalNumber));

}
}
