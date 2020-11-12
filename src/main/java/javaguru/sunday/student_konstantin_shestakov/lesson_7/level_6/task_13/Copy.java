package main.java.javaguru.sunday.student_konstantin_shestakov.lesson_7.level_6.task_13;

import java.util.Arrays;

class Copy {

    int[] copyInRange(int[] in, int numberFrom, int numberTo) {
        int[] outTemp = new int[in.length]; // создание временного массива аналогичной входящему размерности

        int counter = 0; // определение индексов с допустимыми значениями
        for (int j : in) {
            if (j >= numberFrom && j <= numberTo) {
                outTemp[counter] = j;
                counter++;
            }
        }
        int[] out = new int[counter]; // создание массива длины = кол-ву встреченных значений из допуска
//        if (out.length >= 0) System.arraycopy(outTemp, 0, out, 0, out.length);
        for (int i = 0; i < out.length; i++) {
            out[i] = outTemp[i];
        }
//        System.out.println("Array temp: " + Arrays.toString(outTemp));
        return out;
    }
}
