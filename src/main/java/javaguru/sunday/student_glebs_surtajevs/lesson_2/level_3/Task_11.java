package main.java.javaguru.sunday.student_glebs_surtajevs.lesson_2.level_3;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
public class Task_11 {
    public static void main(String[] args) {
        System.out.println("Number 1");
        Scanner scanner = new Scanner(System.in);
        double number1 = scanner.nextDouble();
        System.out.println("Number 2");
        double number2 = scanner.nextDouble();
        System.out.println("Number 3");
        double number3 = scanner.nextDouble();
        double average = (number1 + number2 + number3) / 3;
        System.out.println("Average = " + average);
    }
}
