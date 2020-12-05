package main.java.javaguru.sunday.student_liana_shirmane.lesson_10.level_2;
//task4

public class DayOfTheWeekDetectorArrayVersionTest {
    public static void main(String[] args) {
        DayOfTheWeekDetectorArrayVersionTest test = new DayOfTheWeekDetectorArrayVersionTest();
        test.itIsDayOfWeek();
        test.itIsNotDayOfWeek();
    }

    public void itIsDayOfWeek() {
        DayOfTheWeekDetectorArrayVersion test = new DayOfTheWeekDetectorArrayVersion();
        String expectedResult = "Monday";
        String actualResult = test.detectDayName(1);
        check(expectedResult, actualResult, "it is day of week");
    }

    public void itIsNotDayOfWeek() {
        DayOfTheWeekDetectorArrayVersion test = new DayOfTheWeekDetectorArrayVersion();
        String expectedResult = "Please input a valid number between 1 and 7";
        String actualResult = test.detectDayName(8);
        check(expectedResult, actualResult, "it is not day of week");
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

