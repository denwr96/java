package main.java.javaguru.sunday.student_konstantin_shestakov.lesson_10.level_4.task_12;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class TemperatureConverterTest {

    public static void main(String[] args) {
        TemperatureConverterTest temperatureConverterTest = new TemperatureConverterTest();
        temperatureConverterTest.temperatureConverterTest();
    }

    void temperatureConverterTest() {
        TemperatureConverter fahrenheitConverter = new FahrenheitConverter();
        TemperatureConverter kelvinConverter = new KelvinConverter();
        checkResults(fahrenheitConverter.convert(1) == 33.8, "Fahrenheit converter test");
        checkResults(kelvinConverter.convert(1) == 274.15, "Kelvin converter test");
    }

    public boolean checkResults(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK");
            return condition;
        } else {
            System.out.println(testName + " = FAIL");
            return !condition;
        }
    }
}
