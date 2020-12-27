package javaguru.sunday.student_jelena_lavrenuka.lesson_2.task_10;

import javaguru.sunday.teacher.annotations.CodeReview;
import javaguru.sunday.teacher.annotations.CodeReviewComment;

import java.util.Scanner;

@CodeReview(approved = true)
public class Circle {
    public static void main(String[] agrs){
        Scanner scanner = new Scanner(System.in);

        System.out.println("");

        System.out.println("Input a number: ");
        double number = scanner.nextDouble();

        // byte one = 2;

        double perimetr = 2 * Math.PI * number;
        double area = Math.PI * Math.pow(2, number);

        System.out.println("Radius is " + number);
        System.out.println("Perimeter is " + perimetr);
        System.out.println("Area is " + area);
    }
}
