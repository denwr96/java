package main.java.javaguru.sunday.student_artjoms_bocarovs.lesson_2;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
public class Task_10_Radius_Calculator {

    public static void main(String[] args) {

        Scanner io = new Scanner(System.in);
        System.out.print("Input the radius of the circle: ");
        double radius = io.nextDouble();

        System.out.println("Perimeter is = " + (2 * radius * Math.PI));
        System.out.println("Area is = " + (Math.PI * radius * radius));

    }

}

