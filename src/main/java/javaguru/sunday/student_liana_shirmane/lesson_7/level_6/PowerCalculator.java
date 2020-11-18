package main.java.javaguru.sunday.student_liana_shirmane.lesson_7.level_6;

public class PowerCalculator {
    public double power(int base, int exponent) {
        double result = 1.00;
        if (exponent > 0) {
            for (int i = 1; i <= exponent; i++) {
                result = result * base;

            }
        } else if (exponent < 0) {
            for (int i = 1; i <= (exponent * (-1)); i++) {
                double devider = 1.00;
                devider = devider * base;
                result = (result / devider);
            }
        } else {
            return 1;
        }
        return result;
    }
}
