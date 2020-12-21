package main.java.javaguru.sunday.student_artjoms_bocarovs.lesson_5;

import java.util.Random;

public class Task_30 {

    public static void main(String[] args) {

        int[] arrayForOddTest = new int[5];

        for (int i = 0; i < arrayForOddTest.length; i++) {
            Random random = new Random();
            arrayForOddTest[i] = random.nextInt(50);
        }

        for (int i = 0; i < arrayForOddTest.length; i++) {
            System.out.println(i + " item is " + arrayForOddTest[i]);
        }

        System.out.println("Odd numbers are:");
        for (int number : arrayForOddTest) {
            if (number % 2 != 0) {
                System.out.println(number);
            }
        }

    }
}
