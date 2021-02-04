package javaguru.sunday.student_liana_shirmane.lesson_10.level_1;
 //task2


import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
public interface ArrayUtil {

    int[] createArray(int arrayLength);

    void fillArrayWithRandomNumbers(int[] array);

    void printArrayToConsole(int[] array);

    int findMaxNumber(int[] array);

    int findMinNumber(int[] array);
}
