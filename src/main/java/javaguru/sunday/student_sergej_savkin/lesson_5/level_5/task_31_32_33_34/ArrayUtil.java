package main.java.javaguru.sunday.student_sergej_savkin.lesson_5.level_5.task_31_32_33_34;

import java.util.Random;

class ArrayUtil {
    public int[] createArray(int arrayLength) {
        int[] array = new int[arrayLength];
        return array;
    }
    public void fillArrayWithRandomNumbers(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }
    }
}
