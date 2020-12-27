package javaguru.sunday.student_violeta_klimova.lesson_5.level_4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class Task_26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Enter your array length: ");
        int arrayLength = scanner.nextInt();
        System.out.println("Your array length is: " + arrayLength);

        int[] arrayOfNumbers = new int[arrayLength];


        for (int i = 0; i < arrayOfNumbers.length; i++) {
            arrayOfNumbers[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(arrayOfNumbers));
    }
}