package main.java.javaguru.sunday.student_sergej_savkin.lesson_10.level_4_junior.task_12;

class FahrenheitConverter implements TemperatureConverter {
    @Override
    public double convert(double celsiusTemperature) {
        return 1.8 * celsiusTemperature + 32;
    }
}
