package main.java.javaguru.sunday.student_sergej_savkin.lesson_5.level_4.task_30;

import java.util.Random;
import java.util.Scanner;

class OddNumbersInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Please enter your array length:");
        int[] userArray = new int[scanner.nextInt()];

        for (int i = 0; i < userArray.length; i++) {
            userArray[i] = random.nextInt(10);
            System.out.println((i + 1) + " number in your array is " + userArray[i]);
        }

        System.out.println("Odd numbers are:");

        for (int i = 0; i < userArray.length; i++) {
            if(userArray[i] % 2 != 0){
                System.out.println(userArray[i]);
            }
        }
    }
}
