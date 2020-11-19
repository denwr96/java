package main.java.javaguru.sunday.student_jelena_lavrenuka.lesson_8.shape;

// lesson_8 task_18

class Rectangle extends Shape{
    private double rectangleLength;
    private double rectangleHeigth;

    Rectangle(double rectangleLength, double rectangleHeigth) {
        super("Rectangle");
        this.rectangleLength = rectangleLength;
        this.rectangleHeigth = rectangleHeigth;
    }

    @Override
    double calculateArea() {
        double areaRectangle = rectangleLength * rectangleHeigth;
        return areaRectangle;
    }

    @Override
    double calculatePerimeter() {
        double perimeterRectangle = (rectangleLength + rectangleHeigth) * 2;
        return perimeterRectangle;
    }
}
