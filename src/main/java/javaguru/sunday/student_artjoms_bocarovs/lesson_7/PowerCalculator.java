package javaguru.sunday.student_artjoms_bocarovs.lesson_7;

public class PowerCalculator {

    public double exponentiation(double number, int power) {

        double result = 1;

        for (int i = 0; i < power; i++) {
            result = number * result;
        }
        return result;
    }
}
