package main.java.javaguru.sunday.student_natalia_kochkina.lesson_10.level_4;

//Task_12

class KelvinConverter implements TemperatureConverter {

    @Override
    public double convert(double celsiusTemperature) {
        return celsiusTemperature + 273.15;
    }
}