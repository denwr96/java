package main.java.javaguru.sunday.student_kristina_sutugina.lesson_4.level_1;
//Task_1
//Task_2

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число: ");
        int number = scanner.nextInt();
        if (number < 0) {
            System.out.println("Это отрицательное число");
        } else if (number == 0) {
            System.out.println("Это ноль");
        } else {
            System.out.println("Это положительное число");
        }
    }
}
