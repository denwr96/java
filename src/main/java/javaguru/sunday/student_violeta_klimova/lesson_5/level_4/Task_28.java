package javaguru.sunday.student_violeta_klimova.lesson_5.level_4;

import java.util.Arrays;
import java.util.Random;

class Task_28 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arrayOfNumbers = new int[5];


        for (int i = 0; i < arrayOfNumbers.length; i++) {
            arrayOfNumbers[i] = random.nextInt(100);
        }

        System.out.println(Arrays.toString(arrayOfNumbers));

        int min = arrayOfNumbers[0];
        for (int arrayOfNumber : arrayOfNumbers) {
            if (arrayOfNumber < min) {
                min = arrayOfNumber;
            }
        }
        System.out.println("Min is: " + min);
    }
}