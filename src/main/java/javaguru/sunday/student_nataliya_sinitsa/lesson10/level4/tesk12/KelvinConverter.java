package main.java.javaguru.sunday.student_nataliya_sinitsa.lesson10.level4.tesk12;

class KelvinConverter implements TemperatureConverter {

    @Override
    public double convert(double celsiusTemperature) {
        return celsiusTemperature + 273.15;
    }
}
