package main.java.javaguru.sunday.student_jelena_lavrenuka.lesson_4.task_2;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
class PositiveNegativeZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Пожалуйста, введите целое число ");
        int number = scanner.nextInt();
        if (number == 0) {
            System.out.println("Число равно нулю ");
        } else if (number > 0) {
            System.out.println("Число положительное ");
        } else{
            System.out.println("Число отрицательное");
        }
    }
}
