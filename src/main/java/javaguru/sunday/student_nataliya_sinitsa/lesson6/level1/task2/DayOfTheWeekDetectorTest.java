package main.java.javaguru.sunday.student_nataliya_sinitsa.lesson6.level1.task2;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class DayOfTheWeekDetectorTest {

    public static void main(String[] args) {

        DayOfTheWeekDetectorTest dayOfTheWeekDetectorTest = new DayOfTheWeekDetectorTest();
        dayOfTheWeekDetectorTest.monday();
        dayOfTheWeekDetectorTest.tuesday();
        dayOfTheWeekDetectorTest.wednesday();
        dayOfTheWeekDetectorTest.thursday();
        dayOfTheWeekDetectorTest.friday();
        dayOfTheWeekDetectorTest.saturday();
        dayOfTheWeekDetectorTest.sunday();
        dayOfTheWeekDetectorTest.unknownInput();
    }

    public void monday() {
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();
        System.out.println("Enter '1'");
        String actualResult = dayOfTheWeekDetector.dayOfTheWeek();
        check("Monday", actualResult, "Monday Test");
    }

    public void tuesday() {
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();
        System.out.println("Enter '2'");
        String actualResult = dayOfTheWeekDetector.dayOfTheWeek();
        check("Tuesday", actualResult, "Tuesday Test");
    }

    public void wednesday() {
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();
        System.out.println("Enter '3'");
        String actualResult = dayOfTheWeekDetector.dayOfTheWeek();
        check("Wednesday", actualResult, "Wednesday Test");
    }

    public void thursday() {
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();
        System.out.println("Enter '4'");
        String actualResult = dayOfTheWeekDetector.dayOfTheWeek();
        check("Thursday", actualResult, "Thursday Test");
    }

    public void friday() {
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();
        System.out.println("Enter '5'");
        String actualResult = dayOfTheWeekDetector.dayOfTheWeek();
        check("Friday", actualResult, "Friday Test");
    }

    public void saturday() {
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();
        System.out.println("Enter '6'");
        String actualResult = dayOfTheWeekDetector.dayOfTheWeek();
        check("Saturday", actualResult, "Saturday Test");
    }

    public void sunday() {
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();
        System.out.println("Enter '7'");
        String actualResult = dayOfTheWeekDetector.dayOfTheWeek();
        check("Sunday", actualResult, "Sunday Test");
    }

    public void unknownInput() {
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();
        System.out.println("Enter any Integer which is not 1, 2, 3, 4, 5, 6 nor 7");
        String actualResult = dayOfTheWeekDetector.dayOfTheWeek();
        check("Unknown input. Please input a valid number between 1 and 7", actualResult, "Unknown input Test");
    }

    public void check(String expectedResult, String actualResult, String testName) {
        if (expectedResult.equals(actualResult)) {
            System.out.println(testName + " has passed!");
        } else {
            System.out.println(testName + " failed!");
            System.out.println("Expected: " + expectedResult + " but Actual: " + actualResult);
        }
        System.out.println(" ");
    }

}
