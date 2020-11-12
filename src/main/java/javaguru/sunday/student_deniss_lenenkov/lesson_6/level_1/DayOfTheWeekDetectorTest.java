package main.java.javaguru.sunday.student_deniss_lenenkov.lesson_6.level_1;

public class DayOfTheWeekDetectorTest {

    public static void main(String[] args) {

        DayOfTheWeekDetectorTest test = new DayOfTheWeekDetectorTest();

        test.mondayTest();
        test.tuesdayTest();
        test.wednesdayTest();
        test.thursdayTest();
        test.fridayTest();
        test.saturdayTest();
        test.sundayTest();
        test.incorrectNumberTest();

    }

    static void mondayTest(){
        DayOfTheWeekDetector victim = new DayOfTheWeekDetector();
        int numberOfDay = 1;
        String expectedResult = "Monday";
        String actualResult = victim.detectDayName(numberOfDay);
        if (expectedResult.equals(actualResult)){
            System.out.println("mondayTest has passed ");
        }else{
            System.out.println("mondayTest has Failed ");
            System.out.println("Expected result: " + expectedResult + "; Actual result: " + actualResult);
        }
    }

    static void tuesdayTest(){
        DayOfTheWeekDetector victim = new DayOfTheWeekDetector();
        int numberOfDay = 2;
        String expectedResult = "Tuesday";
        String actualResult = victim.detectDayName(numberOfDay);
        if (expectedResult.equals(actualResult)){
            System.out.println("tuesdayTest has passed ");
        }else{
            System.out.println("tuesdayTest has Failed ");
            System.out.println("Expected result: " + expectedResult + "; Actual result: " + actualResult);
        }
    }

    static void wednesdayTest(){
        DayOfTheWeekDetector victim = new DayOfTheWeekDetector();
        int numberOfDay = 3;
        String expectedResult = "Wednesday";
        String actualResult = victim.detectDayName(numberOfDay);
        if (expectedResult.equals(actualResult)){
            System.out.println("wednesdayTest has passed ");
        }else{
            System.out.println("wednesdayTest has Failed ");
            System.out.println("Expected result: " + expectedResult + "; Actual result: " + actualResult);
        }
    }

    static void thursdayTest(){
        DayOfTheWeekDetector victim = new DayOfTheWeekDetector();
        int numberOfDay = 4;
        String expectedResult = "Thursday";
        String actualResult = victim.detectDayName(numberOfDay);
        if (expectedResult.equals(actualResult)){
            System.out.println("thursdayTest has passed ");
        }else{
            System.out.println("thursdayTest has Failed ");
            System.out.println("Expected result: " + expectedResult + "; Actual result: " + actualResult);
        }
    }

    static void fridayTest(){
        DayOfTheWeekDetector victim = new DayOfTheWeekDetector();
        int numberOfDay = 5;
        String expectedResult = "Friday";
        String actualResult = victim.detectDayName(numberOfDay);
        if (expectedResult.equals(actualResult)){
            System.out.println("fridayTest has passed ");
        }else{
            System.out.println("fridayTest has Failed ");
            System.out.println("Expected result: " + expectedResult + "; Actual result: " + actualResult);
        }
    }

    static void saturdayTest(){
        DayOfTheWeekDetector victim = new DayOfTheWeekDetector();
        int numberOfDay = 6;
        String expectedResult = "Saturday";
        String actualResult = victim.detectDayName(numberOfDay);
        if (expectedResult.equals(actualResult)){
            System.out.println("saturdayTest has passed ");
        }else{
            System.out.println("saturdayTest has Failed ");
            System.out.println("Expected result: " + expectedResult + "; Actual result: " + actualResult);
        }
    }

    static void sundayTest(){
        DayOfTheWeekDetector victim = new DayOfTheWeekDetector();
        int numberOfDay = 7;
        String expectedResult = "Sunday";
        String actualResult = victim.detectDayName(numberOfDay);
        if (expectedResult.equals(actualResult)){
            System.out.println("sundayTest has passed ");
        }else{
            System.out.println("sundayTest has Failed ");
            System.out.println("Expected result: " + expectedResult + "; Actual result: " + actualResult);
        }
    }

    static void incorrectNumberTest(){
        DayOfTheWeekDetector victim = new DayOfTheWeekDetector();
        int numberOfDay = 22;
        String expectedResult = "Incorrect number";
        String actualResult = victim.detectDayName(numberOfDay);
        if (expectedResult.equals(actualResult)){
            System.out.println("incorrectNumberTest has passed ");
        }else{
            System.out.println("incorrectNumberTest has Failed ");
            System.out.println("Expected result: " + expectedResult + "; Actual result: " + actualResult);
        }
    }
}
