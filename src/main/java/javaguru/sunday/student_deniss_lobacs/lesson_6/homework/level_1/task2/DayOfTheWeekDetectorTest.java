package javaguru.sunday.student_deniss_lobacs.lesson_6.homework.level_1.task2;

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class DayOfTheWeekDetectorTest {
    public static void main(String[] args) {
        DayOfTheWeekDetectorTest dayOfTheWeekDetectorTest = new DayOfTheWeekDetectorTest();
        dayOfTheWeekDetectorTest.checkIsMonday();
        dayOfTheWeekDetectorTest.checkIsTuesday();
        dayOfTheWeekDetectorTest.checkIsWednesday();
        dayOfTheWeekDetectorTest.checkIsThursday();
        dayOfTheWeekDetectorTest.checkIsFriday();
        dayOfTheWeekDetectorTest.checkIsSaturday();
        dayOfTheWeekDetectorTest.checkIsSunday();
        dayOfTheWeekDetectorTest.checkIsValidNumber();
    }

    public void checkIsMonday() {
        String expectedResult = "Monday";
        String actualResult = DayOfTheWeekDetector.detectDayName(1);
        check(actualResult == expectedResult, "Check to Monday -");
    }

    public void checkIsTuesday() {
        String expectedResult = "Tuesday";
        String actualResult = DayOfTheWeekDetector.detectDayName(2);
        check(actualResult == expectedResult, "Check to Tuesday -");
    }

    public void checkIsWednesday() {
        String expectedResult = "Wednesday";
        String actualResult = DayOfTheWeekDetector.detectDayName(3);
        check(actualResult == expectedResult, "Check to Wednesday -");
    }

    public void checkIsThursday() {
        String expectedResult = "Thursday";
        String actualResult = DayOfTheWeekDetector.detectDayName(4);
        check(actualResult == expectedResult, "Check to Thursday -");
    }

    public void checkIsFriday() {
        String expectedResult = "Friday";
        String actualResult = DayOfTheWeekDetector.detectDayName(5);
        check(actualResult == expectedResult, "Check to Friday -");
    }

    public void checkIsSaturday() {
        String expectedResult = "Saturday";
        String actualResult = DayOfTheWeekDetector.detectDayName(6);
        check(actualResult == expectedResult, "Check to Saturday -");
    }

    public void checkIsSunday() {
        String expectedResult = "Sunday";
        String actualResult = DayOfTheWeekDetector.detectDayName(7);
        check(actualResult == expectedResult, "Check to Sunday -");
    }

    public void checkIsValidNumber() {
        String expectedResult = "Please input a valid number between 1 and 7";
        String actualResult = DayOfTheWeekDetector.detectDayName(8);
        check(actualResult == expectedResult, "Check to valid number -");
    }

    public void check(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " OK");
        } else {
            System.out.println(testName + " FAIL");
        }
    }
}
