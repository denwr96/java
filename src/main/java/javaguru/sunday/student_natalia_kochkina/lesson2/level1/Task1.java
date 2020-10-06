package main.java.javaguru.sunday.student_natalia_kochkina.lesson2.level1;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
public class Task1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число:");
        int firstNumber = scanner.nextInt();

        System.out.println("Введите второе число:");
        int secondNumber = scanner.nextInt();

        System.out.println(firstNumber + secondNumber);
        System.out.println(firstNumber - secondNumber);
        System.out.println(firstNumber * secondNumber);
        System.out.println(firstNumber / secondNumber);
    }
}
