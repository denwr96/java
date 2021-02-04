package main.java.javaguru.sunday.student_laura_upelniece.lesson4.lvl4.task11_task12;
import java.lang.Math;

class Calculator {

    //calculator methods
    public int sum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public int sub(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    public int div(int firstNumber, int secondNumber) {
        return firstNumber / secondNumber;
    }

    public int multi(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    public boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public int maxOfTwoNumbers(int firstNumber, int secondNumber) {
        char equal = '=';
        if (firstNumber > secondNumber) {
            return firstNumber;
        } else if (secondNumber > firstNumber) {
            return secondNumber;
        } else {
            return equal;
        }

    }

    public int maxOfThreeNumbers(int firstNumber, int secondNumber, int thirdNumber) {

        if (firstNumber > secondNumber && firstNumber >= thirdNumber) {
            return firstNumber;
        } else if (firstNumber > thirdNumber && firstNumber >= secondNumber) {
            return firstNumber;
        } else if (secondNumber > firstNumber && secondNumber >= thirdNumber) {
            return secondNumber;
        }  else if (thirdNumber > secondNumber && thirdNumber >= firstNumber) {
            return thirdNumber;
        } else if (thirdNumber > firstNumber && thirdNumber >= secondNumber) {
            return thirdNumber;
        } else return firstNumber;

    }




}
