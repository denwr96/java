package main.java.javaguru.sunday.student_liana_shirmane.lesson_8.level_4_5;
//task16
import java.lang.Math;

class Circle extends Shape {

    private double radius;

    Circle(double radius) {
        super ("Circle");
        this.radius = radius;
    }
    @Override
    double calculateArea(){
        double areaCircle = Math.PI*radius*radius;
        return areaCircle;
    }
    @Override
    double calculatePerimeter(){
        double perimeterCircle = 2*Math.PI*radius;
        return perimeterCircle;
    }

}
