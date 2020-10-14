package main.java.javaguru.sunday.student_andrejs_ivanovs.lesson2;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
public class Task2 {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        System.out.println("Enter number one");
        double numberOne = Scan.nextDouble();
        System.out.println("Enter number two");
        double numberTwo = Scan.nextDouble();
        System.out.println("Number one + number two equals "+ (numberOne + numberTwo));
        System.out.println("Number one - number two equals "+ (numberOne - numberTwo));
        System.out.println("Number one * number two equals "+ (numberOne * numberTwo));
        System.out.println("Number one / number two equals "+ (numberOne / numberTwo));
    }
}
