package main.java.javaguru.sunday.student_liana_shirmane.lesson_10.level_2;
//task4

public class DayOfTheWeekDetectorSwitchVersionTest {
    public static void main(String[] args) {
        DayOfTheWeekDetectorSwitchVersionTest test = new DayOfTheWeekDetectorSwitchVersionTest();
        test.itIsDayOFWeek();
        test.itIsNotDayOFWeek();
    }

    public void itIsDayOFWeek() {
        DayOfTheWeekDetectorSwitchVersion test = new DayOfTheWeekDetectorSwitchVersion();
        String expectedResult = "Monday";
        String actualResult = test.detectDayName(1);
        check(expectedResult, actualResult, "it is day of week");
    }

    public void itIsNotDayOFWeek() {
        DayOfTheWeekDetectorIfVersion test = new DayOfTheWeekDetectorIfVersion();
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

