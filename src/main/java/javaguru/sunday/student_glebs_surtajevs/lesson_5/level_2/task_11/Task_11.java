package main.java.javaguru.sunday.student_glebs_surtajevs.lesson_5.level_2.task_11;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Arrays;
import java.util.Scanner;

@CodeReview(approved = true)
public class Task_11 {
    public static void main(String[] args) {
        System.out.println("Please enter your first number");
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[3];
        numbers[0] = scanner.nextInt();
        System.out.println("Please enter your second number");
        numbers[1] = scanner.nextInt();
        System.out.println("Please enter your third number");
        numbers[2] = scanner.nextInt();
        System.out.println("Numbers = " + Arrays.toString(numbers));
    }
}
