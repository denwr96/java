package main.java.javaguru.sunday.student_jelena_lavrenuka.lesson_8.task_13;

class Triangle extends Shape{
    double sideLength;
    double heigth;

    public Triangle(String shapeName) {
        super(shapeName);
        this.heigth = heigth;
        this.sideLength = sideLength;
    }

    @Override
    void shapeArea() {
        double shapeArea = 0.5 * sideLength * heigth;
        System.out.println("Triangles area is " + shapeArea);
    }
}
