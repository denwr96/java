package main.java.javaguru.sunday.student_nataliya_sinitsa.lesson6.level1.task3;

class FizzBuzzTest {

    public static void main(String[] args) {

        FizzBuzzTest fizzBuzzTest = new FizzBuzzTest();
        fizzBuzzTest.devidesByThreeAndFive();
        fizzBuzzTest.devidesByThree();
        fizzBuzzTest.devidesByFive();
        fizzBuzzTest.doesNotDevideByThreeAndFive();
    }

    public void devidesByThreeAndFive() {
        FizzBuzz victim = new FizzBuzz();
        String actualResult = victim.detect(15);
        check("FizzBuzz", actualResult, "devidesByThreeAndFive");
    }

    public void devidesByThree() {
        FizzBuzz victim = new FizzBuzz();
        String actualResult = victim.detect(9);
        check("Fizz", actualResult, "devidesByThree");
    }

    public void devidesByFive() {
        FizzBuzz victim = new FizzBuzz();
        String actualResult = victim.detect(10);
        check("Buzz", actualResult, "devidesByFive");
    }

    public void doesNotDevideByThreeAndFive() {
        FizzBuzz victim = new FizzBuzz();
        String actualResult = victim.detect(2);
        check("2", actualResult, "doesNotDevideByThreeAndFive");
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
