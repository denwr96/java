package main.java.javaguru.sunday.student_deniss_lobacs.lesson_8.level_4_junior.task16;

class Circle extends Shape {

    private double radius;

    public Circle(String title , double radius) {
        super(title);
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return 3.14 * (radius * radius);
    }

    @Override
    double calculatePerimeter() {
        return 2 * 3.14 * radius;
    }

}