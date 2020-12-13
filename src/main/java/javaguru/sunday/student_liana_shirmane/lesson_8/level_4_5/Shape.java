package main.java.javaguru.sunday.student_liana_shirmane.lesson_8.level_4_5;
//task15
abstract class Shape {

    private String title;

    Shape(String title) {
        this.title = title;
    }

    abstract double calculateArea();
    abstract double calculatePerimeter();

}
