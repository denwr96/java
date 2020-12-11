package main.java.javaguru.sunday.student_deniss_lobacs.lesson_10.homework.level_4_junior;

public class KelvinConverter implements TemperatureConverter {

    @Override
    public double convert(double celsiusTemperature) {
        return celsiusTemperature + 273.15;
    }

}
