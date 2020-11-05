package main.java.javaguru.sunday.student_nataliya_sinitsa.lesson4.level7.supertask1;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class FizzBuzzTest {

    public static void main(String[] args) {

        FizzBuzzTest fizzBuzz = new FizzBuzzTest();
        fizzBuzz.test1();
        fizzBuzz.test2();
        fizzBuzz.test3();
        fizzBuzz.test4();
    }

    public void test1() {
        FizzBuzz victim = new FizzBuzz();
        String detect = victim.detect(15);

        if (detect.equals("FizzBuzz")) {
            System.out.println("FizzBuzz test is OK");
        } else {
            System.out.println("FizzBuzz test is FAILED");
        }
    }

    public void test2() {
        FizzBuzz victim = new FizzBuzz();
        String detect = victim.detect(9);

        if (detect.equals("Fizz")) {
            System.out.println("Fizz test is OK");
        } else {
            System.out.println("Fizz test is FAILED");
        }
    }

    public void test3() {
        FizzBuzz victim = new FizzBuzz();
        String detect = victim.detect(10);

        if (detect.equals("Buzz")) {
            System.out.println("Buzz test is OK");
        } else {
            System.out.println("Buzz test is FAILED");
        }
    }

    public void test4() {
        FizzBuzz victim = new FizzBuzz();
        String detect = victim.detect(2);

        if (detect.equals("" + 2)) {
            System.out.println("Number test is OK");
        } else {
            System.out.println("Number test is FAILED");
        }
    }

}
