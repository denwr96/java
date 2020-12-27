package javaguru.sunday.student_kristina_sutugina.lesson_10.level_4.task_12;

class FahrenheitConverter implements TemperatureConverter {
    @Override
    public double convert(double celsiusTemperature) {
        return (celsiusTemperature*1.8)+32;
    }
}
