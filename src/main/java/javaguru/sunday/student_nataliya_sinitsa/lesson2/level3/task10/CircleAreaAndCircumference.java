package javaguru.sunday.student_nataliya_sinitsa.lesson2.level3.task10;

import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
public class CircleAreaAndCircumference {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter circle radius");
        double circleRadius = scanner.nextDouble();

        double circleArea = circleRadius * circleRadius * Math.PI;
        double circleCircumference = circleRadius * 2 * Math.PI;

        System.out.println("Circle area = " + circleArea);
        System.out.println("Circle circumference = " + circleCircumference);

    }
}
