package javaguru.sunday.student_liana_shirmane.lesson_5.level_4;

import java.util.Random;

//task29
public class ArraysFindEven {
    public static void main(String[] args) {
        int[] numbersEven = new int[9];
        Random randomEven = new Random();
        for (int i = 0; i < numbersEven.length; i++) {
            numbersEven[i] = randomEven.nextInt(100);
        }
        for (int j : numbersEven) {
            System.out.println("Numbers for task 29 " + j);
        }
        for (int i = 0; i < numbersEven.length; i++) {
            if (numbersEven[i] % 2 == 0) {
                System.out.println("Even numbers are: " + numbersEven[i]);
            }
        }
    }
}
