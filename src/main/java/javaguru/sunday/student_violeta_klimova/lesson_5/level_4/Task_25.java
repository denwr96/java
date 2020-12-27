package javaguru.sunday.student_violeta_klimova.lesson_5.level_4;

import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Arrays;
import java.util.Scanner;

@CodeReview(approved = true)
public class Task_25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your array length: ");
        int arrayLength = scanner.nextInt();
        System.out.println("Your array length is: " + arrayLength);

        int[] arrayOfNumbers = new int[arrayLength];

        for (int i = 0; i < arrayOfNumbers.length; i++) {
            System.out.println("Enter array number: ");
            arrayOfNumbers[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(arrayOfNumbers));
    }
}