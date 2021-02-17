package main.java.javaguru.sunday.student_laura_upelniece.lesson4.lvl4.task11_task12;
//import java.lang.Math;
//Как-то многовато тестов вышло, надесюсь так и надо было


import javax.sound.midi.Soundbank;

public class CalculatorTest {

    public static void main(String[] args) {
        CalculatorTest runner = new CalculatorTest();

        //calls Calculator class methods on CalculatorTest object(runner) for a test
//        runner.sumTest();
//        runner.subTest();
//        runner.divTest();
//        runner.multiTest();
//        runner.isEvenTest();
//
//        runner.maxOfTwoTest1();
//        runner.maxOfTwoTest2();
//        runner.maxOfTwoEqualsTest();
//
//        runner.maxOfThreeTest1();
//        runner.maxOfThreeTest2();
        runner.maxOfThreeTest3();

        runner.maxOfThreeFirstTwoTest1();
        runner.maxOfThreeFirstTwoTest2();
        runner.maxOfThreeLastTwoTest1();
        runner.maxOfThreeLastTwoTest2();
        runner.maxOfThreeMiddleTest1();
        runner.maxOfThreeMiddleTest2();
        runner.maxOfThreeSameTest();
    }

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public void sumTest() {

        //values to test with
        int firstNumber = 10;
        int secondNumber = 5;

        //creating a calculator object, calling method sum()
        Calculator victim = new Calculator();
        int expectedResult = victim.sum(firstNumber, secondNumber);

        //expected result is 10 + 5 = 15
        if (expectedResult == 15) {
            System.out.println("Sum test = OK");
        } else {
            System.out.println("Sum test = FAIL");
        }
    }

    public void divTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 10/5;

        Calculator victim = new Calculator();
        int result  = victim.div(firstNumber, secondNumber);

        if (result == expectedResult) {
            System.out.println("Div test = OK");
        } else {
            System.out.println("Div test = FAIL");
        }
    }

    public void subTest() {
        int firstNumber = 10;
        int secondNumber = 5;

        Calculator victim = new Calculator();
        int result = victim.sub(firstNumber, secondNumber);

        if (result == 10-5) {
            System.out.println("Sub test = OK");
        } else {
            System.out.println("Sub test = FAIL");
        }
    }

    public void multiTest() {
        int firstNumber = 10;
        int secondNumber = 5;

        Calculator victim = new Calculator();
        int result = victim.multi(firstNumber, secondNumber);

        if (result == firstNumber * secondNumber) {
            System.out.println("Multi test = OK");
        } else {
            System.out.println("Multi test = FAIL");
        }
    }

    public void isEvenTest() {
        int evenNumber = 10;

        Calculator victim = new Calculator();
        boolean result = victim.isEven(evenNumber);

        if (result) {
            System.out.println("Even test = OK");
        } else {
            System.out.println("Even test = FAIL");
        }
    }

 //////////////////////////////////////////////////////////////////////////////////////////////////////////////

     //checks scenario: first number is bigger
    public void maxOfTwoTest1() {
        int firstNumber = 10;
        int secondNumber = 5;

        Calculator victim = new Calculator();
        int result = victim.maxOfTwoNumbers(firstNumber, secondNumber);

        if (result == firstNumber) {
            System.out.println("First max test = OK");
        } else {
            System.out.println("First max test = FAIL");
        }

    }

     //checks scenario: second number is bigger
    public void maxOfTwoTest2() {
        int firstNumber = 5;
        int secondNumber = 10;

        Calculator victim = new Calculator();
        int result = victim.maxOfTwoNumbers(firstNumber, secondNumber);

        if (result == secondNumber) {
            System.out.println("Second max test = OK");
        } else {
            System.out.println("Second max test = FAIL");
        }
    }

     //checks scenario: numbers are the same
    public void maxOfTwoEqualsTest() {
        int firstNumber = 10;
        int secondNumber = 10;
        char equal = '=';

        Calculator victim = new Calculator();
        int result = victim.maxOfTwoNumbers(firstNumber, secondNumber);

        if (result == equal) {
            System.out.println("Equals test = OK");
        } else {
            System.out.println("Equals test = FAIL");
        }
    }

