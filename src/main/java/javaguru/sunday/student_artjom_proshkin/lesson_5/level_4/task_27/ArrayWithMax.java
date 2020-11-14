package main.java.javaguru.sunday.student_artjom_proshkin.lesson_5.level_4.task_27;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Arrays;
import java.util.Random;

@CodeReview(approved = true)
class ArrayWithMax {
    public static void main(String[] args) {

        Random random = new Random();
        int[] arrayWithMax = new int[7];

        for (int i = 0; i < arrayWithMax.length; i++) {
            arrayWithMax[i] = random.nextInt(50);
        }
        System.out.println("Array =" + Arrays.toString(arrayWithMax));

        int maxNumber = arrayWithMax[0];
        for (int max : arrayWithMax) {
            if (max > maxNumber) {
                maxNumber = max;
            }
        }
        System.out.println("Max number in array = " + maxNumber);
    }
}
