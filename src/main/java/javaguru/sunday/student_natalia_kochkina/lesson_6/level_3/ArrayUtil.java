package main.java.javaguru.sunday.student_natalia_kochkina.lesson_6.level_3;

//Task_9
//Task_10
//Task_11
//Task_12
//Task_13
//Task_14

public class ArrayUtil {

    public boolean containsThisNumber(int[] array, int number) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                return true;
            }
        }
        return false;
    }

    public int numberOfTimes(int[] array, int number) {
        int numberOfTimes = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                numberOfTimes++;
            }
        }
        return numberOfTimes;
    }

    public void replace(int[] array, int numberToReplace, int newNumber) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numberToReplace) {
                array[i] = newNumber;
                break;
            }
        }
    }

    public void replaceAll(int[] array, int numberToReplace, int newNumber) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numberToReplace) {
                array[i] = newNumber;
            }
        }
    }

    public int[] reversArray(int[] array) {
        int[] reversArray = new int[array.length];
        int i = 0;
        int i2 = array.length - 1;
        while (i < array.length) {
            reversArray[i] = array[i2];
            i++;
            i2--;
        }
        return reversArray;
    }

    public void bubbleSort(int[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
    }

}
