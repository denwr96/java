package main.java.javaguru.sunday.student_sergej_savkin.lesson_10.level_4_junior.task_12;

class KelvinConverter implements TemperatureConverter {

    @Override
    public double convert(double celsiusTemperature) {
        return celsiusTemperature + 273.15;
    }

}