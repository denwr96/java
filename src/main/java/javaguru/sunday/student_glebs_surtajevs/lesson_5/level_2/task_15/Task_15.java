package main.java.javaguru.sunday.student_glebs_surtajevs.lesson_5.level_2.task_15;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Arrays;
import java.util.Random;

@CodeReview(approved = true)
class Task_15 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers = new int[3];
        numbers[0] = random.nextInt();
        numbers[1] = random.nextInt();
        numbers[2] = random.nextInt();
        System.out.println("Numbers = " + Arrays.toString(numbers));
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        numbers[0] = numbers[0] + 2;
        numbers[1] = numbers[1] + 2;
        numbers[2] = numbers[2] + 2;
        System.out.println("Numbers = " + Arrays.toString(numbers));
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + sum/3);
    }
}
