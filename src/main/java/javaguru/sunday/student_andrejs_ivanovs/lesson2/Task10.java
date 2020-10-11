package main.java.javaguru.sunday.student_andrejs_ivanovs.lesson2;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        System.out.println("Enter circle radius");
        double Radius = Scan.nextDouble();
        double Pi = 3.14159265359;
        System.out.println("L=" + (2 * Radius * Pi));
        System.out.println("S=" + (Pi * Radius * Radius));


    }
}
