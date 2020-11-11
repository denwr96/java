package main.java.javaguru.sunday.student_kristina_sutugina.lesson_2.level_3;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
class Task_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 3 numbers: ");
        int firstNumber = input.nextInt();
        int secondNumber = input.nextInt();
        int thirdNumber = input.nextInt();
        double calculation = (double) (firstNumber + secondNumber + thirdNumber) / 3;
        // double calculation = Double.valueOf(firstNumber+secondNumber+thirdNumber)/3;
        System.out.println(calculation);
    }
}
