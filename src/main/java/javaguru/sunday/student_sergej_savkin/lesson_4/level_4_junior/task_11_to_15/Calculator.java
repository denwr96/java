package main.java.javaguru.sunday.student_sergej_savkin.lesson_4.level_4_junior.task_11_to_15;
// task 11
// task 13
// task 14
// task 15

class Calculator {

    public int sum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public int sub(int firstNumber, int secondNumber){
        return firstNumber - secondNumber;
    }

    public int mult(int firstNumber, int secondNumber){
        return firstNumber * secondNumber;
    }

    public int div(int firstNumber, int secondNumber){
        return firstNumber / secondNumber;
    }

    public boolean isEven(int number){
        if(number % 2 == 0){
            return true;
        } else {
            return false;
        }
    }

    public int maxOfTwoNumbers(int firstNumber, int secondNumber){
        if(firstNumber > secondNumber){
            return firstNumber;
        } else if(firstNumber == secondNumber) {
            return firstNumber;
        } else {
            return secondNumber;
        }
    }

    public int maxOfThreeNumbers(int firstNumber, int secondNumber, int thirdNumber){
        if(firstNumber > secondNumber && (firstNumber > thirdNumber)){
            return firstNumber;
        } else if (secondNumber > firstNumber && (secondNumber > thirdNumber)) {
            return secondNumber;
        } else if (thirdNumber > firstNumber && (thirdNumber > secondNumber)) {
            return thirdNumber;
        } else if (firstNumber < secondNumber && secondNumber == thirdNumber){
            return secondNumber;
        } else {
            return  firstNumber;
        }
    }
}
