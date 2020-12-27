package javaguru.sunday.student_konstantin_shestakov.lesson_10.level_4.task_12;

import javaguru.sunday.student_deniss_lobacs.lesson_10.homework.level_4_junior.TemperatureConverter;
import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class FahrenheitConverter implements TemperatureConverter {

    @Override
    public double convert(double celsiusTemperature) {
        return 1.8 * celsiusTemperature + 32;
    }
}
