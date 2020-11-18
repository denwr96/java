package main.java.javaguru.sunday.student_deniss_lobacs.lesson_8.level_4_junior.task18;

public abstract class Shape {

    private String title;

    public Shape(String title) {
        this.title = title;
    }

    abstract double calculateArea();
    abstract double calculatePerimeter();
}
