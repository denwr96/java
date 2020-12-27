package main.java.javaguru.sunday.student_sergej_savkin.lesson_10.level_1_intern.task_2;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
interface ArrayUtil {

    public int[] createArray(int arrayLength);

    public void fillArrayWithRandomNumbers(int[] array);

    public void printArrayToConsole(int[] array);

    public int findMaxNumber(int[] array);

    public int findMinNumber(int[] array);

}
