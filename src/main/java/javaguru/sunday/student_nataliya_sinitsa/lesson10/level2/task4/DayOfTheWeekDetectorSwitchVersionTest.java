package main.java.javaguru.sunday.student_nataliya_sinitsa.lesson10.level2.task4;

class DayOfTheWeekDetectorSwitchVersionTest {

    public static void main(String[] args) {
        DayOfTheWeekDetectorSwitchVersionTest test = new DayOfTheWeekDetectorSwitchVersionTest();
        test.shouldReturnUnknownInput1();
        test.shouldReturnUnknownInput2();
        test.shouldReturnMonday();
        test.shouldReturnTuesday();
        test.shouldReturnWednesday();
        test.shouldReturnThursday();
        test.shouldReturnFriday();
        test.shouldReturnSaturday();
        test.shouldReturnSunday();
    }

    public void shouldReturnUnknownInput1() {
        DayOfTheWeekDetectorSwitchVersion victim = new DayOfTheWeekDetectorSwitchVersion();
        String actualResult = victim.detectDayName(0);
        check(actualResult.equals("Please input a valid number between 1 and 7"), "shouldReturnUnknownInput1");
    }

    public void shouldReturnUnknownInput2() {
        DayOfTheWeekDetectorSwitchVersion victim = new DayOfTheWeekDetectorSwitchVersion();
        String actualResult = victim.detectDayName(8);
        check(actualResult.equals("Please input a valid number between 1 and 7"), "shouldReturnUnknownInput2");
    }

    public void shouldReturnMonday() {
        DayOfTheWeekDetectorSwitchVersion victim = new DayOfTheWeekDetectorSwitchVersion();
        String actualResult = victim.detectDayName(1);
        check(actualResult.equals("Monday"), "shouldReturnMonday");
    }

    public void shouldReturnTuesday() {
        DayOfTheWeekDetectorSwitchVersion victim = new DayOfTheWeekDetectorSwitchVersion();
        String actualResult = victim.detectDayName(2);
        check(actualResult.equals("Tuesday"), "shouldReturnTuesday");
    }

    public void shouldReturnWednesday() {
        DayOfTheWeekDetectorSwitchVersion victim = new DayOfTheWeekDetectorSwitchVersion();
        String actualResult = victim.detectDayName(3);
        check(actualResult.equals("Wednesday"), "shouldReturnWednesday");
    }

    public void shouldReturnThursday() {
        DayOfTheWeekDetectorSwitchVersion victim = new DayOfTheWeekDetectorSwitchVersion();
        String actualResult = victim.detectDayName(4);
        check(actualResult.equals("Thursday"), "shouldReturnThursday");
    }

    public void shouldReturnFriday() {
        DayOfTheWeekDetectorSwitchVersion victim = new DayOfTheWeekDetectorSwitchVersion();
        String actualResult = victim.detectDayName(5);
        check(actualResult.equals("Friday"), "shouldReturnFriday");
    }

    public void shouldReturnSaturday() {
        DayOfTheWeekDetectorSwitchVersion victim = new DayOfTheWeekDetectorSwitchVersion();
        String actualResult = victim.detectDayName(6);
        check(actualResult.equals("Saturday"), "shouldReturnSaturday");
    }

    public void shouldReturnSunday() {
        DayOfTheWeekDetectorSwitchVersion victim = new DayOfTheWeekDetectorSwitchVersion();
        String actualResult = victim.detectDayName(7);
        check(actualResult.equals("Sunday"), "shouldReturnSunday");
    }

    public void check(boolean actualResult, String testName) {
        if (actualResult) {
            System.out.println(testName + " has passed!");
        } else {
            System.out.println(testName + " failed!");
        }
    }

}
