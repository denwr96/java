package main.java.javaguru.sunday.student_sergej_savkin.lesson_5.level_5.task_31_32_33_34;

class ArrayUtilTest {
    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
        test.shouldFillArrayWithRandomNumbers();
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

    public void checkResult(boolean condition, String testName){
        if(condition){
            System.out.println(testName + " OK!");
        } else {
            System.out.println(testName + " FAIL!");
        }
    }
}
