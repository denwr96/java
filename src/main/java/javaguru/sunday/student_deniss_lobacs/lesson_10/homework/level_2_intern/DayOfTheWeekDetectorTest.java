package javaguru.sunday.student_deniss_lobacs.lesson_10.homework.level_2_intern;

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class DayOfTheWeekDetectorTest {
    public static void main(String[] args) {
        DayOfTheWeekDetectorTest dayOfTheWeekDetectorTest = new DayOfTheWeekDetectorTest();
        dayOfTheWeekDetectorTest.DayOfTheWeekDetectorIfVersionTest();
        dayOfTheWeekDetectorTest.DayOfTheWeekDetectorSwitchVersionTest();
        dayOfTheWeekDetectorTest.DayOfTheWeekDetectorArrayVersionTest();
    }

    public void DayOfTheWeekDetectorIfVersionTest() {
        DayOfTheWeekDetector obj1 = new DayOfTheWeekDetectorIfVersion();
        checkResults(obj1.detectDayName(5).equals("Friday"), "DayOfTheWeekDetectorIfVersionTest");
    }

    public void DayOfTheWeekDetectorSwitchVersionTest() {
        DayOfTheWeekDetector obj2 = new DayOfTheWeekDetectorIfVersion();
        checkResults(obj2.detectDayName(5).equals("Friday"), "DayOfTheWeekDetectorSwitchVersionTest");
    }

    public void DayOfTheWeekDetectorArrayVersionTest() {
        DayOfTheWeekDetector obj3 = new DayOfTheWeekDetectorArrayVersion();
        checkResults(obj3.detectDayName(5).equals("Friday"), "DayOfTheWeekDetectorArrayVersionTest");
    }

    public boolean checkResults(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK");
            return condition;
        } else {
            System.out.println(testName + " = FAIL");
            return !condition;
        }
    }
}
