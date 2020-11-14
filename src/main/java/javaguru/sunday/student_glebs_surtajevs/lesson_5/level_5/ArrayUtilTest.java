package main.java.javaguru.sunday.student_glebs_surtajevs.lesson_5.level_5;

//Task_32
//Task_33
//Task_34

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class ArrayUtilTest {

    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
        test.shouldFillArrayWithRandomNumbers();
    }

    public void shouldCreateArray() {
        int arrayLength = 9;
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] result = arrayUtil.createArray(arrayLength);
        if (result.length == arrayLength) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
    }
    public void shouldFillArrayWithRandomNumbers() {
        int [] array = new int[3];
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] result = arrayUtil.fillArrayWithRandomNumbers(array);
        if (array.length > 0) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
    }
}
