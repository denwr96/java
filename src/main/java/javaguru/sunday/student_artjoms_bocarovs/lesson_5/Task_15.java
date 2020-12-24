package main.java.javaguru.sunday.student_artjoms_bocarovs.lesson_5;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Random;
@CodeReview(approved = true)
public class Task_15 {

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
