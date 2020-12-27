package javaguru.sunday.student_artjom_proshkin.lesson_10.level_4_junior.task_11;

class ConverterOfTemperature implements TemperatureConverter{

    @Override
    public double makeItKelvin(double celsiusTemperature) {
        return celsiusTemperature + 273.15;
    }

    @Override
    public double makeItFahrenheit(double celsiusTemperature) {
        return (celsiusTemperature * 1.8 + 32);
    }
}
