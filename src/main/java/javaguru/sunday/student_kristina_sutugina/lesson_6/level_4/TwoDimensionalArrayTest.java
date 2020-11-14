package main.java.javaguru.sunday.student_kristina_sutugina.lesson_6.level_4;
//Task_18
class TwoDimensionalArrayTest {
    public static void main(String[] args) {
        TwoDimensionalArrayTest victim = new TwoDimensionalArrayTest();
        victim.sumOfNumbersTest();
    }

    public void sumOfNumbersTest() {
        TwoDimensionalArray victim = new TwoDimensionalArray();
        int[][] array = {{1, 2}, {3, 4}};
        int sum = victim.sumOfNumbers(array);
        check(10, sum, "sumOfNumbersTest");
    }

    public void check(int expectedResult, int actualResult, String testName) {
        if (expectedResult == actualResult) {
            System.out.println(testName + " test passed!");
        } else {
            System.out.println(testName + " test failed!");
            System.out.println("Expected: " + expectedResult + " but Actual: " + actualResult);
        }
    }
}
