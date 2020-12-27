package javaguru.sunday.student_natalia_kochkina.lesson_5.level_5;

import javaguru.sunday.teacher.annotations.CodeReview;

//Task_32
//Task_34
//Task_37
//Task_39
@CodeReview(approved = true)
class ArrayUtilTest {

    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
        test.shouldFillArrayWithRandomNumbers();
        test.shouldFindMaxNumber();
        test.shouldFindMinNumber();
    }

    public void shouldCreateArray() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] array = arrayUtil.createArray(4);

        boolean testOk = true;

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
            if (array[i] != 0) {
                testOk = false;
            }
        }

        if (testOk == true) {
            System.out.println("Test1 Ok");
        } else {
            System.out.println("Test1 failed");
        }

    }
    public void shouldFillArrayWithRandomNumbers() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] array = arrayUtil.createArray(7);
        arrayUtil.fillArrayWithRandomNumbers(array);

        boolean testOk = true;

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
            if (array[i] == 0) {
                testOk = false;
            }
        }

        if (testOk == true) {
            System.out.println("Test2 Ok");
        } else {
            System.out.println("Test2 failed");
        }
    }

    public void shouldFindMaxNumber() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] array = {3, 5, 2, 10, 7};
        int maxNumber = arrayUtil.findMaxNumber(array);

        if (maxNumber == 10) {
            System.out.println("MaxTest Ok");
        } else {
            System.out.println("MaxTest failed");
        }
    }

    public void shouldFindMinNumber() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] array = {3, 5, 2, 10, 7};
        int minNumber = arrayUtil.findMinNumber(array);

        if (minNumber == 2) {
            System.out.println("MinTest Ok");
        } else {
            System.out.println("MinTest failed");
        }
    }
}