package main.java.javaguru.sunday.student_konstantin_shestakov.lesson_2.level_3_junior.task_11;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;
import main.java.javaguru.sunday.teacher.annotations.CodeReviewComment;

import java.util.Scanner;

@CodeReview(approved = false)
@CodeReviewComment(comment = "Переменные названы не правильно.")
public class Task11 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 3 numbers: ");
        int num_1 = scanner.nextInt();
        int num_2 = scanner.nextInt();
        int num_3 = scanner.nextInt();

        System.out.println("Average of your numbers: " + (double)(num_1 + num_2 + num_3) / 3);
    }
}
