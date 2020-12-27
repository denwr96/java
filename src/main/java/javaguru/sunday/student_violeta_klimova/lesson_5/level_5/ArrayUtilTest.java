package javaguru.sunday.student_violeta_klimova.lesson_5.level_5;

// Task 32
// Task 34
// Task 37

class ArrayUtilTest {

    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
        test.shouldFillArrayWithRandomNumbers();
        test.shouldFindMaxNumber();
        test.shouldFindMinNumber();
    }

    public void shouldCreateArray() {
        int expectedLength = 1;

        ArrayUtil arrayUtil = new ArrayUtil();
        int[] array = arrayUtil.createArray(expectedLength);

        printTestResult("shouldCreateArray", array.length == expectedLength);
    }

    public void shouldFillArrayWithRandomNumbers() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] array = arrayUtil.createArray(100);
        arrayUtil.fillArrayWithRandomNumbers(array);

        boolean result = true;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                result = false;
                break;
            }
        }
        printTestResult("shouldFillArrayWithRandomNumbers", result);
    }

    public void shouldFindMaxNumber() {
        int expectedMaxNumber = 56;
        int[] array = {12, -5, 43, 56, 18};

        ArrayUtil arrayUtil = new ArrayUtil();
        int max = arrayUtil.findMaxNumber(array);

        printTestResult("shouldFindMaxNumber", expectedMaxNumber == max);
    }

    public void shouldFindMinNumber() {
        int expectedMinNumber = -5;
        int[] array = {12, -5, 43, 56, 18};

        ArrayUtil arrayUtil = new ArrayUtil();
        int min = arrayUtil.findMinNumber(array);

        printTestResult("shouldFindMinNumber", expectedMinNumber == min);
    }

    public void printTestResult(String test, boolean passed) {
        if (passed) {
            System.out.println(test + " PASSED!");
        } else {
            System.out.println(test + " FAILED!");
        }
    }
}