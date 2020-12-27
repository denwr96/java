package javaguru.sunday.student_artjom_proshkin.lesson_5.level_4.task_29;

import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Arrays;
import java.util.Random;

@CodeReview(approved = true)
class ArrayWithEven {
    public static void main(String[] args) {

        Random random = new Random();
        int[] arrayWithEven = new int[6];

        for (int i = 0; i < arrayWithEven.length; i++) {
            arrayWithEven[i] = random.nextInt(50);
        }
        System.out.println("Array =" + Arrays.toString(arrayWithEven));

        System.out.println("Even numbers in array : ");
        for (int evenNumber : arrayWithEven) {
            if (evenNumber % 2 == 0) {
                System.out.print(evenNumber + "; ");
            }
        }
    }
}
