package main.java.javaguru.sunday.student_kristina_sutugina.lesson_5.level_2;

import java.util.Scanner;

class Task_11 {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the first number: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Please enter the second number: ");
        int secondNumber = scanner.nextInt();
        System.out.println("Please enter the third number: ");
        int thirdNumber = scanner.nextInt();

        numbers[0] = firstNumber;
        numbers[1] = secondNumber;
        numbers[2] = thirdNumber;

        for (int i : numbers) {
            System.out.println(i);
        }
    }
}
