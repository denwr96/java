package javaguru.sunday.student_liana_shirmane.lesson_2.level_3.task_9;

import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
public class Task9 {
    public static void main(String[] args) {
        System.out.println("Please, enter number:");
        Scanner scanner = new Scanner(System.in);
        int userNumber = scanner.nextInt();
        int secondRow = userNumber * 2;
        int thirdRow = userNumber * 3;
        int fourthRow = userNumber * 4;
        int fifthRow = userNumber * 5;
        int sixthRow = userNumber * 6;
        int seventhRow = userNumber * 7;
        int eighthRow = userNumber * 8;
        int ninthRow = userNumber * 9;
        int tenthRow = userNumber * 10;

        System.out.println(userNumber + " x 1 = "  + userNumber);
        System.out.println(userNumber + " x 2 = "  + secondRow);
        System.out.println(userNumber + " x 3 = "  + thirdRow);
        System.out.println(userNumber + " x 4 = "  + fourthRow);
        System.out.println(userNumber + " x 5 = "  + fifthRow);
        System.out.println(userNumber + " x 6 = "  + sixthRow);
        System.out.println(userNumber + " x 7 = "  + seventhRow);
        System.out.println(userNumber + " x 8 = "  + eighthRow);
        System.out.println(userNumber + " x 9 = "  + ninthRow);
        System.out.println(userNumber + " x 10 = "  + tenthRow);
    }
}
