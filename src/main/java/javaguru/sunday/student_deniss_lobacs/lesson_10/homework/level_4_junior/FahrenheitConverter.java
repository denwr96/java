package main.java.javaguru.sunday.student_deniss_lobacs.lesson_10.homework.level_4_junior;

public class FahrenheitConverter implements TemperatureConverter {

    @Override
    public double convert(double celsiusTemperature) {
        return 1.8 * celsiusTemperature + 32;
    }

}
