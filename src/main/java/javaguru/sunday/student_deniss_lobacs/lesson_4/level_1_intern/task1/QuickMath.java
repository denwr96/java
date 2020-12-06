package main.java.javaguru.sunday.student_deniss_lobacs.lesson_4.level_1_intern.task1;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;
import main.java.javaguru.sunday.teacher.annotations.CodeReviewComment;

@CodeReview(approved = true)
@CodeReviewComment(comment = "Весь QuickMath нужно было уместить в одном классе")
public class QuickMath {

    public boolean isPositive(int number) {
        if (number >= 0) {
            return true;
        } else {
            return false;
        }
    }

    public int function(int number) {

        if (number > 0){
            return 1;
        } else if (number == 0) {
            return 0;
        } else {
            return -1;
        }
    }

    public boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public int Max(int numberOne , int numberTwo) {

        if (numberOne >= numberTwo) {
            return numberOne;
        }  else {
            return numberTwo;
        }
    }

    public int Min(int numberOne , int numberTwo) {

        if (numberOne <= numberTwo) {
            return numberOne;
        }  else {
            return numberTwo;
        }
    }

    public boolean isEquals(int numberOne , int numberTwo) {

        if (numberOne == numberTwo) {
            return true;
        }  else {
            return false;
        }
    }

    public String Compare(int numberOne , int numberTwo , int numberThree ) {

        if (numberOne == numberTwo && numberOne == numberThree) {
            return "All numbers are equal";
        } else if (numberOne != numberTwo && numberOne != numberThree && numberTwo != numberThree) {
            return "All numbers are different";
        } else {
            return "Neither all are equal or different";
        }

    }

    public String compareV2(int numberOne , int numberTwo , int numberThree ) {

        if (numberOne > numberTwo && numberOne > numberThree && numberTwo > numberThree) {
            return "decreasing";
        } else if (numberOne < numberTwo && numberOne < numberThree && numberTwo < numberThree ) {
            return "increasing";
        } else {
            return "Neither increasing or decreasing order";
        }
    }

    public int maxOfThree(int numberOne , int numberTwo , int numberThree ) {

        if (numberOne > numberTwo && numberOne > numberThree) {

        }
        if (numberOne > numberTwo) {
            if (numberOne > numberThree) {
                return numberOne;
            }
            else {
                return numberThree;
            }
        }
        else if (numberTwo > numberThree) {
            return numberTwo;
        }
        else {
            return numberThree;
        }

    }

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
}
