package main.java.javaguru.sunday.student_konstantin_shestakov.lesson_7.level_6.task_10;

// Task 10

class PowerCalculator {

    double exponentiation(double number, int exponent) {
        double result = 1;

        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        System.out.println(result);
            return result;
    }
}
