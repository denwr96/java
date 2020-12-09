package main.java.javaguru.sunday.student_liana_shirmane.lesson_10.level_4;
//task12

class KelvinConverter implements TemperatureConverter {

    @Override
    public double convert(double celsiusTemperature) {
        return celsiusTemperature + 273.15;
    }
}