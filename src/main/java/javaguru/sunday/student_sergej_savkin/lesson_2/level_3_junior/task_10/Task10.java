package javaguru.sunday.student_sergej_savkin.lesson_2.level_3_junior.task_10;

import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter radius of cyrcle:");
        double r = scanner.nextDouble();
        final double pi = 3.14159265358979;

        System.out.println("Circumference of your cyrcle is " + (2*r*pi));
        System.out.println("Area of your cyrcle is " + (r*r*pi));
    }
}
