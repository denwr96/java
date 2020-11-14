package main.java.javaguru.sunday.student_sergej_savkin.lesson_7.level_6_middle.task_13;

import java.util.Arrays;

class Copy {

    public int[] copyInRange(int[] in, int numberFrom, int numberTo) {
        int newRangeLength = calculateNewRangeLength(in, numberFrom, numberTo);
        int[] newRange = new int[newRangeLength];
        int fillingCount = 0;
        for (int i = 0; i < in.length; i++) {
            if (in[i] >= numberFrom && in[i] <= numberTo) {
                newRange[fillingCount] = in[i];
                fillingCount++;
            }
        }
        return newRange;
    }

    public int calculateNewRangeLength(int[] in, int numberFrom, int numberTo) {
        int newRangeLength = 0;
        for (int i = 0; i < in.length; i++) {
            if (in[i] >= numberFrom && in[i] <= numberTo) {
                newRangeLength++;
            }
        }
        return newRangeLength;
    }
}
