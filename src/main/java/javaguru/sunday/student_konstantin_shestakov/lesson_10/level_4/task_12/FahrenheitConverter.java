package main.java.javaguru.sunday.student_konstantin_shestakov.lesson_10.level_4.task_12;

class FahrenheitConverter implements TemperatureConverter {

    @Override
    public double convert(double celsiusTemperature) {
        return 1.8 * celsiusTemperature + 32;
    }
}
