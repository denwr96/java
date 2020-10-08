package main.java.javaguru.sunday.student_liana_shirmane.lesson_2.level_3.task_10;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        System.out.println("Please, enter radius of a circle:");
        Scanner scanner = new Scanner(System.in);
        double userRadius = scanner.nextDouble();
        double constantPi = 3.14159265359;
        double perimeter = 2 * userRadius * constantPi;
        double area = constantPi * userRadius * userRadius;
        System.out.println("Perimeter is = " + perimeter);
        System.out.println("Area is = " + area);
    }
}
