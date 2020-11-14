package main.java.javaguru.sunday.student_liana_shirmane.lesson_5.level_5_6;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Arrays;
import java.util.Random;

//task31
//task33
//task35
//task36
//task38

@CodeReview(approved = true)
class ArrayUtil {

    public int[] createArray(int arrayLength) {
        int[] array = new int[arrayLength];
        return array;
    }

    public void fillArrayWithRandomNumbers(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
    }

    public void printArrayToConsole(int[] array) {
        System.out.println(Arrays.toString(array));

    }

    public int findMaxNumber(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max){
                max = array[i];
            }
        }
        System.out.println("Max number is " + max);
        return max;

    }

    public int findMinNumber(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Min number is " + min);
        return min;
    }
}

