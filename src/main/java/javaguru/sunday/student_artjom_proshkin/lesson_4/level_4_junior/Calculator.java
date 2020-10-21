package main.java.javaguru.sunday.student_artjom_proshkin.lesson_4.level_4_junior;

// Task_11
// Task_13
// Task_14
// Task_15


class Calculator {

    int sum (int firstNumber, int secondNumber){
        return firstNumber + secondNumber;
    }

    int multiply (int firstNumber, int secondNumber){
        return firstNumber * secondNumber;
    }

    int subtract (int firstNumber, int secondNumber){
        return firstNumber - secondNumber;
    }

    int divide (int firstNumber, int secondNumber) {
        return firstNumber / secondNumber;
    }

    boolean isEven (int firstNumber){
        if (firstNumber % 2 == 0 ){
            return true;
        } else {
            return false;
        }
    }
    int maxOfTwoNumbers(int firstNumber, int secondNumber) {
        if (firstNumber > secondNumber){
            return firstNumber;
        } else if (firstNumber < secondNumber){
            return secondNumber;
        } else {
            return firstNumber;
        }
    }
    int maxOfThreeNumbers(int firstNumber, int secondNumber, int thirdNumber){
        if (firstNumber > secondNumber && firstNumber > thirdNumber){
            return firstNumber;
        } else if (firstNumber < secondNumber && secondNumber > thirdNumber){
            return secondNumber;
        } else if (firstNumber == secondNumber && secondNumber == thirdNumber){
            return firstNumber;
        } else {
            return thirdNumber;
        }

    }
}
