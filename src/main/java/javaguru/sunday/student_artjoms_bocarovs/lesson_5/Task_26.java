package main.java.javaguru.sunday.student_artjoms_bocarovs.lesson_5;

import java.util.Random;
import java.util.Scanner;

public class Task_26 {

    public static void main(String[] args) {

        System.out.println("Enter your array length:");
        Scanner scanner = new Scanner(System.in);
        int arrayLength = scanner.nextInt();
        int[] userArray = new int[arrayLength];

        for (int i = 0; i < arrayLength; i++) {
            Random random = new Random();
            userArray[i] = random.nextInt();
        }

        System.out.println("Your array is: ");
        for (int i = 0; i < arrayLength; i++) {
            System.out.println(userArray[i]);
        }

    }
}
