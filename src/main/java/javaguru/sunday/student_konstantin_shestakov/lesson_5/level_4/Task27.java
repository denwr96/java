package javaguru.sunday.student_konstantin_shestakov.lesson_5.level_4;

import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Arrays;
import java.util.Random;

@CodeReview(approved = true)
class Task27 {

    public static void main(String[] args) {
        Random random = new Random();

        int ArrayRandomLength = random.nextInt(10) + 1;
        int[] arrayOne = new int[ArrayRandomLength];
        int max = arrayOne[0];

        for (int i = 0; i < arrayOne.length; i++) {
            arrayOne[i] = random.nextInt(10);
        }
        System.out.println("Массив: " + Arrays.toString(arrayOne));


        for (int i = 0; i < arrayOne.length; i++) {
            if (arrayOne[i] > max) {
                max = arrayOne[i];
            }
        }
        System.out.println("Maкс: " + max);
    }
}
