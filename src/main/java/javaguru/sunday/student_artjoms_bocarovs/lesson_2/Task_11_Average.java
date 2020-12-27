package javaguru.sunday.student_artjoms_bocarovs.lesson_2;

import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
public class Task_11_Average {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number:");
        int firstNumber = scanner.nextInt();

        System.out.print("Enter second number:");
        int secondNumber = scanner.nextInt();

        System.out.print("Enter third number:");
        int thirdNumber = scanner.nextInt();

        System.out.println("Среднее арифметическое: " + ((double) firstNumber + secondNumber + thirdNumber) / 3);
    }


}
