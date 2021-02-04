package javaguru.sunday.student_liana_shirmane.lesson_5.level_4;
//task27

import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Random;

@CodeReview(approved = true)
public class ArraysFindMax {
    public static void main(String[] args) {
        int[] numbersMax = new int[5];
        Random randomMax = new Random();
        for (int i = 0; i < numbersMax.length; i++) {
            numbersMax[i] = randomMax.nextInt(100);
        }
        for (int j : numbersMax) {
            System.out.println("Numbers for task 27 are " + j);
        }
        int max = numbersMax[0];
        for (int i = 0; i < numbersMax.length; i++) {
            if (numbersMax[i] > max) {
                max = numbersMax[i];
            }
        }
        System.out.println("Max value is: " + max);
    }
}
