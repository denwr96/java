package main.java.javaguru.sunday.student_sergej_savkin.lesson_10.level_4_junior.task_11;

class TemperatureConvertator implements ConvertatorInterface {

    @Override
    public double convertToKelvin(double temperatureInCelsius) {
        double temperatureInKelvin = temperatureInCelsius + 273.15;
        return temperatureInKelvin;
    }

    @Override
    public double convertToFahrenheit(double temperatureInCelsius) {
        double temperatureInFahrenheit = (temperatureInCelsius + 32) + (temperatureInCelsius / 0.5555);
        return temperatureInFahrenheit;
    }
}
