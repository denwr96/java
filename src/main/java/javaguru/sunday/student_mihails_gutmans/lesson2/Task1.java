package main.java.javaguru.sunday.student_mihails_gutmans.lesson2;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
public class Task1 {
    public static void main(String[] args) {
        System.out.println("Please enter first number");
        Scanner myNymber = new Scanner (System.in);
        int myFirstNumber = myNymber.nextInt();
        System.out.println("Please enter second number");
        int mySecondNumber = myNymber.nextInt();
        System.out.println("Sum Result = " + (myFirstNumber+mySecondNumber));
        System.out.println("Subtraction Result = " + (myFirstNumber-mySecondNumber));
        System.out.println("Multiplication Result = " + (myFirstNumber*mySecondNumber));
        System.out.println("Devide Result = " + (myFirstNumber/mySecondNumber));


    }
}
