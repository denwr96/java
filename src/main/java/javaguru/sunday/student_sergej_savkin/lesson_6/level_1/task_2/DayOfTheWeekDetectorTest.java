package javaguru.sunday.student_sergej_savkin.lesson_6.level_1.task_2;

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class DayOfTheWeekDetectorTest {

    public static void main(String[] args) {

        DayOfTheWeekDetectorTest dayOfTheWeekDetectorTest = new DayOfTheWeekDetectorTest();
        dayOfTheWeekDetectorTest.shouldReturnMonday(1);
        dayOfTheWeekDetectorTest.shouldReturnTuesday(2);
        dayOfTheWeekDetectorTest.shouldReturnWednesday(3);
        dayOfTheWeekDetectorTest.shouldReturnThursday(4);
        dayOfTheWeekDetectorTest.shouldReturnFriday(5);
        dayOfTheWeekDetectorTest.shouldReturnSaturday(6);
        dayOfTheWeekDetectorTest.shouldReturnSunday(7);
        dayOfTheWeekDetectorTest.shouldReturnError(0);

    }

    public void shouldReturnMonday(int firstNumber){
        DayOfTheWeekDetector test = new DayOfTheWeekDetector();
        String result = test.detectDayName(firstNumber);
        check(result.equals("Monday"), "shouldReturnMonday");
    }

    public void shouldReturnTuesday(int firstNumber){
        DayOfTheWeekDetector test = new DayOfTheWeekDetector();
        String result = test.detectDayName(firstNumber);
        check(result.equals("Tuesday"), "shouldReturnTuesday");
    }

    public void shouldReturnWednesday(int firstNumber){
        DayOfTheWeekDetector test = new DayOfTheWeekDetector();
        String result = test.detectDayName(firstNumber);
        check(result.equals("Wednesday"), "shouldReturnWednesday");
    }

    public void shouldReturnThursday(int firstNumber){
        DayOfTheWeekDetector test = new DayOfTheWeekDetector();
        String result = test.detectDayName(firstNumber);
        check(result.equals("Thursday"), "shouldReturnThursday");
    }

    public void shouldReturnFriday(int firstNumber){
        DayOfTheWeekDetector test = new DayOfTheWeekDetector();
        String result = test.detectDayName(firstNumber);
        check(result.equals("Friday"), "shouldReturnFriday");
    }

    public void shouldReturnSaturday(int firstNumber){
        DayOfTheWeekDetector test = new DayOfTheWeekDetector();
        String result = test.detectDayName(firstNumber);
        check(result.equals("Saturday"), "shouldReturnSaturday");
    }

    public void shouldReturnSunday(int firstNumber){
        DayOfTheWeekDetector test = new DayOfTheWeekDetector();
        String result = test.detectDayName(firstNumber);
        check(result.equals("Sunday"), "shouldReturnSunday");
    }

    public void shouldReturnError(int firstNumber){
        DayOfTheWeekDetector test = new DayOfTheWeekDetector();
        String result = test.detectDayName(firstNumber);
        check(result.equals("Please input a valid number between 1 and 7"), "shouldReturnError");
    }

    public void check(boolean actualResult, String testName){
        if(actualResult){
            System.out.println(testName + " OK!");
        } else {
            System.out.println(testName + " failed!");
        }
    }

}
