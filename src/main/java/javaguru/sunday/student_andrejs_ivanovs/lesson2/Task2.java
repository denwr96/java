package main.java.javaguru.sunday.student_andrejs_ivanovs.lesson2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        System.out.println("Enter number one");
        double NumberOne = Scan.nextDouble();
        System.out.println("Enter number two");
        double NumberTwo = Scan.nextDouble();
        System.out.println("Number one + number two equals "+ (NumberOne + NumberTwo));
        System.out.println("Number one - number two equals "+ (NumberOne - NumberTwo));
        System.out.println("Number one * number two equals "+ (NumberOne * NumberTwo));
        System.out.println("Number one / number two equals "+ (NumberOne / NumberTwo));
    }
}
