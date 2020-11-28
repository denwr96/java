package main.java.javaguru.sunday.student_glebs_surtajevs.lesson_6.level_1.task_2;

import main.java.javaguru.sunday.student_glebs_surtajevs.lesson_6.level_1.task_2.DayOfTheWeekDetector;
import main.java.javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class DayOfTheWeekDetectorTest {

    public static void main(String[] args) {
        DayOfTheWeekDetectorTest dayOfTheWeekDetectorTest = new DayOfTheWeekDetectorTest();
        dayOfTheWeekDetectorTest.detectTestMonday();
        dayOfTheWeekDetectorTest.detectTestTuesday();
        dayOfTheWeekDetectorTest.detectTestWednesday();
        dayOfTheWeekDetectorTest.detectTestThursday();
        dayOfTheWeekDetectorTest.detectTestFriday();
        dayOfTheWeekDetectorTest.detectTestSaturday();
        dayOfTheWeekDetectorTest.detectTestSunday();
    }

    public void detectTestMonday() {
        int number = 1;
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();
        String result = dayOfTheWeekDetector.detect(number);
        if (result.equals("Monday")) {
            System.out.println("Monday test = OK");
        } else {
            System.out.println("Monday test = FAIL");
        }
    }
    public void detectTestTuesday() {
        int number = 2;
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();
        String result = dayOfTheWeekDetector.detect(number);
        if (result.equals("Tuesday")) {
            System.out.println("Tuesday test = OK");
        } else {
            System.out.println("Tuesday test = FAIL");
        }
    }
    public void detectTestWednesday() {
        int number = 3;
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();
        String result = dayOfTheWeekDetector.detect(number);
        if (result.equals("Wednesday")) {
            System.out.println("Wednesday test = OK");
        } else {
            System.out.println("Wednesday test = FAIL");
        }
    }
    public void detectTestThursday() {
        int number = 4;
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();
        String result = dayOfTheWeekDetector.detect(number);
        if (result.equals("Thursday")) {
            System.out.println("Thursday test = OK");
        } else {
            System.out.println("Thursday test = FAIL");
        }
    }
    public void detectTestFriday() {
        int number = 5;
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();
        String result = dayOfTheWeekDetector.detect(number);
        if (result.equals("Friday")) {
            System.out.println("Friday test = OK");
        } else {
            System.out.println("Friday test = FAIL");
        }
    }
    public void detectTestSaturday() {
        int number = 6;
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();
        String result = dayOfTheWeekDetector.detect(number);
        if (result.equals("Saturday")) {
            System.out.println("Saturday test = OK");
        } else {
            System.out.println("Saturday test = FAIL");
        }
    }
    public void detectTestSunday() {
        int number = 7;
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();
        String result = dayOfTheWeekDetector.detect(number);
        if (result.equals("Sunday")) {
            System.out.println("Sunday test = OK");
        } else {
            System.out.println("Sunday test = FAIL");
        }
    }
}
