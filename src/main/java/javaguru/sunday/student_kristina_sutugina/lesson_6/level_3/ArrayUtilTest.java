package main.java.javaguru.sunday.student_kristina_sutugina.lesson_6.level_3;

import java.util.Arrays;
//Task_9
//Task_10
//Task_11
//Task_12
//Task_13
//Task_14
class ArrayUtilTest {

    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.findNumberTestTrue(5);
        test.findNumberTestFalse(6);
        test.countNumberQuantityTest(5, "countNumberQuantityTest");
        test.replaceTest("replaceTest");
        test.replaceAllTest("replaceAllTest");
        test.reverseTest("reverseTest");
        test.sortTest("sortTest");

    }

    public void findNumberTestTrue(int number) {
        ArrayUtil victim = new ArrayUtil();
        int[] array = {1, 2, 3, 4, 5};
        boolean checkNumber = victim.findNumber(array, number);
        check(checkNumber, "findNumberTestTrue");

    }

    public void findNumberTestFalse(int number) {
        ArrayUtil victim = new ArrayUtil();
        int[] array = {1, 2, 3, 4, 5};
        boolean checkNumber = victim.findNumber(array, number);
        check(checkNumber, "findNumberTestFalse");

    }

    public void countNumberQuantityTest(int number, String testName) {
        ArrayUtil victim = new ArrayUtil();
        int[] array = {1, 2, 5, 5, 5};
        int result = victim.countNumberQuantity(array, number);
        if (result == 3) {
            System.out.println(testName + " test passed");
        } else {
            System.out.println(testName + " test failed");
        }
    }

    public void replaceTest(String testName) {
        ArrayUtil victim = new ArrayUtil();
        int[] array = {1, 2, 5, 5, 5};
        victim.replace(array, 5, 9);
        if (array[2] == 9) {
            System.out.println(testName + " test passed");
        } else {
            System.out.println(testName + " test failed");
        }
    }

    public void replaceAllTest(String testName) {
        ArrayUtil victim = new ArrayUtil();
        int[] array = {1, 2, 5, 5, 5};
        int[] newArray = {1, 2, 9, 9, 9};
        victim.replaceAll(array, 5, 9);
        if (Arrays.equals(array, newArray)) {
            System.out.println(testName + " test passed");
        } else {
            System.out.println(testName + " test failed");
        }
    }

    public void reverseTest(String testName) {
        ArrayUtil victim = new ArrayUtil();
        int[] array = {1, 2, 5, 5, 5};
        int[] newArray = {5, 5, 5, 2, 1};
        if (Arrays.equals(victim.reverse(array), newArray)) {
            System.out.println(testName + " test passed");
        } else {
            System.out.println(testName + " test failed");
        }
    }

    public void sortTest(String testName) {
        ArrayUtil victim = new ArrayUtil();
        int[] array = {6, 2, 8, 2, 5};
        int[] sortedArray = {2, 2, 5, 6, 8};
        victim.sort(array);
        if (Arrays.equals(array, sortedArray)) {
            System.out.println(testName + " test passed");
        } else {
            System.out.println(testName + " test failed");
        }
    }

    public void check(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " test passed");
        } else {
            System.out.println(testName + " test failed");
        }
    }
}