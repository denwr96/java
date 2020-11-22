package main.java.javaguru.sunday.student_nataliya_sinitsa.lesson8.level34task15;

// NB! Только для равносторонних треугольников

class Triangle extends Shape {

    private double length;

    Triangle(String title, double length) {
        super(title);
        this.length = length;
    }

    @Override
    double calculateArea() {
        return length * length * Math.sqrt(3) / 4;
    }

    @Override
    double calculatePerimeter() {
        return 3 * length;
    }

}
