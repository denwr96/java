package javaguru.sunday.student_liana_shirmane.lesson_6.level_4;
//task18
import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Random;

@CodeReview(approved = true)
class TwoDimensionalArray {

    void fillInTwoDimensionalArray(int[][] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++)
                array[i][j] = random.nextInt(100);
        }
    }

    int sumAllNumbers(int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++)
                sum += array[i][j];
        }
        return sum;
    }
}

