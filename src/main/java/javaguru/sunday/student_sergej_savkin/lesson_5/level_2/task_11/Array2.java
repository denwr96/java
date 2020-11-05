package main.java.javaguru.sunday.student_sergej_savkin.lesson_5.level_2.task_11;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
class Array2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arrayFromUser = new int[3];

        System.out.println("Please enter your three numbers:");

        for (int i = 0; i < arrayFromUser.length; i++) {
            arrayFromUser[i] = scanner.nextInt();
        }
        for (int i = 0; i < arrayFromUser.length; i++) {
            System.out.println(arrayFromUser[i]);
        }
    }
}

