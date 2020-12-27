package javaguru.sunday.student_nataliya_sinitsa.lesson4.level2.task6;

import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Scanner;
@CodeReview(approved = true)
class SmallestOfTwoNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your first number");
        int firstNumber = scanner.nextInt();

        System.out.println("Enter your second number");
        int secondNumber = scanner.nextInt();

        if (firstNumber <= secondNumber) {
            System.out.println("The smallest number is " + firstNumber);
        } else {
            System.out.println("The smallest number is " + secondNumber);
        }

    }

}
