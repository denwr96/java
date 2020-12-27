package javaguru.sunday.student_kristina_sutugina.lesson_10.level_2.task_4;

class DayOfTheWeekDetectorTest {
    public static void main(String[] args) {
        DayOfTheWeekDetectorTest dayOfTheWeekDetectorTest = new DayOfTheWeekDetectorTest();
        dayOfTheWeekDetectorTest.DayOfTheWeekDetectorIfVersion();
        dayOfTheWeekDetectorTest.DayOfTheWeekDetectorSwitchVersion();
        dayOfTheWeekDetectorTest.DayOfTheWeekDetectorArrayVersion();

    }

    public void DayOfTheWeekDetectorIfVersion() {
        String expectedResult = "Friday";
        DayOfTheWeekDetectorIfVersion dayOfTheWeekDetectorIfVersion = new DayOfTheWeekDetectorIfVersion();
        String actualResult = dayOfTheWeekDetectorIfVersion.detectDayName(5);
        check(expectedResult, actualResult, "DayOfTheWeekDetectorIfVersion");
    }

    public void DayOfTheWeekDetectorSwitchVersion() {
        String expectedResult = "Friday";
        DayOfTheWeekDetectorSwitchVersion dayOfTheWeekDetectorSwitchVersion = new DayOfTheWeekDetectorSwitchVersion();
        String actualResult = dayOfTheWeekDetectorSwitchVersion.detectDayName(5);
        check(expectedResult, actualResult, "DayOfTheWeekDetectorSwitchVersion");
    }

    public void DayOfTheWeekDetectorArrayVersion() {
        String expectedResult = "Sunday";
        DayOfTheWeekDetectorArrayVersion dayOfTheWeekDetectorArrayVersion = new DayOfTheWeekDetectorArrayVersion();
        String actualResult = dayOfTheWeekDetectorArrayVersion.detectDayName(7);
        check(expectedResult, actualResult, "DayOfTheWeekDetectorArrayVersion");
    }

    public void check(String expectedResult, String actualResult, String testName) {
        if (expectedResult.equals(actualResult)) {
            System.out.println(testName + " passed.");
        } else {
            System.out.println(testName + " failed.");
        }
    }
}
