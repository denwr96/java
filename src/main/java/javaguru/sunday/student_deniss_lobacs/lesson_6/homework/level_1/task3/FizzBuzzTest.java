package javaguru.sunday.student_deniss_lobacs.lesson_6.homework.level_1.task3;

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class FizzBuzzTest {

    public static void main(String[] args) {
        FizzBuzzTest fizzBuzzTest = new FizzBuzzTest();
        fizzBuzzTest.isFizz();
        fizzBuzzTest.isBuzz();
        fizzBuzzTest.isFizzBuzz();
        fizzBuzzTest.isFail();
    }

    public void isFizz() {
        String expectedResult = "Fizz";
        String actualResult = FizzBuzz.detect(3);
        check((expectedResult.equals(actualResult)), "Test for Fizz - ");
    }

    public void isBuzz() {
        String expectedResult = "Buzz";
        String actualResult = FizzBuzz.detect(5);
        check((expectedResult.equals(actualResult)), "Test for Buzz - ");
    }

    public void isFizzBuzz() {
        String expectedResult = "FizzBuzz";
        String actualResult = FizzBuzz.detect(15);
        check((expectedResult.equals(actualResult)), "Test for FizzBuzz - ");
    }

    public void isFail() {
        String expectedResult = "8";
        String actualResult = FizzBuzz.detect(8);
        check((expectedResult.equals(actualResult)), "Test for invalid value - ");
    }

    public void check(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " OK");
        } else {
            System.out.println(testName + " FAIL");
        }
    }
}
