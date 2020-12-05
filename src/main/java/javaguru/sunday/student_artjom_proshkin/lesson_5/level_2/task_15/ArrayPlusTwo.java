package main.java.javaguru.sunday.student_artjom_proshkin.lesson_5.level_2.task_15;

import java.util.Random;

class ArrayPlusTwo {

    public static void main(String[] args) {
        int[] arrayPlusTwo = new int[3];
        Random random = new Random();

        for (int i = 0; i < arrayPlusTwo.length; i++) {
            arrayPlusTwo[i] = random.nextInt(25);
            System.out.println("i = " + i + "; " + arrayPlusTwo[i]);
        }
        System.out.println();
        for (int i = 0; i < arrayPlusTwo.length; i++) {
            arrayPlusTwo[i] = arrayPlusTwo[i] + 2;
            System.out.println("i + 2 = " + i + "; " + arrayPlusTwo[i]);
        }
    }
}
