package main.java.javaguru.sunday.student_laura_upelniece.lesson2.lvl3;
import main.java.javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Scanner;
import java.lang.Math;

@CodeReview(approved = true)
public class Circle {
    public static void main(String[] args) {

        //Takes number(radius) as an input
        Scanner input = new Scanner(System.in);
        System.out.println("Enter radius: ");
        double radius = input.nextDouble();

        //Calculates result and stores it in variables
        double peri = radius * (Math.PI * 2);
        double area = Math.pow(radius, 2) * Math.PI;

        //Prints result
        System.out.println("Perimeter of circle: " + peri);
        System.out.println("Area of circle: " + area);

    }
}