////////////////////////////////////////////////////////////////////////////////////////////////////////////

     //checks scenario: first number is bigger
    public void maxOfThreeTest1() {
        int firstNumber = 10;
        int secondNumber = 5;
        int thirdNumber = 0;

        Calculator victim = new Calculator();
        int result = victim.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);

        if (result == firstNumber) {
            System.out.println("First max of three test = OK");
        } else {
            System.out.println("First max of three test = FAIL");
        }

    }

     //checks scenario: second number is bigger
     public void maxOfThreeTest2() {
         int firstNumber = 5;
         int secondNumber = 10;
         int thirdNumber = 0;

         Calculator victim = new Calculator();
         int result = victim.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);

         if (result == secondNumber) {
             System.out.println("Second max of three test = OK");
         } else {
             System.out.println("Second max of three test = FAIL");
         }

     }

     //checks scenario: third number is bigger
     public void maxOfThreeTest3() {
         int firstNumber = 0;
         int secondNumber = 10;
         int thirdNumber = 10;

         Calculator victim = new Calculator();
         int result = victim.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);

         if (result ==  thirdNumber) {
             System.out.println("Third max of three test = OK");
         } else {
             System.out.println("Third max of three test = FAIL");
         }
     }



 ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

     //checks scenario: FIRST two numbers are SAME and BIGGER than third
     public void maxOfThreeFirstTwoTest1() {
         int firstNumber = 10;
         int secondNumber = 10;
         int thirdNumber = 5;

         Calculator victim = new Calculator();
         int result = victim.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
         int firstTwo = (firstNumber + secondNumber)/2;

         if (result == firstTwo && firstTwo == firstNumber) {
             System.out.println("First two bigger test = OK");
         } else {
             System.out.println("First two bigger test = FAIL");
         }
     }

     //checks scenario: FIRST two numbers are SAME and SMALLER than third
     public void maxOfThreeFirstTwoTest2() {
         int firstNumber = 5;
         int secondNumber = 5;
         int thirdNumber = 10;

         Calculator victim = new Calculator();
         int result = victim.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
         int firstTwo = (firstNumber + secondNumber)/2;

         if (result == thirdNumber && firstTwo == firstNumber) {
             System.out.println("First two smaller test = OK");
         } else {
             System.out.println("First two smaller test = FAIL");
         }
     }

     //checks scenario: LAST two numbers SAME ane BIGGER than first
     public void maxOfThreeLastTwoTest1() {
         int firstNumber = 5;
         int secondNumber = 10;
         int thirdNumber = 10;

         Calculator victim = new Calculator();
         int result = victim.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
         int lastTwo = (secondNumber + thirdNumber)/2;

         if (result == lastTwo && result > firstNumber) {
             System.out.println("Last two bigger test = OK");
         } else {
             System.out.println("Last two bigger test = FAIL");
         }
     }

     //checks scenario: LAST two numbers SAME are SMALLER than third
     public void maxOfThreeLastTwoTest2() {
         int firstNumber = 10;
         int secondNumber = 5;
         int thirdNumber = 5;

         Calculator victim = new Calculator();
         int result = victim.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
         int lastTwo = (secondNumber + thirdNumber)/2;

         if (result == firstNumber  && secondNumber == lastTwo) {
             System.out.println("Last two smaller = OK");
         } else {
             System.out.println("Last two smaller = FAIL");
         }
     }

     //checks scenario: first and last are the same ane bigger
     public void maxOfThreeMiddleTest1() {
         int firstNumber = 10;
         int secondNumber = 5;
         int thirdNumber = 10;

         Calculator victim = new Calculator();
         int result = victim.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
         int firstAndLast = (firstNumber + thirdNumber)/2;

         if (result == firstAndLast) {
             System.out.println("Middle smaller test = OK");
         } else {
             System.out.println("Middle smaller test = FAIL");
         }
     }

     //checks scenario: first and last are the same and smaller
     public void maxOfThreeMiddleTest2() {
         int firstNumber = 5;
         int secondNumber = 10;
         int thirdNumber = 5;

         Calculator victim = new Calculator();
         int result = victim.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
         int firstAndLast = (firstNumber + thirdNumber)/2;

         if (result == secondNumber && firstAndLast == firstNumber) {
             System.out.println("Middle bigger test = OK");
         } else {
             System.out.println("Middle bigger test = FAIL");
         }
     }

     //checks scenario: all numbers are same
     public void maxOfThreeSameTest() {
         int firstNumber = 10;
         int secondNumber = 10;
         int thirdNumber = 10;

         Calculator victim = new Calculator();
         int result = victim.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
         int average = (firstNumber + secondNumber + thirdNumber) / 3;

         if (result ==  average) {
             System.out.println("Same test = OK");
         } else {
             System.out.println("Same test = FAIL");
         }
     }

 }