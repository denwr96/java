package main.java.javaguru.sunday.student_deniss_lobacs.lesson_4.level_4_junior.task15;

public class Calculator {

    public int sum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public int sub(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    public int mul(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    public int div(int firstNumber, int secondNumber) {
        return firstNumber / secondNumber;
    }

    public int max(int firstNumber, int secondNumber) {

        if (firstNumber >= secondNumber) {
            return firstNumber;
        } else {
            return secondNumber;
        }
    }

    public boolean isEven(int number) {
        return number % 2 == 0;
    }

    public int maxOfThree(int firstNumber , int secondNumber , int thirdNumber) {

        if (firstNumber > secondNumber) {
            if (firstNumber > secondNumber) {
                return firstNumber;
            }
            else {
                return thirdNumber;
            }
        }
        else if (secondNumber > thirdNumber) {
            return secondNumber;
        }
        else {
            return thirdNumber;
        }
    }
}
