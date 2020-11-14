package main.java.javaguru.sunday.student_kristina_sutugina.lesson_6.level_1;

class FizzBuzzTest {
    public static void main(String[] args) {
        FizzBuzzTest victim = new FizzBuzzTest();
        victim.fizzBuzzTest();
        victim.fizzTest();
        victim.buzzTest();
        victim.otherNumbersTest();
    }

    public void fizzBuzzTest() {
        FizzBuzz victim = new FizzBuzz();
        int number = 15;
        String expectedResult = "FizzBuzz";
        String realResult = victim.detect(number);
        detect(expectedResult, realResult, "fizzBuzzTest");
    }

    public void fizzTest() {
        FizzBuzz victim = new FizzBuzz();
        int number = 9;
        String expectedResult = "Fizz";
        String realResult = victim.detect(number);
        detect(expectedResult, realResult, "fizzTest");
    }

    public void buzzTest() {
        FizzBuzz victim = new FizzBuzz();
        int number = 10;
        String expectedResult = "Buzz";
        String realResult = victim.detect(number);
        detect(expectedResult, realResult, "buzzTest");
    }

    public void otherNumbersTest() {
        FizzBuzz victim = new FizzBuzz();
        int number = 16;
        String expectedResult = Integer.toString(number);
        String realResult = victim.detect(number);
        detect(expectedResult, realResult, "otherNumbersTest");
    }

    public void detect(String expectedResult, String realResult, String testName) {
        if (expectedResult.equals(realResult)) {
            System.out.println(testName + " test passed");
        } else {
            System.out.println(testName + " test failed");
        }
    }
}
