package main.java.javaguru.sunday.student_anna_aleksejeva.lesson_10.task_12;

class KelvinConverter implements TemperatureConverter {

    @Override
    public double convert(double celsiusTemperature) {
        return celsiusTemperature + 273.15;
    }
    }
