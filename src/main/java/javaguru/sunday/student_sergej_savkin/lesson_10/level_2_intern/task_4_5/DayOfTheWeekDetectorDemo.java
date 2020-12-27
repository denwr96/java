package main.java.javaguru.sunday.student_sergej_savkin.lesson_10.level_2_intern.task_4_5;

//task5

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Scanner;
@CodeReview(approved = true)
class DayOfTheWeekDetectorDemo {

    DayOfTheWeekDetector dayOfTheWeekDetector;

    DayOfTheWeekDetectorDemo(DayOfTheWeekDetector dayOfTheWeekDetector){
        this.dayOfTheWeekDetector = dayOfTheWeekDetector;
    }

    void run(){
        System.out.println("Please enter day number from 1 to 7");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println(dayOfTheWeekDetector.detectDayName(number));

    }

    public static void main(String[] args) {
        DayOfTheWeekDetectorDemo dayOfTheWeekDetectorDemo = new DayOfTheWeekDetectorDemo(new DayOfTheWeekDetectorIfVersion());
        dayOfTheWeekDetectorDemo.run();

        DayOfTheWeekDetectorDemo dayOfTheWeekDetectorDemoTwo = new DayOfTheWeekDetectorDemo(new DayOfTheWeekDetectorSwitchVersion());
        dayOfTheWeekDetectorDemoTwo.run();

        DayOfTheWeekDetectorDemo dayOfTheWeekDetectorDemoThree = new DayOfTheWeekDetectorDemo(new DayOfTheWeekDetectorArrayVersion());
        dayOfTheWeekDetectorDemoThree.run();

    }

}
