package javaguru.sunday.student_nataliya_sinitsa.lesson10.level4.tesk12;

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class FahrenheitConverter implements TemperatureConverter {

    @Override
    public double convert(double celsiusTemperature) {
        return 1.8 * celsiusTemperature + 32;
    }

}
