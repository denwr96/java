package main.java.javaguru.sunday.student_natalia_kochkina.lesson_10.level_4;

//Task_12

class FahrenheitConverter implements TemperatureConverter {

    @Override
    public double convert(double celsiusTemperature) {
        return 1.8 * celsiusTemperature + 32;
    }
}
