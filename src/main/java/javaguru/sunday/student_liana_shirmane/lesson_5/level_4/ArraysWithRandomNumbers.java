package javaguru.sunday.student_liana_shirmane.lesson_5.level_4;
//task26

import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Random;
import java.util.Scanner;

@CodeReview(approved = true)
public class ArraysWithRandomNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter array length");
        int arrayLength2 = scanner.nextInt();
        Random random = new Random();
        int[] numbersRandom = new int[arrayLength2];
        for (int i = 0; i < numbersRandom.length; i++) {
            numbersRandom[i] = random.nextInt(100);
        }
        for (int j : numbersRandom) {
            System.out.println(j);
        }
    }

}

