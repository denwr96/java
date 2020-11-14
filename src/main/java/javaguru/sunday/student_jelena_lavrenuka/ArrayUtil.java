package main.java.javaguru.sunday.student_jelena_lavrenuka;
// lesson_5 task_31
// lesson_5 task_32
// lesson_5 task_33
// lesson_5 task_34
// lesson_5 task_35
// lesson_5 task_36
// lesson_5 task_38

// lesson_6 task_9
// lesson_6 task_10
// lesson_6 task_11
// lesson_6 task_12
// lesson_6 task_13
// lesson_6 task_14

import main.java.javaguru.sunday.teacher.annotations.CodeReview;
import main.java.javaguru.sunday.teacher.annotations.CodeReviewComment;

import java.util.Arrays;
import java.util.Random;

@CodeReview(approved = true)
@CodeReviewComment(comment = "А почему метод printArrayToConsole показывает только четные числа?")
class ArrayUtil {
    public int[] createArray(int arrayLength) {
        int[] myArray = new int[arrayLength];
        return myArray;
    }

    public void fillArrayWithRandomNumbers(int[] myArray) {
        Random myRandom = new Random();
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = myRandom.nextInt(100);
        }
    }

    public void printArrayToConsole(int[] myArray) {
        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
        }
    }

    public int findMaxNumber(int[] myArray) {
        int max = myArray[0];
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] > max) {
                max = myArray[i];
            }
        }
        return max;
    }

    public int findMinNumber(int[] myArray) {
        int min = myArray[0];
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] < min) {
                min = myArray[i];
            }
        }
        return min;
    }

    public boolean findNumberInArray(int[] myArray, int number) {
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] == number) {
                return true;
            }
        }
        return false;
    }

    public int howManyEqualNumbersInArray(int[] myArray, int number) {
        int counter = 0;
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] == number) {
                counter++;
            }
        }
        return counter;
    }

    public void replace(int[] myArray, int numberToReplace, int newNumber) {
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] == numberToReplace) {
                myArray[i] = newNumber;
                break;
            }
        }
    }

    public void replaceAll(int[] myArray, int numberToReplace, int newNumber) {
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] == numberToReplace) {
                myArray[i] = newNumber;
            }
        }
    }

    public void reverse(int[] myArray) {
        int temporary;
        for (int i = 0; i < myArray.length / 2; i++) {
            temporary = myArray[myArray.length - 1 - i];
            myArray[myArray.length - 1 - i] = myArray[i];
            myArray[i] = temporary;
        }
    }

    public void sortArray(int[] myArray) {
        for (int i = myArray.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (myArray[j] > myArray[j + 1]) {
                    int temporary = myArray[j];
                    myArray[j] = myArray[j + 1];
                    myArray[j + 1] = temporary;
                }
            }
        }
    }
}