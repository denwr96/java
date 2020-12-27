package javaguru.sunday.student_natalia_kochkina.lesson_6.level_3;

//Task_9
//Task_10
//Task_11
//Task_12
//Task_13
//Task_14

import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Arrays;
@CodeReview(approved = true)
public class ArrayUtilTest {

    public static void main(String[] args) {
        ArrayUtilTest arrayUtilTest = new ArrayUtilTest();
        arrayUtilTest.shouldContainsThisNumber();
        arrayUtilTest.shouldContainsThisNumber2();
        arrayUtilTest.shouldFindNumberOfTimes();
        arrayUtilTest.shouldFindNumberOfTimes2();
        arrayUtilTest.shouldReplaceNumbers();
        arrayUtilTest.shouldReplaceAllNumbers();
        arrayUtilTest.shouldReversArray();
        arrayUtilTest.shouldBubbleSort();
    }


    public void shouldContainsThisNumber() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] array = {5, 3, 8, 9, 104, 66};
        boolean isTrue = arrayUtil.containsThisNumber(array,9);
        if (isTrue == true) {
            System.out.println("ContainsThisNumberTest is ok");
        } else {
            System.out.println("ContainsThisNumberTest is failed");
        }
    }

    public void shouldContainsThisNumber2() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] array = {5, 3, 8, 9, 104, 66};
        boolean isTrue = arrayUtil.containsThisNumber(array,11);
        if (isTrue == false) {
            System.out.println("ContainsThisNumberTest is ok");
        } else {
            System.out.println("ContainsThisNumberTest is failed");
        }
    }

    public void shouldFindNumberOfTimes() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] array = {5, 3, 8, 9, 104, 66, 5};
        int numberOfTimes = arrayUtil.numberOfTimes(array, 5);
        if (numberOfTimes == 2) {
            System.out.println("NumberOfTimesTest ok");
        } else {
            System.out.println("NumberOfTimesTest failed");
        }
    }

    public void shouldFindNumberOfTimes2() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] array = {5, 3, 8, 9, 104, 66, 5};
        int numberOfTimes = arrayUtil.numberOfTimes(array, 1);
        if (numberOfTimes == 0) {
            System.out.println("NumberOfTimesTest ok");
        } else {
            System.out.println("NumberOfTimesTest failed");
        }
    }

    public void shouldReplaceNumbers() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] array = {5, 3, 8, 9, 104, 66, 3};
        arrayUtil.replace(array, 3, 999);
        if (array[1] == 999) {
            System.out.println("ReplaceNumbersTest is ok");
        } else {
            System.out.println("ReplaceNumbersTest is failed");
        }
    }

    public void shouldReplaceAllNumbers() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] array = {2, 0, 6, 2, 8};
        int[] expectedArray = {1, 0, 6, 1, 8};
        arrayUtil.replaceAll(array, 2, 1);
        if (Arrays.equals(array, expectedArray)) {
            System.out.println("ReplaceAllNumbersTest is ok");
        } else {
            System.out.println("ReplaceAllNumbersTest is failed");
        }
    }

    public void shouldReversArray() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] array = {1, 2, 3, 4, 5};
        int[] expectedArray = {5, 4, 3, 2, 1};
        int[] resultArray = arrayUtil.reversArray(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(resultArray[i] + " ");
        }
        if (Arrays.equals(resultArray, expectedArray)) {
            System.out.println("ReversTest is ok");
        } else {
            System.out.println("ReversTest is failed");
        }
    }

    public void shouldBubbleSort() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] array = {5, 3, 2, 4, 1};
        int[] expectedArray = {1, 2, 3, 4, 5};
        arrayUtil.bubbleSort(array);
        if (Arrays.equals(array, expectedArray)) {
            System.out.println("SortingTest is ok");
        } else {
            System.out.println("SortingTest is failed");
        }

    }

}
