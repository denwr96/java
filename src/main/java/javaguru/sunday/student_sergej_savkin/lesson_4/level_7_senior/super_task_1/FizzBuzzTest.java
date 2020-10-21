package main.java.javaguru.sunday.student_sergej_savkin.lesson_4.level_7_senior.super_task_1;

class FizzBuzzTest {
    public static void main(String[] args) {

        FizzBuzzTest fizzBuzzTest = new FizzBuzzTest();
        fizzBuzzTest.divideByThree();
        fizzBuzzTest.divideByThreeFailTest();
        fizzBuzzTest.divideByFive();
        fizzBuzzTest.divideByFiveFailTest();
        fizzBuzzTest.divideByThreeAndFive();
        fizzBuzzTest.divideByThreeAndFiveFailTest();
        fizzBuzzTest.returnNumberTest();
        fizzBuzzTest.returnNumberTestFail();
    }

    public void divideByThree(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.detect(9);
        if(result.equals("Fizz")){
            System.out.println("Test divideByThree passed - OK");
        } else {
            System.out.println("Test divideByThree FAILED");
        }
    }

    public void divideByThreeFailTest(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.detect(10);
        if(result.equals("Fizz")){
            System.out.println("Test divideByThreeFailTest FAILED");
        } else {
            System.out.println("Test divideByThreeFailTest passed - OK");
        }
    }

    public void divideByFive(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.detect(10);
        if(result.equals("Buzz")){
            System.out.println("Test divideByFive passed - OK");
        } else {
            System.out.println("Test divideByFive FAILED");
        }
    }

    public void divideByFiveFailTest(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.detect(11);
        if(result.equals("Buzz")){
            System.out.println("Test divideByFiveFailTest FAILED");
        } else {
            System.out.println("Test divideByFiveFailTest passed OK!");
        }
    }

    public void divideByThreeAndFive(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.detect(15);
        if(result.equals("FizzBuzz")){
            System.out.println("Test divideByThreeAndFive passed - OK");
        } else {
            System.out.println("Test divideByThreeAndFive FAILED");
        }
    }

    public void divideByThreeAndFiveFailTest(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.detect(16);
        if(result.equals("FizzBuzz")){
            System.out.println("Test divideByThreeAndFiveFailTest Failed");
        } else {
            System.out.println("Test divideByThreeAndFiveFailTest passed - OK!");
        }
    }

    public void returnNumberTest(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.detect(16);
        if(result.equals("16")){
            System.out.println("Test returnNumberTest passed - OK!");
        } else {
            System.out.println("Test returnNumberTest FAILED");
        }
    }

    public void returnNumberTestFail(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.detect(15);
        if(result.equals("15")){
            System.out.println("Test returnNumberTestFail FAILED");
        } else {
            System.out.println("Test returnNumberTestFail passed - OK!");
        }
    }
}
