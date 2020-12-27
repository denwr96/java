package javaguru.sunday.student_natalia_kochkina.lesson_10.level_4;

import javaguru.sunday.teacher.annotations.CodeReview;

//Task_12
@CodeReview(approved = true)
public class TemperatureConverterTest {
    public static void main(String[] args) {
        TemperatureConverterTest temperatureConverterTest = new TemperatureConverterTest();
        temperatureConverterTest.FahrenheitTest();
        temperatureConverterTest.KelvinTest();
    }

    public void FahrenheitTest() {
        TemperatureConverter temperatureConverter = new FahrenheitConverter();
        double fahrenheitTemperature = temperatureConverter.convert(10);
        double expectedTemperature = 50;
        if (expectedTemperature == fahrenheitTemperature) {
            System.out.println("FahrenheitTest OK");
        } else {
            System.out.println("FahrenheitTest Failed");
        }
    }

    public void KelvinTest() {
        TemperatureConverter temperatureConverter = new KelvinConverter();
        double kelvinTemperature = temperatureConverter.convert(2);
        double expectedTemperature = 275.15;
        if (expectedTemperature == kelvinTemperature) {
            System.out.println("KelvinTest OK");
        } else {
            System.out.println("KelvinTest Failed");
        }
    }
}
