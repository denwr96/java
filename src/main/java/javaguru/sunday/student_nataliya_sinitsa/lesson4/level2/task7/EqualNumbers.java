package main.java.javaguru.sunday.student_nataliya_sinitsa.lesson4.level2.task7;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
class EqualNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your first number");
        int firstNumber = scanner.nextInt();

        System.out.println("Enter your second number");
        int secondNumber = scanner.nextInt();

        if (firstNumber == secondNumber) {
            System.out.println("Numbers are equal");
        } else {
            System.out.println("Numbers are different");
        }

    }

}
