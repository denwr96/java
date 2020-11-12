package main.java.javaguru.sunday.student_artjom_proshkin.lesson_4.level_7_senior.super_task_1;

class FizzBuzzTest {
    public static void main(String[] args) {
        FizzBuzzTest victim = new FizzBuzzTest();
        victim.fizzBuzzTest();
        victim.fizzTest();
        victim.buzzTest();
        victim.returnNumberTest();

    }

    void fizzBuzzTest() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actualResult = fizzBuzz.detect(30);
        check(actualResult.equals("FizzBuzz"), "fizzBuzzTest");
    }

    void fizzTest() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actualResult = fizzBuzz.detect(27);
        check(actualResult.equals("Fizz"), "fizzTest");
    }

    void buzzTest() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actualResult = fizzBuzz.detect(25);
        check(actualResult.equals("Buzz"), "buzzTest");
    }
    void returnNumberTest() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actualResult = fizzBuzz.detect(31);
        check(actualResult.equals("31"), "returnNumberTest");
    }

    void check(boolean actualResult, String testName) {
        if (actualResult) {
            System.out.println(testName + " PASSED!");
        } else {
            System.out.println(testName + " FAILED!");
        }
    }

}
