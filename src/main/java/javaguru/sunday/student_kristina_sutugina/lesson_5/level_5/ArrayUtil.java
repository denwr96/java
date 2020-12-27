package main.java.javaguru.sunday.student_kristina_sutugina.lesson_5.level_5;
//Task_31
//Task_33
//Task_35
//Task_36
//Task_38
//нет codeReview
import java.util.Random;

class ArrayUtil {

    public int[] createArray(int arrayLength) {
        return new int[arrayLength];
    }

    public void fillArrayWithRandomNumbers(int[] array) {
        for (int i = 0; i < array.length; i++) {
            Random randomNumbers = new Random();
            array[i] = randomNumbers.nextInt(32);
        }
    }

    public void printArrayToConsole(int[] array) {
        for (int value : array) {
            System.out.println(value);
        }
    }

    public int findMaxNumber(int[] array) {
        int x = 0;
        int maxNumber = array[x];
        for (int value : array) {
            if (maxNumber < value) {
                maxNumber = value;
            }
        }
        return maxNumber;
    }

    public int findMinNumber(int[] array) {
        int x = 0;
        int minNumber = array[x];
        for (int value : array) {
            if (minNumber > value) {
                minNumber = value;
            }
        }
        return minNumber;
    }
}