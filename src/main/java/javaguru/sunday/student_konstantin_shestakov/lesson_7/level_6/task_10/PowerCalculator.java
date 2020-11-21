package main.java.javaguru.sunday.student_konstantin_shestakov.lesson_7.level_6.task_10;

// Task 10

class PowerCalculator {

    double exponentiation(double number, int exponent) {
        double result = 1;
        for (int i = 0; i < Math.abs(exponent); i++) {
            result *= number;
        }
        if (exponent == 0) {
            System.out.println("1");
            return 1;
        }
        if (exponent < 0) {
            System.out.println(1 / result);
            return 1 / result;
        } else {
            System.out.println(result);
            return result;
        }
    }
}
