package main.java.javaguru.sunday.student_deniss_lenenkov.lesson_2.level_3;

import main.java.javaguru.sunday.student_sergej_savkin.lesson_2.level_senior.super_task_1.SystemUnit;
import main.java.javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
public class task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three number:");

        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        int thirdNumber = scanner.nextInt();
        byte x = 3;
        double number = ((double) firstNumber + secondNumber + thirdNumber) / x;
        System.out.println("Number =" + number);


    }
}
