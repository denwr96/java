package javaguru.sunday.student_artjom_proshkin.lesson_2.level_senior.super_task_5;

import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
public class CircleComment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Asking user to enter radius for circle
        System.out.println("Please enter circle radius : ");
        double radius = scanner.nextDouble();

        /* Use math equation C = 2 * pi * r
        * interesting fact: circle perimeter also called circumference,
        * that is why equation letter is "C" */
        System.out.println("Circle perimeter is = " + (2 * Math.PI * radius) + " mm");

        // Use equation A = pi * r * r
        System.out.println("Circle area is = " + ( Math.PI * radius * radius));
    }
}
