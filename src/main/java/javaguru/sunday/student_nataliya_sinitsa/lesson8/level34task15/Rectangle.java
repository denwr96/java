package main.java.javaguru.sunday.student_nataliya_sinitsa.lesson8.level34task15;

class Rectangle extends Shape {

    private double length;
    private double height;

    Rectangle(String title, double length, double height) {
        super(title);
        this.length = length;
        this.height = height;
    }

    @Override
    double calculateArea() {
        return length * height;
    }

    @Override
    double calculatePerimeter() {
        return 2 * (length + height);
    }

}
