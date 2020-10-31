package main.java.javaguru.sunday.student_deniss_lobacs.lesson_5.homework.level_2.task13;

import java.util.Random;

public class ArraySum {
    public static void main(String[] args) {
        Random random = new Random();
        int[] myArray = new int[3];

        myArray[0] = random.nextInt(10);
        myArray[1] = random.nextInt(10);
        myArray[2] = random.nextInt(10);
        int sum = 0;
        for (int i = 0; i < myArray.length; i++) {
            sum = sum + myArray[i];
        }
        System.out.println("Sum = " + sum);
    }
}
