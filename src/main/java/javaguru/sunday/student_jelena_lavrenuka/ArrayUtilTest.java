package javaguru.sunday.student_jelena_lavrenuka;
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

import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Arrays;

@CodeReview(approved = true)
class ArrayUtilTest {
    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
        test.shouldFillArrayWithRandomNumbers();
        test.shouldFillArrayWithRandomNumbers1();
        test.shouldFindMaxNumber();
        test.shouldFindMinNumber();
        test.findNumberInArrayTest();
        test.howManyEqualNumbersInArrayTest();
        test.replaceTest();
        test.replaceAllTest();
        test.reversTest();
        test.sortArrayTest();
    }

    public void shouldCreateArray() {
        ArrayUtil victim = new ArrayUtil();
        int arrayLength = 5;
        victim.createArray(5);
        if (arrayLength > 0) {
            System.out.println("Test shouldCreateArray is OK");
        } else {
            System.out.println("Test  shouldCreateArray is failed");
        }
    }

    public void shouldFillArrayWithRandomNumbers() {
        ArrayUtil victim = new ArrayUtil();
        int[] myArray = victim.createArray(5);
        victim.fillArrayWithRandomNumbers(myArray);
        testArray(myArray);
    }

    private void testArray(int[] myArray) {
        boolean result = true;
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] > 100) {
                result = false;
                testResult(result, "Name");
                break;
            }
        }
        testResult(result, "Name");
    }

    public void shouldFillArrayWithRandomNumbers1() {
        ArrayUtil victim = new ArrayUtil();
        int[] myArray = victim.createArray(5);
        victim.fillArrayWithRandomNumbers(myArray);
        int counter = 0;
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] < 100) {
                counter++;
            }
        }
        if (counter == myArray.length) {
            System.out.println("Test shouldFillArrayWithRandomNumbers1 is OK");
        } else {
            System.out.println("Test shouldFillArrayWithRandomNumbers1 is failed");
        }
    }

    public void shouldFindMaxNumber() {
        ArrayUtil victim = new ArrayUtil();
        int[] myArray = {17, -9, 78, 23, 98, -7};
        int expectedResult = myArray[4];
        int actualResult = victim.findMaxNumber(myArray);
        testResult(actualResult, expectedResult, "ShouldFindMaxNumber Test");
    }

    public void shouldFindMinNumber() {
        ArrayUtil victim = new ArrayUtil();
        int[] myArray = {17, -9, 78, 23, 98, -7};
        int expectedResult = myArray[1];
        int actualResult = victim.findMinNumber(myArray);
        testResult(actualResult, expectedResult, "ShouldFindMinNumber Test");
    }

    public void findNumberInArrayTest (){
        ArrayUtil victim = new ArrayUtil();
        int[] myArray = {17, -9, 78, 23, 98, -7};
        boolean result = victim.findNumberInArray(myArray, 78);
        testResult(result, "FindNumberInArrayTest");
    }

    public void howManyEqualNumbersInArrayTest(){
        ArrayUtil victim = new ArrayUtil();
        int[] myArray = {17, 9, 78, 9, 98};
        int expectedResult = 2;
        int actualResult = victim.howManyEqualNumbersInArray(myArray, 9);
        testResult(actualResult, expectedResult, "HowManyEqualNumbersInArray Test");
    }

    public void replaceTest(){
        ArrayUtil victim = new ArrayUtil();
        int[] myArray = {17, 9, 78, 9, 98};
        victim.replace(myArray,9,11);
       // for (int i = 0; i < myArray.length; i++) {
       //     System.out.println(myArray[i]);
       // }
        if (myArray[1] == 11 && myArray[3] != 11) {
            System.out.println("Replace Test is OK");
        }else{
            System.out.println("Replace Test is failed");
        }
    }

    public void replaceAllTest(){
        ArrayUtil victim = new ArrayUtil();
        int[] myArray = {17, 9, 78, 9, 98};
        victim.replaceAll(myArray,9,11);
        if (myArray[1] == 11 && myArray[3] == 11) {
            System.out.println("ReplaceAll Test is OK");
        }else{
            System.out.println("ReplaceAll Test is failed");
        }
    }

    public void reversTest (){
        ArrayUtil victim = new ArrayUtil();
        int[] myArrayOld = {17, 2, 78, 9, 98};
        int[] myArrayNew = {98, 9, 78, 2, 17};
        victim.reverse(myArrayOld);
        testResult(myArrayOld, myArrayNew, "ReversTest");
    }

    public void sortArrayTest(){
        ArrayUtil victim = new ArrayUtil();
        int[] myArrayOld = {252, -96, 1, 0, 75, -6};
        int[] myArrayNew = {-96, -6, 0, 1, 75, 252};
        victim.sortArray(myArrayOld);
        testResult(myArrayOld, myArrayNew, "SortArrayTest");
    }

    public void testResult(boolean result, String testName) {
        if (result) {
            System.out.println(testName + " is OK");
        } else {
            System.out.println(testName + " is failed");
        }
    }

    public void testResult(int actualResult, int expectedResult, String testName) {
        if (expectedResult == actualResult) {
            System.out.println(testName + " is OK");
        } else {
            System.out.println(testName + " is failed");
        }
    }

    public void testResult (int [] myArrayOld, int [] myArrayNew, String testName) {
        if (Arrays.equals(myArrayNew, myArrayOld)) {
            System.out.println(testName + " is OK");
        } else {
            System.out.println(testName + " is failed");
        }
    }
}

