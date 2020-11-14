package main.java.javaguru.sunday.student_glebs_surtajevs.lesson_5.level_4.task_25;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
class Task_25 {
    public static void main(String[] args) {
        System.out.println("Please enter your array length");
        Scanner scanner = new Scanner(System.in);
        int[] arrayLength = new int[scanner.nextInt()];
        for (int i = 0; i < arrayLength.length; i++) {
            System.out.println(i);
        }
        System.out.println("Please enter your number");
        int[] number = new int[scanner.nextInt()];
        for (int i = 0; i < number.length; i++) {
            System.out.println(i);
        }

        }

    }




