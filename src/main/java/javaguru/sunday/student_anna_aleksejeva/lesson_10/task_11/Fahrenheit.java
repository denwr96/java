package main.java.javaguru.sunday.student_anna_aleksejeva.lesson_10.task_11;

public class Fahrenheit implements Temperature {

    @Override
    public double temperature(double degree) {
        return (degree * 9/5) + 32;
    }
}
