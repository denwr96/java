package main.java.javaguru.sunday.student_anna_aleksejeva.lesson_10.task_11;

public class Kelvins implements Temperature {

    @Override
    public double temperature(double degree) {
        return degree + 273.15;
    }
}
