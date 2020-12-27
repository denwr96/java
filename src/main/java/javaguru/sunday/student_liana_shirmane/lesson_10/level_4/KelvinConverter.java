package javaguru.sunday.student_liana_shirmane.lesson_10.level_4;

import javaguru.sunday.teacher.annotations.CodeReview;

//task12
@CodeReview(approved = true)
class KelvinConverter implements TemperatureConverter {

    @Override
    public double convert(double celsiusTemperature) {
        return celsiusTemperature + 273.15;
    }
}