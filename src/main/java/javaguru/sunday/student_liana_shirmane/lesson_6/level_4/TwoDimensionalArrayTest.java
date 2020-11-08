package main.java.javaguru.sunday.student_liana_shirmane.lesson_6.level_4;
//task18

class TwoDimensionalArrayTest {
    public static void main(String[] args) {
        TwoDimensionalArrayTest test = new TwoDimensionalArrayTest();
        test.sumAll();
    }


    void sumAll() {
        int[][] array = {{5, 5}, {10, 10}};
        TwoDimensionalArray test = new TwoDimensionalArray();
        int expectedResult = 30;
        int actualResult = test.sumAllNumbers(array);
        check(expectedResult, actualResult, "Sum test");
    }

    public void check(int expectedResult, int actualResult, String testName) {
        if (expectedResult == actualResult) {
            System.out.println(testName + " OK!");
        } else {
            System.out.println(testName + " failed!");
        }
    }
}
