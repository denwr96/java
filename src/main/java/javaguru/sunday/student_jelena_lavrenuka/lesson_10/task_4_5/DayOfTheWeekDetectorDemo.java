package javaguru.sunday.student_jelena_lavrenuka.lesson_10.task_4_5;

import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
class DayOfTheWeekDetectorDemo {

    DayOfTheWeekDetector instance;

    public DayOfTheWeekDetectorDemo(DayOfTheWeekDetector instance) {
        this.instance = instance;
    }

    void run() {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please insert a number");
        int number = myScanner.nextInt();
        System.out.println(instance.detectDayName(number));
    }

    public static void main(String[] args) {
        DayOfTheWeekDetector firstTry = new DayOfTheWeekDetectorSwitchVersion();
        DayOfTheWeekDetectorDemo myFirstDemo = new DayOfTheWeekDetectorDemo(firstTry);
        myFirstDemo.run();

        DayOfTheWeekDetector secondTry = new DayOfTheWeekDetectorIfVersion();
        DayOfTheWeekDetectorDemo mySecondDemo = new DayOfTheWeekDetectorDemo(secondTry);
        mySecondDemo.run();

        DayOfTheWeekDetector thirdTry = new DayOfTheWeekDetectorIfVersion();
        DayOfTheWeekDetectorDemo myThirdDemo = new DayOfTheWeekDetectorDemo(thirdTry);
        mySecondDemo.run();
    }
}

