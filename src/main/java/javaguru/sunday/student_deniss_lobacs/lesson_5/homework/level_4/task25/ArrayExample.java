package main.java.javaguru.sunday.student_deniss_lobacs.lesson_5.homework.level_4.task25;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Arrays;
import java.util.Scanner;

@CodeReview(approved = true)
public class ArrayExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Size of array = ");
        int size = scanner.nextInt();
        int[] numbers = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Input number = ");
            numbers[i] = scanner.nextInt();
        }

        System.out.println("Array = " + Arrays.toString(numbers));

    }
}
