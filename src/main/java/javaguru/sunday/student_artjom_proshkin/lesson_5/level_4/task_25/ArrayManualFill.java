package main.java.javaguru.sunday.student_artjom_proshkin.lesson_5.level_4.task_25;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Arrays;
import java.util.Scanner;

@CodeReview(approved = true)
class ArrayManualFill {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter length of array:");
        int[] manualArray = new int[scanner.nextInt()];

        for (int i = 0; i < manualArray.length; i++) {
            System.out.println("Please enter number to fill an array:");
            manualArray[i] = scanner.nextInt();
        }
        System.out.println("Your array = " + Arrays.toString(manualArray));
    }
}
