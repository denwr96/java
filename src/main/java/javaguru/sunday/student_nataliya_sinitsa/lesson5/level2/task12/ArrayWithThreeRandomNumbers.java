package main.java.javaguru.sunday.student_nataliya_sinitsa.lesson5.level2.task12;

import java.util.Random;

class ArrayWithThreeRandomNumbers {

    public static void main(String[] args) {

        int[] array = new int[3];

        Random random = new Random();

        array[0] = random.nextInt(1000);
        array[1] = random.nextInt(1000);
        array[2] = random.nextInt(1000);

        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
    }

}
