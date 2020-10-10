package main.java.javaguru.sunday.student_natalia_kochkina.lesson_2.level_3;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
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
