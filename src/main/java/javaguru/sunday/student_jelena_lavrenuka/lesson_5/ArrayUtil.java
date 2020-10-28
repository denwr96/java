package main.java.javaguru.sunday.student_jelena_lavrenuka.lesson_5;
// task_31
// task_32
// task_33
// task_34 - переделать
// task_35
// task_36
// task_38

import java.util.Random;

class ArrayUtil {
    public int[] createArray(int arrayLength) {
        int[] myArray = new int[arrayLength];
        return myArray;
    }

    public void fillArrayWithRandomNumbers(int[] myArray) {
        Random myRandom = new Random();
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = myRandom.nextInt(100);
        }
    }

    public void printArrayToConsole(int[] myArray) {
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] % 2 == 0)
                System.out.println("Even number in array: " + myArray[i]);
        }
    }

    public int findMaxNumber(int[] myArray) {
        int max = myArray[0];
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] > max) {
                max = myArray[i];
            }
        }return max;
    }

    public int findMinNumber(int[] myArray) {
        int min = myArray[0];
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] < min) {
                min = myArray[i];
            }
        }return min;
    }
}


