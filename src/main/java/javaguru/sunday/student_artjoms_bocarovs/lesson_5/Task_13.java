package main.java.javaguru.sunday.student_artjoms_bocarovs.lesson_5;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Random;

@CodeReview(approved = true)
public class Task_13 {

    public static void main(String[] args) {

        int[] array = new int[3];

        Random random = new Random();

        array[0] = random.nextInt(100);
        array[1] = random.nextInt(100);
        array[2] = random.nextInt(100);

        int sum = array[0] + array[1] + array[2];
        System.out.println("Sum is: " + sum);

    }
}
