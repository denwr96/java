package main.java.javaguru.sunday.student_deniss_lobacs.lesson_5.homework.level_5_and_6;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;
import main.java.javaguru.sunday.teacher.annotations.CodeReviewComment;

import java.util.Arrays;
import java.util.Random;

@CodeReview(approved = true)
@CodeReviewComment(comment = "А почему решили сделать static?")
public class ArrayUtil {

    public static int[] createArray(int arrayLength) {
        int[] array = new int[arrayLength];
        return array;
    }

    public static void fillArrayWithRandomNumbers(int[] array) { // Task33
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }
    }

    public static void printArrayToConsole(int[] array) {
//        for (int i = 0; i < array.length; i++) {
//            System.out.print(array[i] + " ");
        System.out.println("Array = " + Arrays.toString(array));
    }

    public static int findMaxNumber(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Max value = " + max);
        return max;
    }

    public static int findMinNumber(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Min value = " + min);
        return min;
    }

}

