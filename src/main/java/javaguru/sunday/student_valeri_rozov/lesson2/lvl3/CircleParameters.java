package javaguru.sunday.student_valeri_rozov.lesson2.lvl3;

import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
public class CircleParameters {
    public static void main(String[] args) {
        Scanner circleR = new Scanner(System.in);
        System.out.println("Circle Radius: ");

        double radiusRequest = circleR.nextDouble();
        double perimeter = radiusRequest * 2 * 3.14;
        double area = 3.14 * radiusRequest * radiusRequest;

        System.out.println("Perimeter is = " + perimeter);

        System.out.println("Area is = " + area);

    }
}
