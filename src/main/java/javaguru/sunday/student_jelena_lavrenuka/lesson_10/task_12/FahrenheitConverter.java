package main.java.javaguru.sunday.student_jelena_lavrenuka.lesson_10.task_12;

class FahrenheitConverter implements TemperatureConverter{
    @Override
    public double convert(double celsiusTemperature) {
        return 1.8 * celsiusTemperature + 32;
    }
}
