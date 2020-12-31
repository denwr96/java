package javaguru.sunday.student_liana_shirmane.lesson_5.level_4;
//task28

import java.util.Random;

public class ArraysFindMin {
    public static void main(String[] args) {
        int[] numbersMin = new int[5];
        Random randomMin = new Random();
        for (int i = 0; i < numbersMin.length; i++) {
            numbersMin[i] = randomMin.nextInt(100);
        }
        for (int j : numbersMin) {
            System.out.println("Numbers for task 28 are " + j);
        }
        int min = numbersMin[0];
        for (int i = 0; i < numbersMin.length; i++) {
            if (numbersMin[i] < min) {
                min = numbersMin[i];
            }
        }
        System.out.println("Min value is: " + min);
    }
}
