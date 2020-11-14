package main.java.javaguru.sunday.student_liana_shirmane.lesson_6.level_3;

//task9
//task10
//task11
//task12
//task13
//task14


import main.java.javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Arrays;

@CodeReview(approved = true)
class ArrayUtil {

    boolean findNumber(int[] array, int number) {
        int i;
        for (i = 0; i < array.length; i++) {
            if (number == array[i]) {
                return true;
            }
        }
        return false;
    }

    int howManyNumbers(int[] array, int number) {
        int result = 0;
        for (int j : array)
            if (number == j)
                result++;
        return result;
    }

    void replaceNumber(int[] array, int numberToReplace, int newNumber) {
        for (int i = 0; i < array.length; i++) {
            if (numberToReplace == array[i]) {
                array[i] = newNumber;
                break;
            }
        }

    }

    void replaceAllNumbers(int[] array, int numberToReplace, int newNumber) {
        for (int i = 0; i < array.length; i++) {
            if (numberToReplace == array[i])
                array[i] = newNumber;
        }
    }

    void rotateNumbers(int array[]) {
        int i, arrayNew;
        for (i = 0; i < array.length / 2; i++) {
            arrayNew = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = arrayNew;
        }

    }

    void sortNumbers(int array[]) {
        int t;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    t = array[i];
                    array[i] = array[j];
                    array[j] = t;
                }
            }
        }
    }
}


