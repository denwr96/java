package javaguru.sunday.student_natalia_kochkina.lesson_10.level_1;

import javaguru.sunday.teacher.annotations.CodeReview;

//Task_2
@CodeReview(approved = true)
public interface ArrayUtil {
    int[] createArray(int arrayLength);

    void fillArrayWithRandomNumbers(int[] array);

    void printArrayToConsole(int[] array);

    int findMaxNumber(int[] array);

    int findMinNumber(int[] array);
}
