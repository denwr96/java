package main.java.javaguru.sunday.student_konstantin_shestakov.lesson_8.level_4_and_5;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

// Task 15 - 19 (level 4);
@CodeReview(approved = true)
abstract class Shape {

    private String title;

    Shape(String title) {
        this.title = title;
    }

    abstract double calculateArea();

    abstract double calculatePerimeter();

}
