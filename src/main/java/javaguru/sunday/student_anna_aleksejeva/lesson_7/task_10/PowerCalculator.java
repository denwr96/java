package main.java.javaguru.sunday.student_anna_aleksejeva.lesson_7.task_10;

public class PowerCalculator {
        public double power (int number, int degree){
            double result = 1.00;
            for (int i = 0; i < degree; i++) {
                result = result * number;
            } return result;
        }
    }
