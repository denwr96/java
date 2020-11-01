package main.java.javaguru.sunday.student_glebs_surtajevs.lesson_5.level_2.task_12;

import java.util.Arrays;
import java.util.Random;

class Task_12 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers = new int[3];
        numbers[0] = random.nextInt();
        numbers[1] = random.nextInt();
        numbers[2] = random.nextInt();
        System.out.println("Numbers = " + Arrays.toString(numbers));
    }
}
