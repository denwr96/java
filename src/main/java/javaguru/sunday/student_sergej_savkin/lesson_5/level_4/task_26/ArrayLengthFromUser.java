package main.java.javaguru.sunday.student_sergej_savkin.lesson_5.level_4.task_26;

import java.util.Random;
import java.util.Scanner;

class ArrayLengthFromUser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Please enter your array length:");
        int[] userArray = new int[scanner.nextInt()];

        for (int i = 0; i < userArray.length; i++) {
            userArray[i] = random.nextInt(10);
            System.out.println((i + 1) + " number of your array is: " + userArray[i]);
        }
    }
}
