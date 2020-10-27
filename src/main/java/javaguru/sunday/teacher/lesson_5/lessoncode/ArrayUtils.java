package main.java.javaguru.sunday.teacher.lesson_5.lessoncode;

import java.util.Random;

public class ArrayUtils {

    public int[] createArray(int size) {
        int[] array = new int[size];
        return array;
    }

    public void fillArrayWithNumbers(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }
    }

}
