package javaguru.sunday.student_deniss_lobacs.lesson_10.homework.level_4_junior;

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class FahrenheitConverter implements TemperatureConverter {

    @Override
    public double convert(double celsiusTemperature) {
        return 1.8 * celsiusTemperature + 32;
    }

}
