package main.java.javaguru.sunday.student_kristina_sutugina.lesson_8.level_4;
//Task_17
class Square extends Shape {
    private double lengthOfSide;

    Square(double lengthOfSide) {
        super("Square");
        this.lengthOfSide = lengthOfSide;
    }

    @Override
    double calculateArea() {
        double area = lengthOfSide * lengthOfSide;
        return area;
    }

    @Override
    double calculatePerimeter() {
        double perimeter = lengthOfSide * 4;
        return perimeter;
    }
}
