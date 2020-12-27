package main.java.javaguru.sunday.student_deniss_lobacs.lesson_10.homework.level_2_intern;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Scanner;
@CodeReview(approved = true)
public class DayOfTheWeekDetectorDemo {

    private DayOfTheWeekDetector dayOfTheWeekDetector;

    public DayOfTheWeekDetectorDemo(DayOfTheWeekDetector dayOfTheWeekDetector) {
        this.dayOfTheWeekDetector = dayOfTheWeekDetector;
    }

    public void run() {
        int number;
        Scanner scanner = new Scanner(System.in);  
        do {
            System.out.print("Input number between 1 and 7 : ");
            number = scanner.nextInt();
            System.out.println(dayOfTheWeekDetector.detectDayName(number));
        } while ((number < 1 || number > 7));
    }

    public static void main(String[] args) {
        DayOfTheWeekDetectorIfVersion dayOfTheWeekDetector = new DayOfTheWeekDetectorIfVersion();
        DayOfTheWeekDetectorDemo dayOfTheWeekDetectorDemo = new DayOfTheWeekDetectorDemo(dayOfTheWeekDetector);
        dayOfTheWeekDetectorDemo.run();
    }
}
