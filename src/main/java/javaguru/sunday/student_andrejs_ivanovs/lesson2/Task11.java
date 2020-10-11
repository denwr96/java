package main.java.javaguru.sunday.student_andrejs_ivanovs.lesson2;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        System.out.println("Enter three numbers");
        double NumberOne = Scan.nextInt();
        double NumberTwo = Scan.nextInt();
        double NumberThree = Scan.nextDouble();
        System.out.println("Average of three numbers is " + ((NumberOne + NumberTwo + NumberThree) / 3));

    }
}
