package javaguru.sunday.student_kristina_sutugina.lesson_8.level_4;

import javaguru.sunday.teacher.annotations.CodeReview;

//Task_15
@CodeReview(approved = true)
abstract class Shape {

    private String title;

    Shape(String title) {
        this.title = title;
    }


    abstract double calculateArea();

    abstract double calculatePerimeter();

}

