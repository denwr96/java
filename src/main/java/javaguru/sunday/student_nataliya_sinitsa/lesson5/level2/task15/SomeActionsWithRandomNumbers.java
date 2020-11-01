package main.java.javaguru.sunday.student_nataliya_sinitsa.lesson5.level2.task15;

import java.util.Random;

class SomeActionsWithRandomNumbers {

    public static void main(String[] args) {

        int[] array = new int[3];

        Random random = new Random();

        array[0] = random.nextInt();
        array[1] = random.nextInt();
        array[2] = random.nextInt();

        System.out.println("Your initial array is:");
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);

        array[0] = array[0] + 2;
        array[1] = array[1] + 2;
        array[2] = array[2] + 2;

        System.out.println("Your final array is:");
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);

    }

}
