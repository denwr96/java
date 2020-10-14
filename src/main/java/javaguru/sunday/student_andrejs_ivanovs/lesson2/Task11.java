package main.java.javaguru.sunday.student_andrejs_ivanovs.lesson2;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
public class Task11 {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        System.out.println("Enter three numbers");
        double numberOne = Scan.nextInt();
        double numberTwo = Scan.nextInt();
        double numberThree = Scan.nextDouble();
        System.out.println("Average of three numbers is " + ((numberOne + numberTwo + numberThree) / 3));

    }
}
