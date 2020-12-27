package javaguru.sunday.student_artjom_proshkin.lesson_5.level_4.task_28;

import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Arrays;
import java.util.Random;
@CodeReview(approved = true)
class ArrayWithMin {
    public static void main(String[] args) {

        Random random = new Random();
        int[] arrayWithMin = new int[7];

        for (int i = 0; i < arrayWithMin.length; i++) {
            arrayWithMin[i] = random.nextInt(50);
        }
        System.out.println("Array =" + Arrays.toString(arrayWithMin));

        int minNumber = arrayWithMin[0];
        for (int min : arrayWithMin) {
            if (min < minNumber) {
                minNumber = min;
            }
        }
        System.out.println("Min number in array = " + minNumber);
    }
}
