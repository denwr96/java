package main.java.javaguru.sunday.student_deniss_lobacs.lesson_8.level_4_junior.task15;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
public abstract class Shape {

    private String title;

    public Shape(String title) {
        this.title = title;
    }

    public abstract double calculateArea();
    public abstract double calculatePerimeter();
}
