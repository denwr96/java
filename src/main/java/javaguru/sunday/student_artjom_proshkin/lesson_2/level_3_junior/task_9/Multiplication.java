package javaguru.sunday.student_artjom_proshkin.lesson_2.level_3_junior.task_9;

import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
public class Multiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Please enter integer to multiply : ");
        int numberOne = scanner.nextInt();

        System.out.println("Multiplication table for number " + numberOne + " is : ");

        for (int n = 1; n <= 10; n++)
            System.out.println(numberOne + " x " + n + " = " + (numberOne * n));

    }
}
