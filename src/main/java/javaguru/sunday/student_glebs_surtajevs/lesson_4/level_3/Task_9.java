package javaguru.sunday.student_glebs_surtajevs.lesson_4.level_3;

import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
public class Task_9 {
    public static void main(String[] args) {
        System.out.println("Please enter your first number");
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        System.out.println("Please enter your second number");
        int number2 = scanner.nextInt();
        System.out.println("Please enter your third number");
        int number3 = scanner.nextInt();
        if (number3 > number2 && number2 > number1) {
            System.out.println("increasing");
        } else if (number3 < number2 && number2 < number1) {
            System.out.println("decreasing");
        } else {
            System.out.println("Neither increasing or decreasing order");
        }
    }
}
