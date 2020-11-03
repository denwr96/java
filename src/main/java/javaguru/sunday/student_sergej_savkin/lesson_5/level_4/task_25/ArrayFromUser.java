package main.java.javaguru.sunday.student_sergej_savkin.lesson_5.level_4.task_25;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
class ArrayFromUser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("PLease enter your array length:");
        int[] userArray = new int[scanner.nextInt()];

        for (int i = 0; i < userArray.length; i++) {
            System.out.println("Please enter number " + (i + 1) + " of your array:");
            userArray[i] = scanner.nextInt();
        }
        for (int i = 0; i < userArray.length; i++) {
            System.out.println("Number " + (i + 1) + " of your array is: " + userArray[i]);
        }
    }
}
