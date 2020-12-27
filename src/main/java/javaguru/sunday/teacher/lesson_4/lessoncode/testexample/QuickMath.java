package javaguru.sunday.teacher.lesson_4.lessoncode.testexample;

public class QuickMath {

    public int max(int numberOne, int numberTwo) {
        if (numberOne >= numberTwo) {
            return numberOne;
        } else {
            return numberTwo;
        }
    }

    public boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
