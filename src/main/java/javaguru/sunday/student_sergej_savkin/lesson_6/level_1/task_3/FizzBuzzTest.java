package main.java.javaguru.sunday.student_sergej_savkin.lesson_6.level_1.task_3;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class FizzBuzzTest {

    public static void main(String[] args) {

        FizzBuzzTest fizzBuzzTest = new FizzBuzzTest();
        fizzBuzzTest.canBeDividedByThree(3);
        fizzBuzzTest.canBeDividedByFive(5);
        fizzBuzzTest.canBeDividedByFiveAndThree(15);
        fizzBuzzTest.shouldReturnNumber(4);
    }

    public void shouldReturnNumber(int initialNumber){
        FizzBuzz test = new FizzBuzz();
        String result = test.detect(initialNumber);
        check(result.equals("4"), "shouldReturnNumber");
    }

    public void canBeDividedByFiveAndThree(int initialNumber){
        FizzBuzz test = new FizzBuzz();
        String result = test.detect(initialNumber);
        check(result.equals("FizzBuzz"), "canBeDividedByFiveAndThree");
    }

    public void canBeDividedByFive(int initialNumber){
        FizzBuzz test = new FizzBuzz();
        String result = test.detect(initialNumber);
        check(result.equals("Buzz"), "canBeDividedByFive");
    }

    public void canBeDividedByThree(int initialNumber){
        FizzBuzz test = new FizzBuzz();
        String result = test.detect(initialNumber);
        check(result.equals("Fizz"), "canBeDividedByThree");
    }

    public void check(boolean condition, String testName){
        if(condition){
            System.out.println(testName + " OK!");
        } else {
            System.out.println(testName + " failed!");
        }
    }
}
