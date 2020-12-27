package javaguru.sunday.student_deniss_lenenkov.lesson_4.level_3;

import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
public class IncreasingDecreasing {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int numberOne = scanner.nextInt();

        System.out.println("Enter second number: ");
        int numberTwo = scanner.nextInt();

        System.out.println("Enter third number: ");
        int numberThree = scanner.nextInt();

        if (numberOne > numberTwo && numberOne > numberThree && numberTwo > numberThree) {
            System.out.println("Decreasing");
        } else if (numberOne < numberTwo && numberOne < numberThree && numberTwo < numberThree) {
            System.out.println("Increasing");
        } else {
            System.out.println("Neither increasing or decreasing order");
        }

    }
}
