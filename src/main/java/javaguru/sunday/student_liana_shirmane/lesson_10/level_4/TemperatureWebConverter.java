package main.java.javaguru.sunday.student_liana_shirmane.lesson_10.level_4;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;
import main.java.javaguru.sunday.teacher.annotations.CodeReviewComment;

//task11
@CodeReview(approved = false)
@CodeReviewComment(comment = "Переменные с большой буквы.")
public class TemperatureWebConverter {

    double Kelvin(double Celsius) {
        double result = Celsius + 273.15;
        return result;
    }

    double Fahrenheit(double Celsius) {
        double result = (Celsius * 9 / 5) + 32;
        return result;
    }


    public static void main(String[] args) {
        TemperatureWebConverter temperatureWebConverter = new TemperatureWebConverter();
        double TemperatureKelvin = temperatureWebConverter.Kelvin(20);
        double TemperatureFahrenheit = temperatureWebConverter.Fahrenheit(20);
    }
}
