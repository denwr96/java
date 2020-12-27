package javaguru.sunday.student_liana_shirmane.lesson_4.level_2;
//task5
//task6
//task7

import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
class CompareNumbers {
    public static void main(String[] args) {
        System.out.println("Please, enter first number:");
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        System.out.println("Please, enter second number:");
        int secondNumber = scanner.nextInt();
        if (firstNumber < secondNumber) {
            System.out.println("Bigger is: " + secondNumber);
        } else if (firstNumber > secondNumber) {
            System.out.println("Bigger is: " + firstNumber);
        }

        if (firstNumber < secondNumber) {
            System.out.println("Smaller is: " + firstNumber);
        } else if (firstNumber > secondNumber) {
            System.out.println("Smaller is: " + secondNumber);
        }

        if (firstNumber == secondNumber) {
            System.out.println("Numbers are equals");
        } else {
            System.out.println("Numbers are different");
        }
    }
}