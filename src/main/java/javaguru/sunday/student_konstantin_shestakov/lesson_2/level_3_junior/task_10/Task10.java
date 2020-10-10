package main.java.javaguru.sunday.student_konstantin_shestakov.lesson_2.level_3_junior.task_10;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
public class Task10 {

    public static void main(String[] args) {

        System.out.print("Enter circle radius: ");
        Scanner scanner = new Scanner(System.in);
        double radius = scanner.nextDouble();
        double pi = 3.14159;

        System.out.println("Perimetr of cicrle is: " + (2 * pi * radius));
        System.out.println("Area of cicrle is: " + (pi * (radius*radius)));

    }
}
