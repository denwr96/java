package main.java.javaguru.sunday.student_glebs_surtajevs.lesson_2.level_3.task_10;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
public class Task_10 {
    public static void main(String[] args) {
        System.out.println("Radius of a circle");
        Scanner scanner = new Scanner(System.in);
        double radius = scanner.nextDouble();
        double pi = 3.14;
        double perimeter = 2 * pi * radius;
        double area = pi * radius * radius;
        System.out.println("Perimeter of a circle = " + perimeter);
        System.out.println("Area of a circle = " + area);
    }
}
