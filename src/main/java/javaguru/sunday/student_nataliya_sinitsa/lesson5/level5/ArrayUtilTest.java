package main.java.javaguru.sunday.student_nataliya_sinitsa.lesson5.level5;

//Task 31 - Task 41

class ArrayUtilTest {

    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray1();
        test.shouldCreateArray2();
        test.shouldFillArrayWithRandomNumbers();
        test.shouldFindMaxNumber();
        test.shouldFindMinNumber();
    }

    public void shouldCreateArray1() {
        ArrayUtil victim = new ArrayUtil();
        int[] testArray = victim.createArray(5);
        check(5, testArray.length, "Should create array Test");
    }

    public void shouldCreateArray2() {
        ArrayUtil victim = new ArrayUtil();
        int[] testArray = victim.createArray(10);
        check(10, testArray.length, "Should create array Test");
    }

    public void shouldFillArrayWithRandomNumbers() {
        ArrayUtil victim = new ArrayUtil();
        int[] testArray = victim.createArray(5);
        victim.fillArrayWithRandomNumbers(testArray);

        int sum = 0;
        for (int testArrayItem : testArray) {
            sum = +testArrayItem;
        }

        boolean isSumNotNull;
        isSumNotNull = sum != 0;
        check(isSumNotNull, "Should fill array with random numbers Test");
    }

    public void shouldFindMaxNumber() {
        ArrayUtil victim = new ArrayUtil();
        int[] testArray = victim.createArray(5);
        victim.fillArrayWithRandomNumbers(testArray);

        int testMaxNumber = testArray[4];
        for (int i = 3; i >= 0; i--) {
            if (testArray[i] > testMaxNumber) {
                testMaxNumber = testArray[i];
            }
        }
        check(victim.findMaxNumber(testArray), testMaxNumber, "Find max number Test");
    }

    public void shouldFindMinNumber() {
        ArrayUtil victim = new ArrayUtil();
        int[] testArray = victim.createArray(5);
        victim.fillArrayWithRandomNumbers(testArray);

        int testMinNumber = testArray[4];
        for (int i = 3; i >= 0; i--) {
            if (testArray[i] < testMinNumber) {
                testMinNumber = testArray[i];
            }
        }
        check(victim.findMinNumber(testArray), testMinNumber, "Find min number Test");
    }

    public void check(int expectedResult, int actualResult, String testName) {
        if (expectedResult == actualResult) {
            System.out.println(testName + " has passed!");
        } else {
            System.out.println(testName + " failed!");
            System.out.println("Expected: " + expectedResult + " but Actual: " + actualResult);
        }
    }

    public void check(boolean actualResult, String testName) {
        if (actualResult) {
            System.out.println(testName + " has passed!");
        } else {
            System.out.println(testName + " failed!");
        }
    }

//    Проверка вывода на консоль для себя - чтобы знать, чтобы понимать
//    public void shouldPrintArrayToConsole() {
//        ArrayUtil victim = new ArrayUtil();
//        int testArray[] = victim.createArray(5);
//        victim.fillArrayWithRandomNumbers(testArray);
//        victim.printArrayToConsole(testArray);
//    }

}
