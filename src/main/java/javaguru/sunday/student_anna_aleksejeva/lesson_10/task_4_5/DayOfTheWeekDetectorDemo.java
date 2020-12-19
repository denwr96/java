package main.java.javaguru.sunday.student_anna_aleksejeva.lesson_10.task_4_5;

import java.util.Scanner;
public class DayOfTheWeekDetectorDemo {

    DayOfTheWeekDetector example;

    public DayOfTheWeekDetectorDemo(DayOfTheWeekDetector example) {
        this.example = example;
    }
    void run() {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Insert a number ");
        int number = myScanner.nextInt();
        System.out.println(example.detectDayName(number));
    }
    public static void main(String[] args) {
        DayOfTheWeekDetector first = new DayOfTheWeekDetectorSwitch();
        DayOfTheWeekDetectorDemo myFirstDemo = new DayOfTheWeekDetectorDemo(first);
        myFirstDemo.run();

        DayOfTheWeekDetector second = new DayOfTheWeekDetectorIfVersion();
        DayOfTheWeekDetectorDemo mySecondDemo = new DayOfTheWeekDetectorDemo(second);
        mySecondDemo.run();

        DayOfTheWeekDetector third = new DayOfTheWeekDetectorIfVersion();
        DayOfTheWeekDetectorDemo myThirdDemo = new DayOfTheWeekDetectorDemo(third);
        mySecondDemo.run();
    }
}