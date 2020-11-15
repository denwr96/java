package main.java.javaguru.sunday.student_deniss_lobacs.lesson_7.level_6_middle;

public class PowerCalculator {

    public double exponentiation(double number, int power) {

        double result = 1;

        for (int i = 0; i < power; i++) {
            result = number * result;
        }
        return result;
    }
}
