package javaguru.sunday.student_liana_shirmane.lesson_4.level_3;
//task8
//task9
//task10

import javaguru.sunday.teacher.annotations.CodeReview;
import javaguru.sunday.teacher.annotations.CodeReviewComment;

import java.util.Scanner;

@CodeReview(approved = true)
class CompareThreeNumbers {
    public static void main(String[] args) {
        System.out.println("Please, enter first number:");
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        System.out.println("Please, enter second number:");
        int secondNumber = scanner.nextInt();
        System.out.println("Please, enter third number:");
        int thirdNumber = scanner.nextInt();

        if (firstNumber == secondNumber && secondNumber == thirdNumber) {
            System.out.println("All numbers are equal");
        } else if (firstNumber != secondNumber && secondNumber != thirdNumber && firstNumber != thirdNumber) {
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }

        if (firstNumber > secondNumber && secondNumber > thirdNumber) {
            System.out.println("Numbers are decreasing");
        } else if (firstNumber < secondNumber && secondNumber < thirdNumber) {
            System.out.println("Numbers are increasing");
        } else {
            System.out.println("Neither increasing or decreasing order");
        }

        if (firstNumber >= secondNumber && firstNumber >= thirdNumber) {
            System.out.println("Number " + firstNumber + " is the biggest");
        } else if (secondNumber >= firstNumber && secondNumber >= thirdNumber) {
            System.out.println("Number " + secondNumber + " is the biggest");
        } else {
            System.out.println("Number " + thirdNumber + " is the biggest");
        }
    }
}