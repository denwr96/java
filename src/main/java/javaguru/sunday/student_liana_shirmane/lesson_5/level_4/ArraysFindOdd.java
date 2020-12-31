package javaguru.sunday.student_liana_shirmane.lesson_5.level_4;
//task30

import java.util.Random;

public class ArraysFindOdd {
    public static void main(String[] args) {
        int[] numbersOdd = new int[9];
        Random randomOdd = new Random();
        for (int i = 0; i < numbersOdd.length; i++) {
            numbersOdd[i] = randomOdd.nextInt(100);
        }
        for (int j : numbersOdd) {
            System.out.println("Numbers for task 30 " + j);
        }
        for (int i = 0; i < numbersOdd.length; i++) {
            if (numbersOdd[i] % 2 != 0) {
                System.out.println("Odd numbers are: " + numbersOdd[i]);
            }
        }

    }
}
