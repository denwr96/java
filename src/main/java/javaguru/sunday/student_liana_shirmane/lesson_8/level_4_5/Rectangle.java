package main.java.javaguru.sunday.student_liana_shirmane.lesson_8.level_4_5;
//task18

class Rectangle extends Shape {

    private double sideA;
    private double sideB;

    Rectangle (double sideA, double sideB){
        super("Rectangle");
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    double calculateArea() {
        double areaRectangle = sideA*sideB;
        return areaRectangle;
    }

    @Override
    double calculatePerimeter() {
        double perimeterRectangle = sideA*2 + sideB*2;
        return perimeterRectangle;
    }
}
