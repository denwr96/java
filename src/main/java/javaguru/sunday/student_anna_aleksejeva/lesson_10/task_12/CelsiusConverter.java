package javaguru.sunday.student_anna_aleksejeva.lesson_10.task_12;

import javaguru.sunday.teacher.annotations.CodeReview;
import javaguru.sunday.teacher.annotations.CodeReviewComment;

@CodeReview(approved = false)
@CodeReviewComment(comment = "А этот конвертор так и должен работать?" +
        "Просто возвращать поданое значение?")
class CelsiusConverter implements TemperatureConverter{

    @Override
    public double convert(double celsiusTemperature) {
        return celsiusTemperature;
    }
}
