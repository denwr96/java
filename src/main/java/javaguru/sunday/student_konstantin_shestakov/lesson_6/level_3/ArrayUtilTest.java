package main.java.javaguru.sunday.student_konstantin_shestakov.lesson_6.level_3;

// Task 9
// Task 10
// Task 11
// Task 12
// Task 13
// Task 14 (level 4)

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Arrays;
@CodeReview(approved = true)
class ArrayUtilTest {

    public static void main(String[] args) {
        ArrayUtilTest arrayUtilTest = new ArrayUtilTest();
        arrayUtilTest.shouldFindInputNumber();
        arrayUtilTest.checkRepeatCountOfNumberTest();
        arrayUtilTest.replaceArrayElementTest();
        arrayUtilTest.replaceArrayAllSameElementsTest();
        arrayUtilTest.invertArrayTest();
        arrayUtilTest.sortArrayTest();
    }

    ArrayUtil arrayUtil = new ArrayUtil();

    public void shouldFindInputNumber() {
        int[] arrayOne = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(arrayOne));
        checkResults(arrayUtil.findInputNumber(arrayOne, 5), "Find input number test");
    }

    public void checkRepeatCountOfNumberTest() {
        int[] arrayOne = arrayUtil.createArray(5);
        arrayOne = arrayUtil.fillArrayWithRandomNumbers(arrayOne);
        System.out.println(Arrays.toString(arrayOne));
        System.out.println("Number of repeats of an input number = " + arrayUtil.checkRepeatCountOfNumber(arrayOne, 5));
        checkResults(arrayUtil.checkRepeatCountOfNumber(arrayOne, 5) == arrayUtil.checkRepeatCountOfNumber(arrayOne, 5), "Check for repeats of an input number TEST" );
    }

    public void replaceArrayElementTest() {
        int[] arrayOne = arrayUtil.createArray(5);
        arrayOne = arrayUtil.fillArrayWithRandomNumbers(arrayOne);
        int[] arrayOriginal = Arrays.copyOf(arrayOne, arrayOne.length);
        System.out.println("\nArray before number replacement (only first apperance): ");
        System.out.println(Arrays.toString(arrayOriginal));
        arrayUtil.replace(arrayOne, 1, 100);
        System.out.println("Array after number replacement (only first apperance): ");
        System.out.println(Arrays.toString(arrayOne));

        for (int i = 0; i < arrayOne.length; i++) {
           checkResults((arrayOne[i] == 100 && arrayOriginal[i] == 1), "Replace array (once only) " + (i + 1) + " element test");
        }
    }

    public void replaceArrayAllSameElementsTest() {
        int[] arrayOne = arrayUtil.createArray(5);
        arrayOne = arrayUtil.fillArrayWithRandomNumbers(arrayOne);
        int[] arrayOriginal = Arrays.copyOf(arrayOne, arrayOne.length);
        System.out.println("\nArray before number(s) replacement: ");
        System.out.println(Arrays.toString(arrayOriginal));
        arrayUtil.replaceAll(arrayOne, 1, 100);
        System.out.println("Array after number(s) replacement: ");
        System.out.println(Arrays.toString(arrayOne));

        for (int i = 0; i < arrayOne.length; i++) {
            checkResults((arrayOne[i] == 100 && arrayOriginal[i] == 1), "Replace array " + (i + 1) + " element test");
        }
    }

    public void invertArrayTest() {
        int[] arrayOne = arrayUtil.createArray(5);
        arrayOne = arrayUtil.fillArrayWithRandomNumbers(arrayOne);
        int[] arrayOriginal = Arrays.copyOf(arrayOne, arrayOne.length);
        System.out.println("\nArray before inversion: ");
        System.out.println(Arrays.toString(arrayOriginal));
        arrayUtil.invertArray(arrayOne);
        System.out.println("Array after inversion: ");
        System.out.println(Arrays.toString(arrayOne));

        for (int i = 0; i < arrayOne.length; i++) {
            checkResults((arrayOne[i] == arrayOriginal[arrayOne.length - 1 - i]), "Array inversion, TEST element " + (i + 1));
        }
    }

    public void sortArrayTest() {
        int[] arrayOne = arrayUtil.createArray(5);
        arrayOne = arrayUtil.fillArrayWithRandomNumbers(arrayOne);
        System.out.println("\nArray before sort: ");
        System.out.println(Arrays.toString(arrayOne));
        Arrays.sort(arrayOne);
        int[] arrayTwo = arrayUtil.sortArray(arrayOne);
        System.out.println("Array after sort: ");
        System.out.println(Arrays.toString(arrayOne));

        for (int i = 0; i < arrayTwo.length; i++) {
            if (i == arrayTwo.length - 1) {
                break;
            }
            checkResults(arrayTwo[i] <= arrayTwo[i + 1], (i + 1) + " element, value = " + (arrayTwo[i]) + " <= " + arrayTwo[i + 1] + " (element " + (i + 2) + "), TEST");
        }
    }

    public boolean checkResults(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK");
            return condition;
        } else {
            System.out.println(testName + " = FAIL");
            return !condition;
        }
    }
}
