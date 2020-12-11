package main.java.javaguru.sunday.student_nataliya_sinitsa.lesson10.level2.task4;

//Task5

import java.util.Scanner;

class DayOfTheWeekDetectorDemo {

    private DayOfTheWeekDetector dayOfTheWeekDetector;

    public DayOfTheWeekDetectorDemo(DayOfTheWeekDetector dayOfTheWeekDetector) {
        this.dayOfTheWeekDetector = dayOfTheWeekDetector;
    }

    public static void main(String[] args) {

        DayOfTheWeekDetector ifVersion = new DayOfTheWeekDetectorIfVersion();
        DayOfTheWeekDetectorDemo ifDemo = new DayOfTheWeekDetectorDemo(ifVersion);
        ifDemo.run();

        DayOfTheWeekDetector switchVersion = new DayOfTheWeekDetectorSwitchVersion();
        DayOfTheWeekDetectorDemo switchDemo = new DayOfTheWeekDetectorDemo(switchVersion);
        switchDemo.run();

        DayOfTheWeekDetector arrayVersion = new DayOfTheWeekDetectorArrayVersion();
        DayOfTheWeekDetectorDemo arrayDemo = new DayOfTheWeekDetectorDemo(arrayVersion);
        arrayDemo.run();
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter a number from 1 to 7");
        int number = scanner.nextInt();
        System.out.println("Result: "+ dayOfTheWeekDetector.detectDayName(number));
    }


}
