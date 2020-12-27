package javaguru.sunday.student_deniss_lobacs.lesson_5.homework.level_4.task30;

import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Arrays;
import java.util.Random;

@CodeReview(approved = true)
public class ArrayV4 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] myArray = new int[5];

        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = random.nextInt(10);
        }

        System.out.println("Array = " + Arrays.toString(myArray));

        System.out.print("Not even numbers = ");
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] % 2 == 1) {
                System.out.print(myArray[i] + " ");
            }
        }
    }
}