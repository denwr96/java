package main.java.javaguru.sunday.student_konstantin_shestakov.lesson_10.level_1.task_2;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

// Task 2
@CodeReview(approved = true)
interface ArrayUtil {

    public int[] createArray(int arrayLength);

    public void fillArrayWithRandomNumbers(int[] array);

    public void printArrayToConsole(int[] array);

    public int findMaxNumber(int[] array);

    public int findMinNumber(int[] array);
}
