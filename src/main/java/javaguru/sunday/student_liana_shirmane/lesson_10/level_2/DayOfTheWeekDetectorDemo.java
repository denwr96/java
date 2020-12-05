package main.java.javaguru.sunday.student_liana_shirmane.lesson_10.level_2;
//task5

import java.util.Scanner;

public class DayOfTheWeekDetectorDemo {

    DayOfTheWeekDetector dayOfTheWeekDetector;

    DayOfTheWeekDetectorDemo (DayOfTheWeekDetector dayOfTheWeekDetector) {
        this.dayOfTheWeekDetector = dayOfTheWeekDetector;
    }

    void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number");
        int number = scanner.nextInt();
        String detectDayName = dayOfTheWeekDetector.detectDayName(number);
        System.out.println(detectDayName);
    }

    public static void main(String[] args) {
        DayOfTheWeekDetector dayOfTheWeekDetectorSwitch = new DayOfTheWeekDetectorSwitchVersion();
        DayOfTheWeekDetector dayOfTheWeekDetectorIf = new DayOfTheWeekDetectorIfVersion();
        DayOfTheWeekDetector dayOfTheWeekDetectorArray = new DayOfTheWeekDetectorArrayVersion();
        DayOfTheWeekDetectorDemo dayOfTheWeekDetectorDemoSwitch = new DayOfTheWeekDetectorDemo(dayOfTheWeekDetectorSwitch);
        DayOfTheWeekDetectorDemo dayOfTheWeekDetectorDemoIf = new DayOfTheWeekDetectorDemo(dayOfTheWeekDetectorIf);
        DayOfTheWeekDetectorDemo dayOfTheWeekDetectorDemoArray = new DayOfTheWeekDetectorDemo(dayOfTheWeekDetectorArray);
        dayOfTheWeekDetectorDemoSwitch.run();
        dayOfTheWeekDetectorDemoIf.run();
        dayOfTheWeekDetectorDemoArray.run();
    }
}


