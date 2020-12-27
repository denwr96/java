package javaguru.sunday.student_nataliya_sinitsa.lesson6.level4.task18;

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class TwoDimensionalArrayTest {

    public static void main(String[] args) {

        TwoDimensionalArrayTest test = new TwoDimensionalArrayTest();
        test.shouldFindASumOfTwoDimensionalArray1();
        test.shouldFindASumOfTwoDimensionalArray2();
    }

    public void shouldFindASumOfTwoDimensionalArray1() {
        TwoDimensionalArray victim = new TwoDimensionalArray();
        int[][] testArray = {{1, 1, 1}, {1, 1, 1}, {1, 1, 1}};
        int actualSum = victim.sumOfArrayNumbers(testArray);
        int expectedSum = 9;
        if (actualSum == expectedSum) {
            System.out.println("Test passed!");
        } else {
            System.out.println("Test failed! Expected result is 9, but actual is " + actualSum);
        }
    }

    public void shouldFindASumOfTwoDimensionalArray2() {
        TwoDimensionalArray victim = new TwoDimensionalArray();
        int[][] testArray = {{1, 2, 3}, {1, 1, 1}, {1, 1, 1}};
        int actualSum = victim.sumOfArrayNumbers(testArray);
        int expectedSum = 12;
        if (actualSum == expectedSum) {
            System.out.println("Test passed!");
        } else {
            System.out.println("Test failed! Expected result is 12, but actual is " + actualSum);
        }
    }

}
