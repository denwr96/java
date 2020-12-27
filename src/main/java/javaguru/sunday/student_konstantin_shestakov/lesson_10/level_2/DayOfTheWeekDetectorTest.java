package javaguru.sunday.student_konstantin_shestakov.lesson_10.level_2;

import javaguru.sunday.teacher.annotations.CodeReview;

// Task 4
@CodeReview(approved = true)
class DayOfTheWeekDetectorTest {

    public static void main(String[] args) {
        DayOfTheWeekDetectorTest dayOfTheWeekDetectorTest = new DayOfTheWeekDetectorTest();
        dayOfTheWeekDetectorTest.dayOfTheWeekDetectorTest();
    }

    void dayOfTheWeekDetectorTest() {
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetectorImpl();
        checkResults(dayOfTheWeekDetector.detectDayName(1) == "Monday", "Day of the week detector IF test");
        checkResults(dayOfTheWeekDetector.detectDayNameSwitch(2) == "Tuesday", "Day of the week detector SWITCH test");
        checkResults(dayOfTheWeekDetector.detectDayNameArray(3) == "Wednesday", "Day of the week detector ARRAY test");
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
