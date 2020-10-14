package main.java.javaguru.sunday.student_mihails_gutmans.lesson2;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
public class Task10 {
    public static void main(String[] args) {
        System.out.println("Please enter Radius ");
        Scanner radiusParametres = new Scanner (System.in);
        double myRadius = radiusParametres.nextDouble();

        System.out.println("Perimetr = " + (myRadius*2* Math.PI));
        System.out.println("Area = " + (Math.pow(myRadius,2)*Math.PI));

    }
}
