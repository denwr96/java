package javaguru.sunday.student_deniss_lobacs.lesson_5.homework.level_4.task27;

import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Arrays;
import java.util.Random;

@CodeReview(approved = true)
public class ArrayExampleV2 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] myArray = new int[5];

        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = random.nextInt(10);
        }

        System.out.println("Array = " + Arrays.toString(myArray));

        int max = myArray[0];
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] > max) {
                max = myArray[i];
            }
        }
        System.out.println("Max = " + max);
    }
}