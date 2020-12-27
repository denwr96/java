package javaguru.sunday.student_sergej_savkin.lesson_6.level_4.task_18;

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class TwoDimensionalArrayTest {

    public static void main(String[] args) {

        TwoDimensionalArrayTest twoDimensionalArrayTest = new TwoDimensionalArrayTest();
        twoDimensionalArrayTest.calculateSumOfArrayNumbersTest();
    }

    public void calculateSumOfArrayNumbersTest(){
        TwoDimensionalArray test = new TwoDimensionalArray();
        int[][] myArray= {{1, 2}, {3, 4}};
        int actualResult = test.calculateSumOfArrayNumbers(myArray);
        check(10, actualResult, "calculateSumOfArrayNumbersTest");
    }


    public void check(int expectedResult, int actualResult, String testName){
        if(expectedResult == actualResult){
            System.out.println(testName + " OK!");
        } else {
            System.out.println(testName + " failed!");
        }
    }

}
