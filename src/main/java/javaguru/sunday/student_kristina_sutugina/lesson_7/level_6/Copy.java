package main.java.javaguru.sunday.student_kristina_sutugina.lesson_7.level_6;

import java.util.Arrays;
//нет codeReview
//Task_13
class Copy {
    int[] copyInRange(int[] in, int numberFrom, int numberTo) {
        int numberToCopy = 0;
        int[] copiedArray = Arrays.copyOf(in, in.length);
        for (int i = 0; i < in.length; i++) {
            if (in[i] >= numberFrom && in[i] <= numberTo) {
                copiedArray[numberToCopy] = in[i];
                numberToCopy++;
            }
        }
        int[] array = new int[numberToCopy];
        for (int i = 0; i < array.length; i++) {
            array[i] = copiedArray[i];
        }
        return array;
    }
}
