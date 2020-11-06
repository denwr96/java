package main.java.javaguru.sunday.student_konstantin_shestakov.lesson_6.level_3;

// Task 9
// Task 10
// Task 11
// Task 12
// Task 13
// Task 14 (level 4)

import java.util.Arrays;
import java.util.Random;

class ArrayUtil {

    public int[] createArray(int arrayLength) {
        int[] arrayOne = new int[arrayLength];
        Random random = new Random();
        for (int i = 0; i < arrayOne.length; i++) {
            arrayOne[i] = random.nextInt(10);
        }
        return arrayOne;
    }

    public int findInputNumber(int[] arrayOne, int inputNumber) {
//        for (int i : arrayOne) {
//            if (i == inputNumber) {
//            } else {
//            }
//        }
        return inputNumber;
    }

    public int checkRepeatCountOfNumber(int[] arrayOne, int inputNumber) {
        int counter = 0;
        for (int i : arrayOne) {
            if (i == inputNumber) {
                counter++;
            }
        }
        return counter;
    }

    void replace(int[] arrayOne, int numberToReplace, int newNumber) {
        for (int i = 0; i < arrayOne.length ; i++) {
            if (arrayOne[i] == numberToReplace) {
                arrayOne[i] = newNumber;
                break; // Только первое вхождение
            }
        }
        System.out.println("Number to replace = " + numberToReplace + " , with number = " + newNumber);
    }

    void replaceAll(int[] arrayOne, int numberToReplace, int newNumber) {
        for (int i = 0; i < arrayOne.length ; i++) {
            if (arrayOne[i] == numberToReplace) {
                arrayOne[i] = newNumber;
            }
        }
        System.out.println("Number to replace = " + numberToReplace + " , with number = " + newNumber);
    }

    void invertArray(int[] arrayOne) {
        int[] arrayOriginal = Arrays.copyOf(arrayOne, arrayOne.length);

        for (int i = 0; i < arrayOne.length ; i++) {
            arrayOne[i] = arrayOriginal[arrayOne.length - 1 - i];
        }
    }

    int[] sortArray(int[] arrayOne) {
        Arrays.sort(arrayOne);
        return arrayOne;
    }

}
