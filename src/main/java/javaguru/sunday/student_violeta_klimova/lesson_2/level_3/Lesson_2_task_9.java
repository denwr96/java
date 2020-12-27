package javaguru.sunday.student_violeta_klimova.lesson_2.level_3;

import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
public class Lesson_2_task_9 {

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number:");
        int yourNumber = scanner.nextInt();
        System.out.println("Your number is " + yourNumber);

        for (int multiplier = 1; multiplier <= 10 ; multiplier++) {
            int result = yourNumber * multiplier;
            System.out.println(yourNumber + " x " + multiplier + " = " + result);
        }
    }

}
