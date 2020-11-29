package main.java.javaguru.sunday.student_kristina_sutugina.lesson_7.level_4;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;
import main.java.javaguru.sunday.teacher.annotations.CodeReviewComment;

import java.util.Arrays;

//level 5 task 13, 14, 15. Переделка кода, за который стоит false
@CodeReview(approved = true)
@CodeReviewComment(comment = "Там где был false, должен быть мой комментарий =)")
class ArrayUtil {

    public int[] createArray() {
        return new int[3];
    }

    public int[] fillArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        return array;
    }

    public int calculateSum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        return sum;
    }

    public int calculateAverage(int sum) {
        int average = sum / 3;
        return average;
    }

    public int[] sortArray(int[] array) {
        Arrays.sort(array);
        return array;
    }

    public void print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public int[] increaseElementOfArray(int[] array) {
        int add = 2;
        array[0] = array[0] + add;
        array[1] = array[1] + add;
        array[2] = array[2] + add;
        return array;
    }
}
