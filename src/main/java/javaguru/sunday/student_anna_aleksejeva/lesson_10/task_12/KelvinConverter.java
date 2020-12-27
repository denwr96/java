package javaguru.sunday.student_anna_aleksejeva.lesson_10.task_12;

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class KelvinConverter implements TemperatureConverter {

    @Override
    public double convert(double celsiusTemperature) {
        return celsiusTemperature + 273.15;
    }
}
