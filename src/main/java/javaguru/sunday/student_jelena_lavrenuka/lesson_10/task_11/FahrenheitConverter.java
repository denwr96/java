package main.java.javaguru.sunday.student_jelena_lavrenuka.lesson_10.task_11;

class FahrenheitConverter implements TemperatureConverter{
    @Override
    public double temperatureConverter(double degree) {
        return (degree * (9/5)) + 32;
    }
}
