package javaguru.sunday.student_artjom_proshkin.lesson_6.level_1.task_2;


class DayOfWeekDetectorTest {

    public static void main(String[] args) {
        DayOfWeekDetectorTest victim = new DayOfWeekDetectorTest();
        victim.returnMonday(1);
        victim.returnTuesday(2);
        victim.returnWednesday(3);
        victim.returnThursday(4);
        victim.returnFriday(5);
        victim.returnSaturday(6);
        victim.returnSunday(7);
        victim.returnNullday(10);
    }

    void returnMonday(int number) {
        DayOfTheWeekDetector mondayTest = new DayOfTheWeekDetector();
        String actualResult = mondayTest.detectDayName(number);
        checkDay(actualResult.equals("Monday"), "returnMonday");
    }

    void returnTuesday(int number) {
        DayOfTheWeekDetector tuesdayTest = new DayOfTheWeekDetector();
        String actualResult = tuesdayTest.detectDayName(number);
        checkDay(actualResult.equals("Tuesday"), "returnTuesday");
    }

    void returnWednesday(int number) {
        DayOfTheWeekDetector wednesdayTest = new DayOfTheWeekDetector();
        String actualResult = wednesdayTest.detectDayName(number);
        checkDay(actualResult.equals("Wednesday"), "returnWednesday");
    }

    void returnThursday(int number) {
        DayOfTheWeekDetector thursdayTest = new DayOfTheWeekDetector();
        String actualResult = thursdayTest.detectDayName(number);
        checkDay(actualResult.equals("Thursday"), "returnMThursday");
    }

    void returnFriday(int number) {
        DayOfTheWeekDetector fridayTest = new DayOfTheWeekDetector();
        String actualResult = fridayTest.detectDayName(number);
        checkDay(actualResult.equals("Friday"), "returnFriday");
    }
    void returnSaturday(int number) {
        DayOfTheWeekDetector saturdayTest = new DayOfTheWeekDetector();
        String actualResult = saturdayTest.detectDayName(number);
        checkDay(actualResult.equals("Saturday"), "returnSaturday");
    }
    void returnSunday(int number) {
        DayOfTheWeekDetector sundayTest = new DayOfTheWeekDetector();
        String actualResult = sundayTest.detectDayName(number);
        checkDay(actualResult.equals("Sunday"), "returnSunday");
    }
    void returnNullday(int number) {
        DayOfTheWeekDetector nulldayTest = new DayOfTheWeekDetector();
        String actualResult = nulldayTest.detectDayName(number);
        checkDay(actualResult.equals("Please input a valid number between 1 and 7"), "returnNullday");
    }

    void checkDay(boolean actualResult, String testName) {
        if (actualResult) {
            System.out.println(testName + " PASSED !");
        } else {
            System.out.println(testName + " FAILED !");
        }
    }
}
