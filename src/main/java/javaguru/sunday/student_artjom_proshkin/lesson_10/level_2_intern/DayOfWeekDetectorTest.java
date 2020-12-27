package javaguru.sunday.student_artjom_proshkin.lesson_10.level_2_intern;

//Task_4

class DayOfWeekDetectorTest {

    DayOfTheWeekDetector victimIf = new DayOfTheWeekDetectorArrayVersion();
    DayOfTheWeekDetector victimSwitch = new DayOfTheWeekDetectorArrayVersion();
    DayOfTheWeekDetector victimArray = new DayOfTheWeekDetectorArrayVersion();

    public static void main(String[] args) {
        DayOfWeekDetectorTest test = new DayOfWeekDetectorTest();
        test.mondayDetectorTest();
        System.out.println();
        test.tuesdayDetectorTest();
        System.out.println();
        test.wednesdayDetectorTest();
        System.out.println();
        test.sundayDetectorTest();
        System.out.println();
        test.defaultDayDetectorTest();

    }

    void mondayDetectorTest() {
        checkResult(victimIf.detectDayName(1).equals("Monday"), "mondayDetector If test");
        checkResult(victimSwitch.detectDayName(1).equals("Monday"), "mondayDetector Switch test");
        checkResult(victimArray.detectDayName(1).equals("Monday"), "mondayDetector Array test");
    }

    void tuesdayDetectorTest() {
        checkResult(victimIf.detectDayName(2).equals("Tuesday"), "tuesdayDetector If test");
        checkResult(victimSwitch.detectDayName(2).equals("Tuesday"), "tuesdayDetector Switch test");
        checkResult(victimArray.detectDayName(2).equals("Tuesday"), "tuesdayDetector Array test");
    }

    void wednesdayDetectorTest() {
        checkResult(victimIf.detectDayName(3).equals("Wednesday"), "wednesdayDetector If test");
        checkResult(victimSwitch.detectDayName(3).equals("Wednesday"), "wednesdayDetector Switch test");
        checkResult(victimArray.detectDayName(3).equals("Wednesday"), "wednesdayDetector Array test");
    }

    void sundayDetectorTest() {
        checkResult(victimIf.detectDayName(7).equals("Sunday"), "sundayDetector If test");
        checkResult(victimSwitch.detectDayName(7).equals("Sunday"), "sundayDetector Switch test");
        checkResult(victimArray.detectDayName(7).equals("Sunday"), "sundayDetector Array test");
    }
    void defaultDayDetectorTest() {
        checkResult(victimIf.detectDayName(8).equals("Please input a valid number between 1 and 7"), "defaultDayDetector If test");
        checkResult(victimSwitch.detectDayName(9).equals("Please input a valid number between 1 and 7"), "defaultDayDetector Switch test");
        checkResult(victimArray.detectDayName(10).equals("Please input a valid number between 1 and 7"), "defaultDayDetector Array test");
    }

    void checkResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " PASSED !");
        } else {
            System.out.println(testName + " FAILED !");
        }
    }
}
