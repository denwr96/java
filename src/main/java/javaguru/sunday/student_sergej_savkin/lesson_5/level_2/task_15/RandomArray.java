package main.java.javaguru.sunday.student_sergej_savkin.lesson_5.level_2.task_15;

import java.util.Random;

class RandomArray {
    public static void main(String[] args) {
        Random random = new Random();
        int[] randomNumbers = new int[3];

        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = random.nextInt(10);
            System.out.println("Number " + (i +1) + " = " + randomNumbers[i]);
            randomNumbers[i] += 2;
            System.out.println("+ 2 = " + randomNumbers[i]);
        }
    }
}
