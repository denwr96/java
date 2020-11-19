package main.java.javaguru.sunday.student_jelena_lavrenuka.lesson_8.shape;

// lesson_8 task_16

class Circle extends Shape {

    private double radius;

    Circle(double radius) {
        super("Circle");
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        double areaCircle = Math.PI * (radius * radius);
        return areaCircle;
    }

    @Override
    double calculatePerimeter() {
        double perimeterCircle = 2 * Math.PI * radius;
        return perimeterCircle;
    }
}