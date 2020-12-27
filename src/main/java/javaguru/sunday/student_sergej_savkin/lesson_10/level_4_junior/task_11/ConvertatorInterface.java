package main.java.javaguru.sunday.student_sergej_savkin.lesson_10.level_4_junior.task_11;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
interface ConvertatorInterface {

    double convertToKelvin(double temperatureInCelsius);

    double convertToFahrenheit(double temperatureInCelsius);

}
