package main.java.javaguru.sunday.student_jelena_lavrenuka.lesson_2.task_10;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;
import main.java.javaguru.sunday.teacher.annotations.CodeReviewComment;

import java.util.Scanner;

@CodeReview(approved = false)
@CodeReviewComment(comment = "Переменные не должны называться с большой буквы" +
        "" +
        "Почему переменные one содержит значение 2? В чем логика?")
public class Circle {
    public static void main(String[] agrs){
        Scanner Scanner = new Scanner(System.in);

        System.out.println("");

        System.out.println("Input a number: ");
        double number = Scanner.nextDouble();

        byte one = 2;

        double perimetr = one * Math.PI * number;
        double area = Math.PI * Math.pow(one, number);

        System.out.println("Radius is " + number);
        System.out.println("Perimeter is " + perimetr);
        System.out.println("Area is " + area);
    }
}
