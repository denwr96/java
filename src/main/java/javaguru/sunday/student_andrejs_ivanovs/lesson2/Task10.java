package main.java.javaguru.sunday.student_andrejs_ivanovs.lesson2;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        System.out.println("Enter circle radius");
        double radius = Scan.nextDouble();
        double pi = 3.14159265359;
        System.out.println("L=" + (2 * radius * pi));
        System.out.println("S=" + (pi * radius * radius));


    }
}
