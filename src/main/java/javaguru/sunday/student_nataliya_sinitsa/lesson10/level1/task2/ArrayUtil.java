package main.java.javaguru.sunday.student_nataliya_sinitsa.lesson10.level1.task2;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Random;
@CodeReview(approved = true)
public interface ArrayUtil {

    int[] createArray(int arrayLength);

    void fillArrayWithRandomNumbers(int[] array);

    void printArrayToConsole(int[] array);

    int findMaxNumber(int[] array);

    int findMinNumber(int[] array);

}
