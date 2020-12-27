package javaguru.sunday.student_konstantin_shestakov.lesson_4.level_4;

// Task 11
// Task 12
// Task 13
// Task 14
// Task 15

import javaguru.sunday.teacher.annotations.CodeReview;
import javaguru.sunday.teacher.annotations.CodeReviewComment;

@CodeReview(approved = true)
@CodeReviewComment(comment = "Метод maxOfThreeNumbers супер усложнен. Его надо зарефакторить (переписать)")
class Calculator {

    public int sum(int firstNumber, int secondNumber) {
            return firstNumber + secondNumber;
        }

    public int subtraction(int firstNumber, int secondNumber) {
            return firstNumber - secondNumber;
        }

    public double division(double firstNumber, double secondNumber) {
            return firstNumber / secondNumber;
        }

    public int multiplication(int firstNumber, int secondNumber) {
            return firstNumber * secondNumber;
        }

    public int remainder(int firstNumber, int secondNumber) {
            return firstNumber % secondNumber;
        }

    public boolean isEven(int number) {
        boolean isEven;

        if (number % 2 == 0) {
            isEven = true;
        }
        else {
            isEven = false;
        }
        return isEven;
        }

    public int maxOfTwoNumbers(int firstNumber, int secondNumber) {

        if (firstNumber > secondNumber) {
            return firstNumber;
        }
        else {
            return secondNumber;
        }
    }

    public int maxOfThreeNumbers(int firstNumber, int secondNumber, int thirdNumber) {

        if (firstNumber > secondNumber && firstNumber > thirdNumber) {
            return firstNumber;
        }
        else if (firstNumber > secondNumber && firstNumber < thirdNumber) {
            return thirdNumber;
        }
        else if (firstNumber < secondNumber && firstNumber > thirdNumber) {
            return secondNumber;
        }
        else if (firstNumber < secondNumber && firstNumber < thirdNumber && thirdNumber > secondNumber) {
            return thirdNumber;
        }
        else if (firstNumber < secondNumber && firstNumber < thirdNumber && secondNumber > thirdNumber) {
            return secondNumber;
        }
        else if (firstNumber == secondNumber && firstNumber > thirdNumber && secondNumber > thirdNumber) {
            return firstNumber;
        }
        else if (firstNumber == thirdNumber && firstNumber > secondNumber && thirdNumber > secondNumber) {
            return firstNumber;
        }
        else if (firstNumber == secondNumber && secondNumber == thirdNumber) {
            return firstNumber;
        }
        else if (secondNumber > firstNumber && secondNumber > thirdNumber) {
            return secondNumber;
        }
        else if (thirdNumber > firstNumber && secondNumber == thirdNumber) {
            return thirdNumber;
        }
        else if (thirdNumber > firstNumber && secondNumber < thirdNumber) {
            return thirdNumber;
        }
        else {
            //результат для проверки тестовых сценариев
            return firstNumber + secondNumber + thirdNumber;
        }

    }
}
