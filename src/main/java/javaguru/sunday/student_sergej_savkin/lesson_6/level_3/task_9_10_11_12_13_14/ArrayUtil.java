package main.java.javaguru.sunday.student_sergej_savkin.lesson_6.level_3.task_9_10_11_12_13_14;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class ArrayUtil {

    public boolean containsNumber(int[] array, int number){
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                return true;
            }
        }
        return false;
    }

    public int containsNumberTimes(int[] array, int number){
        int times = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] == number) {
                times++;
            }
        }
        return times;
    }

    public void replaceFirstMatch(int[] array, int numberToReplace, int newNumber) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numberToReplace) {
                array[i] = newNumber;
                break;
            }
        }
    }

    public void replaceAllMatches(int[] array, int numberToReplace, int newNumber) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numberToReplace) {
                array[i] = newNumber;
            }
        }
    }

    public void reverseArray(int[] array){

        for (int i = 0; i < (array.length / 2); i++) {
            int temp;
            temp = array[i];
            array[i] = array[array.length - i -1];
            array[array.length - i - 1] = temp;
        }
    }

    public void bubbleSort(int[] array) {
        boolean sorted = false;
        while (!sorted) {
            sorted = true;
            for (int i = 1; i < array.length; i++) {
                if (array[i - 1] > array[i]) {
                    int temp;
                    temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                    sorted = false;
                }
            }
        }
    }

}
