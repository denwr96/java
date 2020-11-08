package main.java.javaguru.sunday.student_liana_shirmane.lesson_6.level_1;

class DayOfTheWeekTest {

    public static void main(String[] args) {
        DayOfTheWeekTest dayOfTheWeekTest = new DayOfTheWeekTest();
        dayOfTheWeekTest.TestMonday(1);
        dayOfTheWeekTest.TestTuesday(2);
        dayOfTheWeekTest.TestWednesday(3);
        dayOfTheWeekTest.TestThursday(4);
        dayOfTheWeekTest.TestFriday(5);
        dayOfTheWeekTest.TestSaturday(6);
        dayOfTheWeekTest.TestSunday(7);
        dayOfTheWeekTest.TestNoDay(8);
    }

    public void TestMonday(int number) {
        String expectedResult = "Monday";
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();
        String actualResult = dayOfTheWeekDetector.detectDayName(number);
        check(expectedResult, actualResult, "Monday test");

    }

    public void TestTuesday(int number) {
        String expectedResult = "Tuesday";
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();
        String actualResult = dayOfTheWeekDetector.detectDayName(number);
        check(expectedResult, actualResult, "Tuesday test");

    }

    public void TestWednesday(int number) {
        String expectedResult = "Wednesday";
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();
        String actualResult = dayOfTheWeekDetector.detectDayName(number);
        check(expectedResult, actualResult, "Wednesday test");

    }
    public void TestThursday(int number) {
        String expectedResult = "Thursday";
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();
        String actualResult = dayOfTheWeekDetector.detectDayName(number);
        check(expectedResult, actualResult, "Thursday test");

    }
    public void TestFriday(int number) {
        String expectedResult = "Friday";
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();
        String actualResult = dayOfTheWeekDetector.detectDayName(number);
        check(expectedResult, actualResult, "Friday test");

    }
    public void TestSaturday(int number) {
        String expectedResult = "Saturday";
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();
        String actualResult = dayOfTheWeekDetector.detectDayName(number);
        check(expectedResult, actualResult, "Saturday test");

    }
    public void TestSunday(int number) {
        String expectedResult = "Sunday";
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();
        String actualResult = dayOfTheWeekDetector.detectDayName(number);
        check(expectedResult, actualResult, "Sunday test");

    }
    public void TestNoDay(int number) {
        String expectedResult = "Please input a valid number between 1 and 7";
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();
        String actualResult = dayOfTheWeekDetector.detectDayName(number);
        check(expectedResult, actualResult, "Not a day test");

    }


    public void check(String expectedResult, String actualResult, String testName) {
        if (expectedResult.equals(actualResult)) {
            System.out.println(testName + " has passed!");
        } else {
            System.out.println(testName + " failed!");
            System.out.println("Expected: " + expectedResult + " but Actual: " + actualResult);
        }
    }
}
