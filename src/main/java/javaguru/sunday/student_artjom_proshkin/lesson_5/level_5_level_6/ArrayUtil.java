package main.java.javaguru.sunday.student_artjom_proshkin.lesson_5.level_5_level_6;

//Task_31
//Task_33
//Task_35
//Task_36
//Task_38

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Arrays;
import java.util.Random;
@CodeReview(approved = true)
class ArrayUtil {

    int[] createArray(int arrayLength) {
        int[] myArray = new int[arrayLength];
        return myArray;
    }

    void fillArrayWithRandomNumbers(int[] myArray) {
        Random random = new Random();
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = random.nextInt(50);
        }
    }

    void printArrayToConsole(int[] myArray) {
        System.out.println("Array = " + Arrays.toString(myArray));
    }

    int findMaxNumber(int[] myArray) {
        int maxNumber = myArray[0];
        for (int max : myArray) {
            if (max > maxNumber) {
                maxNumber = max;
            }
        }
        return maxNumber;
    }

    int findMinNumber(int[] myArray) {
        int minNumber = myArray[0];
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] < minNumber) {
                minNumber = myArray[i];
            }
        }
        return minNumber;
    }
}