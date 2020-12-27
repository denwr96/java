package javaguru.sunday.student_konstantin_shestakov.lesson_10.level_4.task_11;

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class ConvertTemperature {

    double convertTemperatureCelsiusToFahrenheit(double temperatureCelsius) {
        return temperatureCelsius * 1.8 + 32;
    }

    double convertTemperatureCelsiusToKelvin(double temperatureCelsius) {
        return temperatureCelsius + 273.15;
    }

    public static void main(String[] args) {
        ConvertTemperature convertTemperature = new ConvertTemperature();
        double temperatureFahrenheit = convertTemperature.convertTemperatureCelsiusToFahrenheit(15);
        double temperatureKelvin = convertTemperature.convertTemperatureCelsiusToKelvin(15);
    }
}
