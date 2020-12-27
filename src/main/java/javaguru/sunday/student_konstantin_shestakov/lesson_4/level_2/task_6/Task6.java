package javaguru.sunday.student_konstantin_shestakov.lesson_4.level_2.task_6;

import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
class Task6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first integer: ");
        int firstNumber = scanner.nextInt();

        System.out.println("Enter second integer: ");
        int secondNumber = scanner.nextInt();

        if (firstNumber < secondNumber) {
            System.out.println("First integer is lower: " + firstNumber + " < " + secondNumber);
        }
        else if (firstNumber > secondNumber) {
            System.out.println("Second integer is lower: " + secondNumber + " < " + firstNumber);
        }
        else {
            System.out.println("Integers are even: " + firstNumber + " = " + secondNumber);
        }

    }
}
