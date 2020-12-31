package javaguru.sunday.student_jelena_lavrenuka.lesson_6.task_2;

import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
class DayOfTheWeekDetectorTest {
    public static void main(String[] args) {
        DayOfTheWeekDetectorTest test = new DayOfTheWeekDetectorTest();
        test.testMonday();
        test.testInvalidNumber();
        test.testWithLooping();
    }

    public void testWithLooping(){
        DayOfTheWeekDetector victim = new DayOfTheWeekDetector();
        for (int number = 1; number <= 7; number++) {
            victim.detectDayName(number);
//            switch (number) {
//                case 1 -> System.out.println("Monday");
//                case 2 -> System.out.println("Tuesday");
//                case 3 -> System.out.println("Wednesday");
//                case 4 -> System.out.println("Thursday");
//                case 5 -> System.out.println("Friday");
//                case 6 -> System.out.println("Saturday");
//                case 7 -> System.out.println("Sunday");
//            }
        }
    }
    
    public void testMonday (){
        DayOfTheWeekDetector victim = new DayOfTheWeekDetector();
        String actualResult = victim.detectDayName(1);
        boolean expectedResult = actualResult.equals("Monday");
        testResult(expectedResult,"Test Monday");
    }
    public void testInvalidNumber (){
        DayOfTheWeekDetector victim = new DayOfTheWeekDetector();
        String actualResult = victim.detectDayName(8);
        boolean expectedResult = actualResult.equals("Please input a valid number between 1 and 7");
        testResult(expectedResult,"Test Invalid Number");
    }

    public void testResult(boolean result, String testName) {
        if (result) {
            System.out.println(testName + " is OK");
        } else {
            System.out.println(testName + " is FAILED");
        }
    }
}
