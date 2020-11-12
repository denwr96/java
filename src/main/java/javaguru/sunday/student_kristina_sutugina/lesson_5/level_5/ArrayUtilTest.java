package main.java.javaguru.sunday.student_kristina_sutugina.lesson_5.level_5;

//Task_32
//Task_34
//Task_37
//Task_39
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
        int[] array = arrayUtil.createArray(5);
        check(5, array.length, "ShouldCreateArray");

    }

    public void shouldFillArrayWithRandomNumbers() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] array = arrayUtil.createArray(5);
        arrayUtil.fillArrayWithRandomNumbers(array);
        boolean passedTest = true;
        for (int value : array) {
            passedTest = value != 0;
        }
        if (passedTest) {
            System.out.println("Random numbers test passed");
        } else {
            System.out.println("Random numbers test failed");
        }
    }

    public void shouldFindMaxNumber() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] array = arrayUtil.createArray(5);
        arrayUtil.fillArrayWithRandomNumbers(array);
        int maxNumber = arrayUtil.findMaxNumber(array);
        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
            System.out.println(array[i]);
        }
        if (maxNumber == temp) {
            System.out.println("ShouldFindMaxNumber test passed, maximal number is " + maxNumber);
        } else {
            System.out.println("ShouldFindMaxNumber test passed failed");
        }
    }

    public void shouldFindMinNumber() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] array = arrayUtil.createArray(5);
        arrayUtil.fillArrayWithRandomNumbers(array);
        int minNumber = arrayUtil.findMinNumber(array);
        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] < array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
            System.out.println(array[i]);
        }
        if (minNumber == temp) {
            System.out.println("ShouldFindMinNumber test passed, minimal number is " + minNumber);
        } else {
            System.out.println("ShouldFindMinNumber test passed failed");
        }
    }

    public void check(int expectedResult, int actualResult, String testName) {
        if (expectedResult == actualResult) {
            System.out.println(testName + " test passed!");
        } else {
            System.out.println(testName + " test failed!");
            System.out.println("Expected: " + expectedResult + " but Actual: " + actualResult);
        }
    }
}