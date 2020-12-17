package main.java.javaguru.sunday.student_natalia_kochkina.lesson_10.level_2;

import java.util.Scanner;

//Task_5

public class DayOfTheWeekDetectorDemo {

    DayOfTheWeekDetector dayOfTheWeekDetector;

    public DayOfTheWeekDetectorDemo(DayOfTheWeekDetector dayOfTheWeekDetector) {
        this.dayOfTheWeekDetector = dayOfTheWeekDetector;
    }

    void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("number of day:");
        int number = scanner.nextInt();
        String dayOfWeek = dayOfTheWeekDetector.detectDayName(number);
        System.out.println(dayOfWeek);
    }

    public static void main(String[] args) {
        DayOfTheWeekDetectorDemo dayOfTheWeekDetectorDemo = new DayOfTheWeekDetectorDemo(new DayOfTheWeekDetectorIfVersion());
        dayOfTheWeekDetectorDemo.run();

        DayOfTheWeekDetectorDemo dayOfTheWeekDetectorDemo1 = new DayOfTheWeekDetectorDemo(new DayOfWeekDetectorArray());
        dayOfTheWeekDetectorDemo1.run();

        DayOfTheWeekDetectorDemo dayOfTheWeekDetectorDemo2 = new DayOfTheWeekDetectorDemo(new DayOfTheWeekDetectorSwitchVersion());
        dayOfTheWeekDetectorDemo2.run();
    }

}
