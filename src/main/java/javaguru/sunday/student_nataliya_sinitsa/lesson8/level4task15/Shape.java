package main.java.javaguru.sunday.student_nataliya_sinitsa.lesson8.level4task15;

abstract class Shape {

    private String title;

    Shape(String title) {
        this.title = title;
    }

    abstract double calculateArea();

    abstract double calculatePerimeter();

}
