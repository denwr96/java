package main.java.javaguru.sunday.student_nataliya_sinitsa.lesson5.level4.task28;

import java.util.Random;

public class MinOfRandom {

    public static void main(String[] args) {

        int[] arrayForMinTest = new int[5];

        for (int i = 0; i < arrayForMinTest.length; i++) {
            Random random = new Random();
            arrayForMinTest[i] = random.nextInt(50);
        }

        for (int i = 0; i < arrayForMinTest.length; i++) {
            System.out.println(i + " item is " + arrayForMinTest[i]);
        }

        int minNumber = arrayForMinTest[0];
        for (int i = 1; i < arrayForMinTest.length; i++) {
            if (arrayForMinTest[i] < minNumber) {
                minNumber = arrayForMinTest[i];
            }
        }
        System.out.println("Min number is: " + minNumber);

    }

}
