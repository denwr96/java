package main.java.javaguru.sunday.student_artjom_proshkin.lesson_7.level_6_middle.task_10;


class PowerCalculator {

    double calculatePowerNumber(double base, double power) {
        double result = 1;
        if (power > 0 && base != 0) {
            for (int i = 0; i < power; i++) {
                result = result * base;
            }
        } else if (power < 0 && base != 0) {
            for (int i = 0; i > power; i--) {
                result = result / base;
            }
        } else if (power == 0) {
            return 1;
        }
        return result;
    }
}
