package javaguru.sunday.student_deniss_lobacs.lesson_5.homework.level_4.task26;

import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

@CodeReview(approved = true)
public class ArrayWithRandomNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Size of array = ");
        int size = scanner.nextInt();
        int[] numbers = new int[size];

        for (int i = 0; i < size; i++) {
            numbers[i] = random.nextInt(10);
        }

        System.out.println("Array = " + Arrays.toString(numbers));

    }
}