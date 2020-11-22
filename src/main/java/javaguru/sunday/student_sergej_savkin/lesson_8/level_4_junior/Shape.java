package main.java.javaguru.sunday.student_sergej_savkin.lesson_8.level_4_junior;

//task_15


abstract class Shape {

    private String title;

    Shape(String title) {
        this.title = title;
    }

    abstract double calculateArea();

    abstract double calculatePerimeter();

}