package main.java.javaguru.sunday.student_artjom_proshkin.lesson_2.level_3_junior.task_10;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
public class Circle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter circle radius : ");
        double radius = scanner.nextDouble();

        System.out.println("Circle perimeter is = " + (2 * Math.PI * radius) + " mm");
        System.out.println("Circle area is = " + ( Math.PI * radius * radius));
    }
}
