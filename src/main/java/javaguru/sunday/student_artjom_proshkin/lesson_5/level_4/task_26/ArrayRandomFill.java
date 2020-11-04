package main.java.javaguru.sunday.student_artjom_proshkin.lesson_5.level_4.task_26;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class ArrayRandomFill {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter length of array:");
        int[] randomArray = new int[scanner.nextInt()];
        Random random = new Random();

        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = random.nextInt(100);
        }
        System.out.println("Your random array =" + Arrays.toString(randomArray));

    }
}