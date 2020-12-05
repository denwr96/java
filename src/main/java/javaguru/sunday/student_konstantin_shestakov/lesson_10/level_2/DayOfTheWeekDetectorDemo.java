package main.java.javaguru.sunday.student_konstantin_shestakov.lesson_10.level_2;

// Task 5

class DayOfTheWeekDetectorDemo {

    DayOfTheWeekDetector dayOfTheWeekDetector;

    DayOfTheWeekDetectorDemo (DayOfTheWeekDetector dayOfTheWeekDetector) {
        this.dayOfTheWeekDetector = dayOfTheWeekDetector;
    }

    void run() {
        DayOfTheWeekDetectorDemo dayOfTheWeekDetectorDemo = new DayOfTheWeekDetectorDemo(dayOfTheWeekDetector);
        String detectDayName = dayOfTheWeekDetector.detectDayName(1);
        String detectDayNameSwitch = dayOfTheWeekDetector.detectDayNameSwitch(2);
        String detectDayNameArray = dayOfTheWeekDetector.detectDayNameArray(3);
    }

    public static void main(String[] args) {
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetectorImpl();
        DayOfTheWeekDetectorDemo dayOfTheWeekDetectorDemo = new DayOfTheWeekDetectorDemo(dayOfTheWeekDetector);
        dayOfTheWeekDetectorDemo.run();
    }
}
