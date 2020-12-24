package main.java.javaguru.sunday.student_artjoms_bocarovs.lesson_5;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Scanner;
@CodeReview(approved = true)
public class Task_11 {

    public static void main(String[] args) {
        int[] array = new int[3];

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your first number");
        array[0] = scanner.nextInt();
        System.out.println("Enter your second number");
        array[1] = scanner.nextInt();
        System.out.println("Enter your third number");
        array[2] = scanner.nextInt();

        System.out.println("Your array is:");
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
    }
}
