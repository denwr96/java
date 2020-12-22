package main.java.javaguru.sunday.student_natalia_kochkina.lesson_10.level_2;

//Task_4

public class DayOfWeekDetectorTest {
    public static void main(String[] args) {
        DayOfWeekDetectorTest dayOfWeekDetectorTest = new DayOfWeekDetectorTest();
        dayOfWeekDetectorTest.ifTest();
        dayOfWeekDetectorTest.switchTest();
        dayOfWeekDetectorTest.arrayTest();
    }

    public void ifTest() {
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetectorIfVersion();
        String dayOfWeek = dayOfTheWeekDetector.detectDayName(2);
        String expectedResult = "Tuesday";
        if (dayOfWeek.equals(expectedResult)) {
            System.out.println("IfTest OK");
        } else {
            System.out.println("IfTest Failed");
        }
    }

    public void switchTest() {
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetectorSwitchVersion();
        String dayOfWeek = dayOfTheWeekDetector.detectDayName(3);
        String expectedResult = "Wednesday";
        if (dayOfWeek.equals(expectedResult)) {
            System.out.println("SwitchTest OK");
        } else {
            System.out.println("SwitchTest Failed");
        }
    }

    public void arrayTest() {
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfWeekDetectorArray();
        String dayOfWeek = dayOfTheWeekDetector.detectDayName(5);
        String expectedResult = "Friday";
        if (dayOfWeek.equals(expectedResult)) {
            System.out.println("ArrayTest OK");
        } else {
            System.out.println("ArrayTest Failed");
        }
    }
}
