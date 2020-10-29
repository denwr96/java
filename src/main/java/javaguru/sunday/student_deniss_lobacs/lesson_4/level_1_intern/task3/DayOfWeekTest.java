package main.java.javaguru.sunday.student_deniss_lobacs.lesson_4.level_1_intern.task3;


import main.java.javaguru.sunday.teacher.annotations.CodeReview;
import main.java.javaguru.sunday.teacher.annotations.CodeReviewComment;

@CodeReview(approved = true)
@CodeReviewComment(comment = "Весь QuickMath нужно было уместить в одном классе")
public class DayOfWeekTest {

    public static void main(String[] args) {
        DayOfWeekTest dayOfWeekTest = new DayOfWeekTest();
        dayOfWeekTest.test1();
        dayOfWeekTest.test2();
        dayOfWeekTest.test3();
    }

    public void test1() {
        DayOfWeek victim = new DayOfWeek();
        int numberOne = 1;
        String expectedResult = "Monday";
        String actualResult = victim.function(numberOne);
        check(expectedResult, actualResult, "Test1");
    }

    public void test2() {
        DayOfWeek victim = new DayOfWeek();
        int numberOne = 2;
        String expectedResult = "Tuesday";
        String actualResult = victim.function(numberOne);
        check(expectedResult, actualResult, "Test2");
    }

    public void test3() {
        DayOfWeek victim = new DayOfWeek();
        int numberOne = 8;
        String expectedResult = "Error";
        String actualResult = victim.function(numberOne);
        check(expectedResult, actualResult, "Test3");
    }


    public void check(String expectedResult, String actualResult, String testName) {
        if (expectedResult == actualResult) {
            System.out.println(testName + "  has passed!");
        } else {
            System.out.println(testName + " failed!");
            System.out.println("Expected: " + expectedResult + " but Actual: " + actualResult);
        }
    }
}


