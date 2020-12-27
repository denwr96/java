package javaguru.sunday.student_deniss_lobacs.lesson_5.homework.level_4.task28;

import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Arrays;
import java.util.Random;

@CodeReview(approved = true)
public class ArrayMinValue {
    public static void main(String[] args) {
        Random random = new Random();
        int[] myArray = new int[5];

        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = random.nextInt(10);
        }

        System.out.println("Array = " + Arrays.toString(myArray));

        int min = myArray[0];
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] < min) {
                min = myArray[i];
            }
        }
        System.out.println("Min = " + min);
    }
}
