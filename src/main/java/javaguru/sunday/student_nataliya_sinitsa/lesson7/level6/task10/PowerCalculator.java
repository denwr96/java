package main.java.javaguru.sunday.student_nataliya_sinitsa.lesson7.level6.task10;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class PowerCalculator {

    public double numberIntoPower (double number, int power) {
        double result = 1;
        if (power >= 0) {
            for (int i = 0; i < power; i++) {
                result = result * number;
            }
        } else if (number != 0) {
            for (int i = 0; i > power; i--) {
                result = result / number;
            }
        }
        else {
            result = 0;
            System.out.println("ERROR! Not possible to raise zero into negative power!");
        }
        return result;
    }

}
