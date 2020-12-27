package javaguru.sunday.student_konstantin_shestakov.lesson_5.level_5_and_6;

//Task 31
//Task 33
//Task 35
//Task 36
//Task 38

import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Arrays;
import java.util.Random;

@CodeReview(approved = true)
class ArrayUtil {

    public int[] createArray(int arrayLength) {
        int[] arrayOne = new int[arrayLength];
        return arrayOne;
    }

    public void fillArrayWithRandomNumbers(int[] arrayOne) {
        Random random = new Random();
        for (int i = 0; i < arrayOne.length; i++) {
            arrayOne[i] = random.nextInt(10);
        }
    }

    public void printArrayToConsole(int[] arrayOne) {
        System.out.println(Arrays.toString(arrayOne));

//        for (int i = 0; i < arrayOne.length; i++) {
//            System.out.println((i+1) + " element of array = " + arrayOne[i]);
//        }
    }

    public int findMaxNumber(int[] arrayOne) {
        int max = arrayOne[0];
        for (int i = 0; i < arrayOne.length; i++) {
            if (arrayOne[i] > max) {
                max = arrayOne[i];
            }
        }
        return max;
    }

    public int findMinNumber(int[] arrayOne) {
        int min = arrayOne[0];
        for (int i = 0; i < arrayOne.length; i++) {
            if (arrayOne[i] < min){
                min = arrayOne[i];
            }
        }
        return min;
    }
}
