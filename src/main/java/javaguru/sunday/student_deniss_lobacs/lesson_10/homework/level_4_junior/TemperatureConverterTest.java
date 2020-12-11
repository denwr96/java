package main.java.javaguru.sunday.student_deniss_lobacs.lesson_10.homework.level_4_junior;

public class TemperatureConverterTest {

    public static void main(String[] args) {
        TemperatureConverterTest temperatureConverterTest = new TemperatureConverterTest();
        temperatureConverterTest.temperatureConverterFromCelsiusToKelvinTestShouldReturnTrue();
        temperatureConverterTest.temperatureConverterFromCelsiusToKelvinTestShouldReturnFalse();
        temperatureConverterTest.temperatureConverterFromCelsiusToFahrenheitTestShouldReturnTrue();
        temperatureConverterTest.temperatureConverterFromCelsiusToFahrenheitTestShouldReturnFalse();
    }

    public void temperatureConverterFromCelsiusToKelvinTestShouldReturnTrue() {
        TemperatureConverter victim = new KelvinConverter();
        checkResults(victim.convert(50) == 323.15, "temperatureConverterFromCelsiusToKelvinTestShouldReturnTrue");
    }

    public void temperatureConverterFromCelsiusToKelvinTestShouldReturnFalse() {
        TemperatureConverter victim = new KelvinConverter();
        checkResults(victim.convert(50) == 122, "temperatureConverterFromCelsiusToKelvinTestShouldReturnFalse");
    }

    public void temperatureConverterFromCelsiusToFahrenheitTestShouldReturnTrue() {
        TemperatureConverter victim = new FahrenheitConverter();
        checkResults(victim.convert(50) == 122, "temperatureConverterFromCelsiusToFahrenheitTestShouldReturnTrue");
    }

    public void temperatureConverterFromCelsiusToFahrenheitTestShouldReturnFalse() {
        TemperatureConverter victim = new FahrenheitConverter();
        checkResults(victim.convert(50) == 323.15, "temperatureConverterFromCelsiusToFahrenheitTestShouldReturnFalse");
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
