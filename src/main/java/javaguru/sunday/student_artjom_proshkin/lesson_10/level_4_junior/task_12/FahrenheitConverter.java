package main.java.javaguru.sunday.student_artjom_proshkin.lesson_10.level_4_junior.task_12;

public class FahrenheitConverter implements TemperatureConverter {

    @Override
    public double convert(double celsiusTemperature) {
        return 1.8 * celsiusTemperature + 32;
    }
}
