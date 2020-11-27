package main.java.javaguru.sunday.student_artjom_proshkin.lesson_8.level_4_junior;

//Task_19

class Triangle extends Shape {

    private double edgeLength;

    public Triangle(String title, double edgeLength) {
        super(title);
        this.edgeLength = edgeLength;
    }

    @Override
    double calculateArea() {
        return (Math.sqrt(3) / 4) * edgeLength * edgeLength;
    }

    @Override
    double calculatePerimeter() {
        return 3 * edgeLength;
    }
}
