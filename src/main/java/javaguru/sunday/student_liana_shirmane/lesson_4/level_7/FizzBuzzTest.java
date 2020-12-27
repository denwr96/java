package javaguru.sunday.student_liana_shirmane.lesson_4.level_7;

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class FizzBuzzTest {
    public static void main(String[] args) {
        FizzBuzzTest fizzBuzzTest = new FizzBuzzTest();
        fizzBuzzTest.test1();
        fizzBuzzTest.test2();
        fizzBuzzTest.test3();
        fizzBuzzTest.test4();
    }
    public void test1(){
        int number = 3;
        String expectedResult = "Fizz";
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actualResult = fizzBuzz.detect(number);
        check(expectedResult, actualResult, "Fizz test");
    }

    public void test2(){
        int number = 25;
        String expectedResult = "Buzz";
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actualResult = fizzBuzz.detect(number);
        check(expectedResult, actualResult, "Buzz test");
    }
    public void test3(){
        int number = 30;
        String expectedResult = "FizzBuzz";
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actualResult = fizzBuzz.detect(number);
        check(expectedResult, actualResult, "FizzBuzz test");
    }

    public void test4(){
        int number = 4;
        String expectedResult = "4";
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actualResult = fizzBuzz.detect(number);
        check(expectedResult, actualResult, "Else test");
    }
    public void check(String expectedResult, String actualResult, String testName) {
        if (expectedResult.equals(actualResult)) {
            System.out.println(testName + " has passed!");
        } else {
            System.out.println(testName + " failed!");
            System.out.println("Expected: " + expectedResult + " but Actual: " + actualResult);
        }
    }
}
