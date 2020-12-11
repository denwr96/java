package main.java.javaguru.sunday.student_jelena_lavrenuka.lesson_10.task_11;

class KelvinsConverter implements TemperatureConverter{
    @Override
    public double temperatureConverter(double degree) {
        return degree + 273.15;
    }
}
