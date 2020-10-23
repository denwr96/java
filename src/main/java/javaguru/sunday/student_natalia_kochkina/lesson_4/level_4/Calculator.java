package main.java.javaguru.sunday.student_natalia_kochkina.lesson_4.level_4;

//Task_11
//Task_13
//Task_14
//Task_15

public class Calculator {

    public int sum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public int sub(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    public double div(int firstNumber, int secondNumber) {
        return (double) firstNumber / (double) secondNumber;
    }

    public int mul(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    public boolean isEven(int number) {
        int remainder = number % 2;
        if (remainder == 0) {
            return true;
        } else {
            return  false;
        }
    }

    public int maxOfTwoNumbers(int firstNumber, int secondNumber) {
        if (firstNumber >= secondNumber) {
            return firstNumber;
        } else {
            return secondNumber;
        }
    }

    public int maxOfThreeNumbers(int firstNumber, int secondNumber, int thirdNumber) {
        if ((firstNumber >= secondNumber) && (firstNumber >= thirdNumber)) {
            return firstNumber;
        } else if ((secondNumber >= firstNumber) && (secondNumber >= thirdNumber)) {
            return  secondNumber;
        } else {
            return thirdNumber;
        }
    }
}
