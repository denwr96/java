package main.java.javaguru.sunday.student_anna_aleksejeva.lesson_8.task_15_to_19;

abstract class Shape {
    private String title;

    Shape(String title) {
        this.title = title;
    }

    abstract double calculateArea();
    abstract double calculatePerimeter();
}
