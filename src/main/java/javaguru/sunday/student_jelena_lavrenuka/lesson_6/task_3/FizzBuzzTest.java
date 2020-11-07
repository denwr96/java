package main.java.javaguru.sunday.student_jelena_lavrenuka.lesson_6.task_3;

class FizzBuzzTest {
    public static void main(String[] args) {
        FizzBuzzTest test = new FizzBuzzTest();
        test.fizzTest();
        test.buzzTest();
        test.fizzBuzzTest();

    }
    public void fizzTest(){
        FizzBuzz victim = new FizzBuzz();
        String actualResult = victim.detect(6);
        boolean expectedResult = actualResult.equals("Fizz");
        testResult(expectedResult, "Fizz Test");
    }
    public void buzzTest(){
        FizzBuzz victim = new FizzBuzz();
        String actualResult = victim.detect(20);
        boolean expectedResult = actualResult.equals("Buzz");
        testResult(expectedResult, "Buzz Test");
    }
    public void fizzBuzzTest(){
        FizzBuzz victim = new FizzBuzz();
        String actualResult = victim.detect(15);
        boolean expectedResult = actualResult.equals("FizzBuzz");
        testResult(expectedResult, "FizzBuzz Test");
    }
    public void testResult(boolean result, String testName) {
        if (result) {
            System.out.println(testName + " is OK");
        } else {
            System.out.println(testName + " is FAILED");
        }
    }

}
