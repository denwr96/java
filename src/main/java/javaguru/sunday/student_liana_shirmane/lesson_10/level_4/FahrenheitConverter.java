package javaguru.sunday.student_liana_shirmane.lesson_10.level_4;

import javaguru.sunday.teacher.annotations.CodeReview;

//task12
@CodeReview(approved = true)
class FahrenheitConverter implements TemperatureConverter {

    @Override
    public double convert(double celsiusTemperature) {
        return celsiusTemperature * 1.8 + 32;
    }
}