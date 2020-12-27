package main.java.javaguru.sunday.student_artjom_proshkin.lesson_10.level_2_intern;

//Task_5
import java.util.Scanner;

class DayOfTheWeekDetectorDemo {

    DayOfTheWeekDetector weekdayDetector;

    DayOfTheWeekDetectorDemo(DayOfTheWeekDetector weekdayDetector) {
        this.weekdayDetector = weekdayDetector;
    }

    void run (){
        System.out.println("Please input a number between 1 and 7");
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();
        System.out.println(weekdayDetector.detectDayName(inputNumber));

    }

    public static void main(String[] args) {

        DayOfTheWeekDetectorDemo detectorIfDemo = new DayOfTheWeekDetectorDemo(new DayOfTheWeekDetectorIfVersion());
        detectorIfDemo.run();

        DayOfTheWeekDetectorDemo detectorSwitchDemo = new DayOfTheWeekDetectorDemo(new DayOfTheWeekDetectorSwitchVersion());
        detectorSwitchDemo.run();

        DayOfTheWeekDetectorDemo detectorArrayDemo = new DayOfTheWeekDetectorDemo(new DayOfTheWeekDetectorArrayVersion());
        detectorArrayDemo.run();

    }


}
