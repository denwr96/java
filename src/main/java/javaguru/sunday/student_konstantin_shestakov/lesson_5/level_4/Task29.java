package main.java.javaguru.sunday.student_konstantin_shestakov.lesson_5.level_4;

import java.util.Arrays;
import java.util.Random;

class Task29 {

    public static void main(String[] args) {
        Random random = new Random();

        int ArrayRandomLength = random.nextInt(10) + 1;
        int[] arrayOne = new int[ArrayRandomLength];

        for (int i = 0; i < arrayOne.length; i++) {
            arrayOne[i] = random.nextInt(10);
        }
        System.out.println("Массив: " + Arrays.toString(arrayOne));

        int evenNumber;
        System.out.println("Чётные числа массива: ");

        for (int i = 0; i < arrayOne.length; i++) {
            if (arrayOne[i] % 2 == 0) {
                evenNumber = arrayOne[i];
                System.out.println(evenNumber);
            }
        }

    }
}
