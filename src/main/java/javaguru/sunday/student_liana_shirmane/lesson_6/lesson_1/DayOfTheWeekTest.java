package main.java.javaguru.sunday.student_liana_shirmane.lesson_6.lesson_1;

class DayOfTheWeekTest {

    public static void main(String[] args) {
        DayOfTheWeekTest dayOfTheWeekTest = new DayOfTheWeekTest();
        dayOfTheWeekTest.Test1(1);
    }

    public void Test1(int number) {
        String expectedResult = "Monday";
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();
        String result = dayOfTheWeekDetector.detectDayName(number);
        check(expectedResult, result, "Monday Ok");
        //check("Day one test");
    }

    public void check(String expectedResult, String actualResult, String testName) {
        if (expectedResult.equals(actualResult)) {
            System.out.println(testName + " has passed!");
        } else {
            System.out.println(testName + " failed!");
            System.out.println("Expected: " + expectedResult + " but Actual: " + actualResult);
        }
    }

    public void check(int expectedResult, int actualResult, String testName) {
        if (expectedResult == actualResult) {
            System.out.println(testName + "  has passed!");
        } else {
            System.out.println(testName + " failed!");
            System.out.println("Expected: " + expectedResult + " but Actual: " + actualResult);
        }
    }
}
