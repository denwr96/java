package main.java.javaguru.sunday.student_natalia_kochkina.lesson_7.level_6;

//Task_10

public class PowerCalculator {

    public int raisingANumberToAPower(int number, int power) {
        int[] array = new int[power - 1];
        int result = number;
        for (int i = 0; i < array.length; i++ ) {
            result = result * number;
        }
        return result;
    }
}
