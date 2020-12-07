package main.java.javaguru.sunday.student_sergej_savkin.lesson_10.level_2_intern.task_4_5;

//task4

public class DayOfTheWeekDetectorTest {
    public static void main(String[] args) {
        DayOfTheWeekDetectorTest DayOfTheWeekDetectorTest = new DayOfTheWeekDetectorTest();
        DayOfTheWeekDetectorTest.DayOfTheWeekDetectorIfVersionTestOne();
        DayOfTheWeekDetectorTest.DayOfTheWeekDetectorIfVersionTestTwo();
        DayOfTheWeekDetectorTest.DayOfTheWeekDetectorSwitchVersionTestOne();
        DayOfTheWeekDetectorTest.DayOfTheWeekDetectorSwitchVersionTestTwo();
        DayOfTheWeekDetectorTest.DayOfTheWeekDetectorArrayVersionTestOne();
        DayOfTheWeekDetectorTest.DayOfTheWeekDetectorArrayVersionTestTwo();

    }

    public void DayOfTheWeekDetectorArrayVersionTestOne() {
        DayOfTheWeekDetectorArrayVersion test = new DayOfTheWeekDetectorArrayVersion();
        check(test.detectDayName(4), "Thursday", "DayOfTheWeekDetectorArrayVersionTestOne");
    }

    public void DayOfTheWeekDetectorArrayVersionTestTwo() {
        DayOfTheWeekDetectorArrayVersion test = new DayOfTheWeekDetectorArrayVersion();
        check(test.detectDayName(7), "Sunday", "DayOfTheWeekDetectorArrayVersionTestTwo");
    }

    public void DayOfTheWeekDetectorSwitchVersionTestTwo() {
        DayOfTheWeekDetectorSwitchVersion test = new DayOfTheWeekDetectorSwitchVersion();
        check(test.detectDayName(6), "Saturday", "DayOfTheWeekDetectorSwitchVersionTestTwo");
    }

    public void DayOfTheWeekDetectorSwitchVersionTestOne() {
        DayOfTheWeekDetectorSwitchVersion test = new DayOfTheWeekDetectorSwitchVersion();
        check(test.detectDayName(3), "Wednesday", "DayOfTheWeekDetectorSwitchVersionTestOne");
    }

    public void DayOfTheWeekDetectorIfVersionTestOne() {
        DayOfTheWeekDetectorIfVersion test = new DayOfTheWeekDetectorIfVersion();
        check(test.detectDayName(2), "Tuesday", "DayOfTheWeekDetectorIfVersionTestOne");
    }
    
    public void DayOfTheWeekDetectorIfVersionTestTwo() {
        DayOfTheWeekDetectorIfVersion test = new DayOfTheWeekDetectorIfVersion();
        check(test.detectDayName(7), "Sunday", "DayOfTheWeekDetectorIfVersionTestTwo");
    }

    public void check(String actualResult, String expectedResult, String testName) {
        if(actualResult.equals(expectedResult)) {
            System.out.println(testName + " OK!");
        } else {
            System.out.println(testName + " failed!");
        }
    }

}
