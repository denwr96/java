package javaguru.sunday.student_anna_aleksejeva.lesson_10.task_11;

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class Fahrenheit implements Temperature {

    @Override
    public double temperature(double degree) {
        return (degree * 9/5) + 32;
    }
}
