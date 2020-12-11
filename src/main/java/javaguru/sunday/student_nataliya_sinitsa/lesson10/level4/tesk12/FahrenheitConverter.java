package main.java.javaguru.sunday.student_nataliya_sinitsa.lesson10.level4.tesk12;

class FahrenheitConverter implements TemperatureConverter {

    @Override
    public double convert(double celsiusTemperature) {
        return 1.8 * celsiusTemperature + 32;
    }

}
