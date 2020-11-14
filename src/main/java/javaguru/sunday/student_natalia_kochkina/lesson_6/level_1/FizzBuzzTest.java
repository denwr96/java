package main.java.javaguru.sunday.student_natalia_kochkina.lesson_6.level_1;

//Task_3

import main.java.javaguru.sunday.student_natalia_kochkina.lesson_4.level_7.FizzBuzz;
import main.java.javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class FizzBuzzTest {

    public static void main(String[] args) {
        FizzBuzzTest fizzBuzzTest = new FizzBuzzTest();
        FizzBuzzTest.testFizz();
        FizzBuzzTest.testBuzz();
        FizzBuzzTest.testFizzBuzz();
        FizzBuzzTest.testElse();
    }

    public static  void testFizz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.detect(6);
        System.out.println(result);

        if (result == "Fizz") {
            System.out.println("Test1 OK");
        } else {
            System.out.println("Test1 failed");
        }
    }

    public static  void testBuzz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.detect(10);
        System.out.println(result);

        if (result == "Buzz") {
            System.out.println("Test2 OK");
        } else {
            System.out.println("Test2 failed");
        }
    }

    public static  void testFizzBuzz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.detect(30);
        System.out.println(result);

        if (result == "FizzBuzz") {
            System.out.println("Test3 OK");
        } else {
            System.out.println("Test3 failed");
        }
    }

    public static  void testElse() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.detect(7);
        System.out.println(result);

        if (result.equals("7")) {
            System.out.println("Test4 OK");
        } else {
            System.out.println("Test4 failed");
        }
    }
}