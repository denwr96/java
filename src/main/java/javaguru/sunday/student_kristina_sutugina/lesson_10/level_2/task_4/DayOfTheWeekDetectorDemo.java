package javaguru.sunday.student_kristina_sutugina.lesson_10.level_2.task_4;

import java.util.Scanner;

//task_5
class DayOfTheWeekDetectorDemo {
    DayOfTheWeekDetector dayOfTheWeekDetector;

    public DayOfTheWeekDetectorDemo(DayOfTheWeekDetector dayOfTheWeekDetector) {
        this.dayOfTheWeekDetector = dayOfTheWeekDetector;
    }

    void run() {
        System.out.println("Enter the number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        String detectDay = dayOfTheWeekDetector.detectDayName(number);
        System.out.println(detectDay);
    }

    public static void main(String[] args) {
        DayOfTheWeekDetectorArrayVersion dayOfTheWeekDetectorArrayVersion = new DayOfTheWeekDetectorArrayVersion();
        DayOfTheWeekDetectorDemo dayOfTheWeekDetectorDemo = new DayOfTheWeekDetectorDemo(dayOfTheWeekDetectorArrayVersion);
        dayOfTheWeekDetectorDemo.run();

        DayOfTheWeekDetectorIfVersion dayOfTheWeekDetectorIfVersion = new DayOfTheWeekDetectorIfVersion();
        DayOfTheWeekDetectorDemo dayOfTheWeekIfVersion = new DayOfTheWeekDetectorDemo(dayOfTheWeekDetectorIfVersion);
        dayOfTheWeekIfVersion.run();

        DayOfTheWeekDetectorSwitchVersion dayOfTheWeekDetectorSwitchVersion = new DayOfTheWeekDetectorSwitchVersion();
        DayOfTheWeekDetectorDemo dayOfTheWeekSwitchVersion = new DayOfTheWeekDetectorDemo(dayOfTheWeekDetectorSwitchVersion);
        dayOfTheWeekSwitchVersion.run();
    }
}
