package main.java.javaguru.sunday.student_konstantin_shestakov.lesson_6.level_1;

// Task 3

class FizzBuzzTest {

    public static void main(String[] args) {
        FizzBuzzTest test = new FizzBuzzTest();
        test.fizzBuzzTest();
    }

    String[] expectedResultArray = {"FizzBuzz", "Fizz", "Buzz", "4"}; // last one - test for initial number return;

    public void fizzBuzzTest() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String[] resultArray = {fizzBuzz.detect(15), fizzBuzz.detect(3), fizzBuzz.detect(5), fizzBuzz.detect(4)};

        for (int i = 0; i < resultArray.length ; i++) {
            if (resultArray[i].equals(expectedResultArray[i])) {
                System.out.println(expectedResultArray[i] + " test = OK");
            } else {
                System.out.println(expectedResultArray[i] + " test = FAIL");
            }
        }

    }
}
