package main.java.javaguru.sunday.student_artjom_proshkin.lesson_5.level_4.task_30;

import java.util.Arrays;
import java.util.Random;

class ArrayWithOdd {
    public static void main(String[] args) {

        Random random = new Random();
        int[] arrayWithOdd = new int[10];

        for (int i = 0; i < arrayWithOdd.length; i++) {
            arrayWithOdd[i] = random.nextInt(50);
        }
        System.out.println("Array =" + Arrays.toString(arrayWithOdd));

        System.out.println("Odd numbers in array:");
        for (int evenNumber : arrayWithOdd) {
            if (evenNumber % 2 != 0) {
                System.out.print(evenNumber + "; ");
            }
        }
    }
}
