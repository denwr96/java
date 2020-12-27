package javaguru.sunday.student_nataliya_sinitsa.lesson2.level3.task11;

import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
public class AverageOfThreeNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number");
        int firstNumber = scanner.nextInt();

        System.out.println("Enter second number");
        int secondNumber = scanner.nextInt();

        System.out.println("Enter third number");
        int thirdNumber = scanner.nextInt();

        double average = ((double) firstNumber + secondNumber + thirdNumber) / 3;

        System.out.println("Average of three numbers = " + average);

    }
}
