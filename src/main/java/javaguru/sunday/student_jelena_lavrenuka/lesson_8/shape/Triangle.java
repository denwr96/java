package javaguru.sunday.student_jelena_lavrenuka.lesson_8.shape;

import javaguru.sunday.teacher.annotations.CodeReview;

// lesson_8 task_19
@CodeReview(approved = true)
class Triangle extends Shape{
    private double sideLength;


    Triangle(double sideLength) {
        super("Triangle");
        this.sideLength = sideLength;
    }

    @Override
    double calculateArea() {
        double areaTriangle = ((sideLength * sideLength) * Math.sqrt(3)) / 4;
        return areaTriangle;
    }

    @Override
    double calculatePerimeter() {
        double perimeterTriangle = sideLength * 3;
        return perimeterTriangle;
    }
}
