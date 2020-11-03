package main.java.javaguru.sunday.student_sergej_savkin.lesson_5.level_6.task_35_36_37_38_39;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

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
        int[] result = arrayUtil.createArray(3);
        checkResult(result.length == 3, "shouldCreateArray");
    }

    public void shouldFillArrayWithRandomNumbers() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] myArray = arrayUtil.createArray(3);
        arrayUtil.fillArrayWithRandomNumbers(myArray);
        for (int i = 0; i < myArray.length; i++) {
            checkResult(myArray[i] == myArray[i], "shouldFillArrayWithRandomNumbers");
        }
    }

    public void shouldFindMaxNumber() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] myArray = arrayUtil.createArray(3);
        arrayUtil.fillArrayWithRandomNumbers(myArray);
        int maxNumber = arrayUtil.findMaxNumber(myArray);
        for (int i = 0; i < myArray.length; i++) {
            checkResult(maxNumber >= myArray[i], "shouldFindMaxNumber");
        }
    }

    public void shouldFindMinNumber() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] myArray = arrayUtil.createArray(3);
        arrayUtil.fillArrayWithRandomNumbers(myArray);
        int minNumber = arrayUtil.findMinNumber(myArray);
        for (int i = 0; i < myArray.length; i++) {
            checkResult(minNumber <= myArray[i], "shouldFindMinNumber");
        }
    }

    public void checkResult(boolean condition, String testName){
        if(condition){
            System.out.println(testName + " OK!");
        } else {
            System.out.println(testName + " FAIL!");
        }
    }
}
