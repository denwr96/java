package main.java.javaguru.sunday.student_violeta_klimova.lesson_2.level_3;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
public class Task_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter radius:");
        double radius = scanner.nextDouble();
        System.out.println("Radius is " + radius);

        double circumference = Math.PI * 2 * radius;
        System.out.println("Circumference is: " + circumference);

        double area = Math.PI * (radius * radius);
        System.out.println("Area is: " + area);

    }
}