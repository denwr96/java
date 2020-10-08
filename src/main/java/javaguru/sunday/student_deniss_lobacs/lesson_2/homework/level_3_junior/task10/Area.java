package main.java.javaguru.sunday.student_deniss_lobacs.lesson_2.homework.level_3_junior.task10;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
public class Area {
    static Scanner scn=new Scanner(System.in);
    public static void main(String[] args) {

        System.out.print("Enter radius: ");
        double radius=scn.nextDouble();

        double perimeter = 2 * Math.PI * radius;
        double square = Math.PI * (radius * radius);

        System.out.println("Perimeter is = " + perimeter);
        System.out.println("Area is = " + square);

    }
}
