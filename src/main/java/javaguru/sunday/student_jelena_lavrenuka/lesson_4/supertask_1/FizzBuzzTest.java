package javaguru.sunday.student_jelena_lavrenuka.lesson_4.supertask_1;

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class FizzBuzzTest {
    public static void main(String[] args) {
        FizzBuzzTest myFizzBuzzTest = new FizzBuzzTest();
        myFizzBuzzTest.fizzTest();
        myFizzBuzzTest.buzzTest();
        myFizzBuzzTest.fizzBuzzTest();
        myFizzBuzzTest.otherResultTest();


    }

    public void fizzTest() {
        FizzBuzz victim = new FizzBuzz();
        int number = 9;
        String result = victim.fizzBuzzdetect(number);
        if (result == "Fizz") {
            System.out.println(result + " - Test OK");
        } else {
            System.out.println("Test failed");
        }
    }

    public void buzzTest() {
        FizzBuzz victim = new FizzBuzz();
        int number = 10;
        String result = victim.fizzBuzzdetect(number);
        if (result == "Buzz") {
            System.out.println(result + " - Test OK");
        } else {
            System.out.println("Test failed");
        }
    }

    public void fizzBuzzTest() {
        FizzBuzz victim = new FizzBuzz();
        int number = 30;
        String result = victim.fizzBuzzdetect(number);
        if (result == "FizzBuzz") {
            System.out.println(result + " - Test OK");
        } else {
            System.out.println("Test failed");
        }
    }

    public void otherResultTest() {
        FizzBuzz victim = new FizzBuzz();
        int number = 67;
        String result = victim.fizzBuzzdetect(number);
        boolean str = result.equals("67");
        if (str == true) {
            System.out.println(result + " - Test OK");
        } else {
            System.out.println("Test failed");
        }
    }
}
