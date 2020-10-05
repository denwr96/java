package main.java.javaguru.sunday.student_natalia_kochkina.lesson2.level3;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Radius: ");

        double radius = scanner.nextDouble();

        double perimeter = 2 * Math.PI * radius;
        double area = radius * radius * Math.PI;

        System.out.println("Perimeter is = " + perimeter);
        System.out.println("Area is = " + area);


    }
}
