package main.java.javaguru.sunday.student_andrejs_ivanovs.lesson2;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
public class Task8 {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        System.out.println("Please enter your name");
        String userName = Scan.nextLine();
        System.out.println("Hello " +userName);
    }
}
