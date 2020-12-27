package javaguru.sunday.student_konstantin_shestakov.lesson_4.level_7.super_task_1;

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class FizzBuzzTest {

    public static void main(String[] args) {
        FizzBuzzTest fizzBuzzTest = new FizzBuzzTest();
        fizzBuzzTest.test1();
        fizzBuzzTest.test2();
        fizzBuzzTest.test3();
    }

    public void test1() {
        FizzBuzz test1 = new FizzBuzz();
        String resultString = test1.detect(3);

        boolean resultStringEqualsFizz = resultString.equals("Fizz");
        boolean resultStringEqualsBuzz = resultString.equals("Buzz");
        boolean resultStringEqualsFizzBuzz = resultString.equals("FizzBuzz");

        if (resultStringEqualsFizz) {
            System.out.println("Fizz Test = OK - условие: введённое число делится на 3 без остатка");
//            System.out.println("Buzz Test = FAIL - условие: введённое число делится на 5 без остатка");
//            System.out.println("FizzBuzz Test = FAIL - условие: введённое число делится и на 3, и на 5 без остатка");
        }
        else if (resultStringEqualsBuzz) {
//            System.out.println("Fizz Test = FAIL - условие: введённое число делится на 3 без остатка");
            System.out.println("Buzz Test = OK - условие: введённое число делится на 5 без остатка");
//            System.out.println("FizzBuzz Test = FAIL - условие: введённое число делится и на 3, и на 5 без остатка");
        }
        else if (resultStringEqualsFizzBuzz) {
//            System.out.println("Fizz Test = FAIL - условие: введённое число делится на 3 без остатка");
//            System.out.println("Buzz Test = FAIL - условие: введённое число делится на 5 без остатка");
            System.out.println("FizzBuzz Test = OK - условие: введённое число делится и на 3, и на 5 без остатка");
        }
        else {
            System.out.println("Fizz, Buzz, FizzBuzz Tests = FAIL - ни одно из условий не соблюдено");
        }

    }

    public void test2() {
        FizzBuzz test1 = new FizzBuzz();
        String resultString = test1.detect(5);

        boolean resultStringEqualsFizz = resultString.equals("Fizz");
        boolean resultStringEqualsBuzz = resultString.equals("Buzz");
        boolean resultStringEqualsFizzBuzz = resultString.equals("FizzBuzz");

        if (resultStringEqualsFizz) {
            System.out.println("Fizz Test = OK - условие: введённое число делится на 3 без остатка");
//            System.out.println("Buzz Test = FAIL - условие: введённое число делится на 5 без остатка");
//            System.out.println("FizzBuzz Test = FAIL - условие: введённое число делится и на 3, и на 5 без остатка");
        }
        else if (resultStringEqualsBuzz) {
//            System.out.println("Fizz Test = FAIL - условие: введённое число делится на 3 без остатка");
            System.out.println("Buzz Test = OK - условие: введённое число делится на 5 без остатка");
//            System.out.println("FizzBuzz Test = FAIL - условие: введённое число делится и на 3, и на 5 без остатка");
        }
        else if (resultStringEqualsFizzBuzz) {
//            System.out.println("Fizz Test = FAIL - условие: введённое число делится на 3 без остатка");
//            System.out.println("Buzz Test = FAIL - условие: введённое число делится на 5 без остатка");
            System.out.println("FizzBuzz Test = OK - условие: введённое число делится и на 3, и на 5 без остатка");
        }
        else {
            System.out.println("Fizz, Buzz, FizzBuzz Tests = FAIL - ни одно из условий не соблюдено");
        }

    }

    public void test3() {
        FizzBuzz test1 = new FizzBuzz();
        String resultString = test1.detect(15);

        boolean resultStringEqualsFizz = resultString.equals("Fizz");
        boolean resultStringEqualsBuzz = resultString.equals("Buzz");
        boolean resultStringEqualsFizzBuzz = resultString.equals("FizzBuzz");

        if (resultStringEqualsFizz) {
            System.out.println("Fizz Test = OK - условие: введённое число делится на 3 без остатка");
//            System.out.println("Buzz Test = FAIL - условие: введённое число делится на 5 без остатка");
//            System.out.println("FizzBuzz Test = FAIL - условие: введённое число делится и на 3, и на 5 без остатка");
        }
        else if (resultStringEqualsBuzz) {
//            System.out.println("Fizz Test = FAIL - условие: введённое число делится на 3 без остатка");
            System.out.println("Buzz Test = OK - условие: введённое число делится на 5 без остатка");
//            System.out.println("FizzBuzz Test = FAIL - условие: введённое число делится и на 3, и на 5 без остатка");
        }
        else if (resultStringEqualsFizzBuzz) {
//            System.out.println("Fizz Test = FAIL - условие: введённое число делится на 3 без остатка");
//            System.out.println("Buzz Test = FAIL - условие: введённое число делится на 5 без остатка");
            System.out.println("FizzBuzz Test = OK - условие: введённое число делится и на 3, и на 5 без остатка");
        }
        else {
            System.out.println("Fizz, Buzz, FizzBuzz Tests = FAIL - ни одно из условий не соблюдено");
        }

    }

}