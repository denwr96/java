package main.java.javaguru.sunday.student_konstantin_shestakov.lesson_6.level_1;

// Task 2

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class DayOfTheWeekDetectorTest {

    public static void main(String[] args) {
        DayOfTheWeekDetectorTest test = new DayOfTheWeekDetectorTest();
        test.detectDayNameTest();
    }

    String[] expectedResultArray = {"1", "2", "3", "4", "5", "6", "7", "8"}; // "8" - test for incorrect input reaction

    public void detectDayNameTest() {
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();
        String[] resultArray = {dayOfTheWeekDetector.detectDayName(1), dayOfTheWeekDetector.detectDayName(2), dayOfTheWeekDetector.detectDayName(3), dayOfTheWeekDetector.detectDayName(4), dayOfTheWeekDetector.detectDayName(5), dayOfTheWeekDetector.detectDayName(6), dayOfTheWeekDetector.detectDayName(7), dayOfTheWeekDetector.detectDayName(8)};

        for (int i = 0; i < resultArray.length ; i++) {
            if (resultArray[i].equals(expectedResultArray[i])) {
                System.out.println((i + 1) + " test = OK");
            } else {
                System.out.println((i + 1) + " test = FAIL");
            }
        }
    }

}
