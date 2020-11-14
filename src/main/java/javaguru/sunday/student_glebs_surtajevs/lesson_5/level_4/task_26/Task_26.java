package main.java.javaguru.sunday.student_glebs_surtajevs.lesson_5.level_4.task_26;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Random;
import java.util.Scanner;

@CodeReview(approved = true)
public class Task_26 {
    public static void main(String[] args) {
        System.out.println("Please enter your array length");
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int arrayLength = scanner.nextInt();
        int[] number = new int[arrayLength];

        for (int i = 0; i < number.length; i++) {
            number[i] = random.nextInt(100);
        }
        for (int j : number) {
            System.out.println(j);
        }
    }

}

