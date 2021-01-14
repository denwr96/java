package javaguru.sunday.student_jelena_lavrenuka.lesson_6.task_18;

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class TwoDimensionalArrayTest {
    public static void main(String[] args) {
        TwoDimensionalArrayTest test = new TwoDimensionalArrayTest();
        test.fillTwoDimensionalArrayWithRandomNumbersTest();
        test.sumTwoDimensionalArrayTest();

    }

    public void fillTwoDimensionalArrayWithRandomNumbersTest() {
        TwoDimensionalArray victim = new TwoDimensionalArray();
        int[][] myArray = victim.twoDimensionalArrayCreate(3, 3);
        victim.fillTwoDimensionalArrayWithRandomNumbers(myArray);
        int counter = 0;
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray.length; j++) {
                if (myArray[i][j] > 100) {
                    counter++;
                }
            }
        }
        if (counter >= 1) {
            System.out.println("Test fillTwoDimensionalArrayWithRandomNumbers is failed");
        } else {
            System.out.println("Test fillTwoDimensionalArrayWithRandomNumbers is OK");
        }
    }

    public void sumTwoDimensionalArrayTest() {
        TwoDimensionalArray victim = new TwoDimensionalArray();
        int[][] myArray = {{2, 2, 2}, {3, 3, 3}, {1, 1, 1}};
        int expectedResult = 18;
        int actualResult = victim.sumTwoDimensionalArray(myArray);
        testResult(actualResult, expectedResult, "SumTwoDimensionalArray");
    }

    public void testResult(int actualResult, int expectedResult, String testName) {
        if (expectedResult == actualResult) {
            System.out.println(testName + " is OK");
        } else {
            System.out.println(testName + " is failed");
        }
    }
}
