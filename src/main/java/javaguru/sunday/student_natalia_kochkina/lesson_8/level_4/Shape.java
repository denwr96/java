package main.java.javaguru.sunday.student_natalia_kochkina.lesson_8.level_4;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

//Task_15
@CodeReview(approved = true)
public abstract class Shape {

    private String title;

    public Shape(String title) {
        this.title = title;
    }

    public abstract double calculateArea();
    public abstract double calculatePerimeter();
}