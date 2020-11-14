package main.java.javaguru.sunday.student_nataliya_sinitsa.lesson6.level3.task9;

//Task 31 - Task 41 (Lesson 5)
//Task 9 - Task 14 (Lesson 6)

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Random;
@CodeReview(approved = true)
class ArrayUtil {

    public int[] createArray(int arrayLength) {
        return new int[arrayLength];
    }

    public void fillArrayWithRandomNumbers(int[] array) {
        for (int i = 0; i < array.length; i++) {
            Random random = new Random();
            array[i] = random.nextInt();
        }
    }

    public void printArrayToConsole(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Item " + i + " is: " + array[i]);
        }
    }

    public int findMaxNumber(int[] array) {
        int maxNumber = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxNumber) {
                maxNumber = array[i];
            }
        }
        return maxNumber;
    }

    public int findMinNumber(int[] array) {
        int minNumber = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < minNumber) {
                minNumber = array[i];
            }
        }
        return minNumber;
    }

    public String findNumber(int[] array, int findNumber) {
        for (int number : array) {
            if (number == findNumber) {
                return "Array contains number " + findNumber;
            }
        }
        return "Array does not contain number " + findNumber;
    }

    public String findNumberQuantity(int[] array, int findNumber) {
        int quantity = 0;
        for (int number : array) {
            if (number == findNumber) {
                quantity = quantity + 1;
            }
        }
        return "Array contains " + quantity + " of " + findNumber;
    }

    public void replaceNumber(int[] array, int numberToReplace, int newNumber) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numberToReplace) {
                array[i] = newNumber;
                break;
            }
        }
    }

    public void replaceNumbers(int[] array, int numberToReplace, int newNumber) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numberToReplace) {
                array[i] = newNumber;
            }
        }
    }

    public void reverseArray(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int a = array[i];
            int b = array[array.length - i - 1];
            array[i] = b;
            array[array.length - i - 1] = a;
        }
    }

    public void sortArray(int[] array) {
        int temporaryStorage;
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length - i; j++) {
                if (array[j - 1] > array[j]) {
                    temporaryStorage = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temporaryStorage;
                }
            }
        }
    }

}
