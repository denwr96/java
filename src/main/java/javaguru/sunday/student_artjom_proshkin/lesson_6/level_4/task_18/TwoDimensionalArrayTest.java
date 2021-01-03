package javaguru.sunday.student_artjom_proshkin.lesson_6.level_4.task_18;

class TwoDimensionalArrayTest {

    public static void main(String[] args) {
        TwoDimensionalArrayTest test = new TwoDimensionalArrayTest();
        test.calculateSumOfTwoDimArrayTest();

    }

    void calculateSumOfTwoDimArrayTest() {
        TwoDimensionalArray victim = new TwoDimensionalArray();
        int[][] myTwoDimArray = {{3, 4}, {2, 5}};
        int actualResult = victim.calculateSumOfTwoDimArray(myTwoDimArray);
        checkResult(14, actualResult, "calculateSumOfTwoDimArrayTest");
    }

    void checkResult(int expectedResult, int actualResult, String testName) {
        if (expectedResult == actualResult) {
            System.out.println(testName + " PASSED !");
        } else {
            System.out.println(testName + "FAILURE !");
            System.out.println("Expected = " + expectedResult + "; Actual = " + actualResult + "; Test = " + testName);
        }
    }
}
