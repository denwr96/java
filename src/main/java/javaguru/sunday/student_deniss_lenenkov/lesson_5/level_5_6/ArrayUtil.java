package javaguru.sunday.student_deniss_lenenkov.lesson_5.level_5_6;

import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Random;

@CodeReview(approved = true)
public class ArrayUtil {
    public int[] createArray (int arrayLength){
        int [] myArray = new int [arrayLength];
        return myArray;

    }

    public void fillArrayWithRandomNumbers(int [] myArray){
        Random random = new Random();
        for(int i = 0; i < myArray.length; i++){
            myArray[i] = random.nextInt(100);
        }
    }
    public int findMaxNumber(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;

    }
    public int findMinNumber(int[] array) {
        int min = array[0];
        for(int i = 0; i < array.length; i++){
            if(array[i] < min){
                min = array[i];
            }
        }
        return min;
    }
}
