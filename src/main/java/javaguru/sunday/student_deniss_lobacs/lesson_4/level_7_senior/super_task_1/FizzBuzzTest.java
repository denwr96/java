package main.java.javaguru.sunday.student_deniss_lobacs.lesson_4.level_7_senior.super_task_1;

public class FizzBuzzTest {

    private FizzBuzz victim = new FizzBuzz();

    public static void main(String[] args) {
        FizzBuzzTest fizzBuzzTest = new FizzBuzzTest();
        fizzBuzzTest.test1();
        fizzBuzzTest.test2();
        fizzBuzzTest.test3();
        fizzBuzzTest.test4();
        fizzBuzzTest.test5();
    }


    public void test1() {
        FizzBuzz victim = new FizzBuzz();

        int numberOne = 3;
        String expectedResult = "Fizz";

        String actualResult = victim.detect(numberOne);

        check(expectedResult, actualResult, "Test1");
    }

    public void test2() {
        int numberOne = 5;
        String expectedResult = "Buzz";
        String actualResult = victim.detect(numberOne);
        check(expectedResult, actualResult, "Test2");
    }

    public void test3() {
        int numberOne = 15;
        String expectedResult = "FizzBuzz";
        String actualResult = victim.detect(numberOne);
        check(expectedResult, actualResult, "Test3");
    }

    public void test4() {
        int numberOne = 8;
        String number = "8";
        String expectedResult = number;
        String actualResult = victim.detect(numberOne);
        check(expectedResult, actualResult, "Test4");
    }

    public void test5() {
        int numberOne = 3;
        String number = "FizzBuzz";
        String expectedResult = number;
        String actualResult = victim.detect(numberOne);
        check(expectedResult, actualResult, "Test5");
    }

    public void check(String expectedResult, String actualResult, String testName) {
        if (expectedResult.equals(actualResult)) {
            System.out.println(testName + " OK");
        } else {
            System.out.println(testName + " FAIL");
            System.out.println("Expected: " + expectedResult + " but Actual: " + actualResult);
        }
    }
}
