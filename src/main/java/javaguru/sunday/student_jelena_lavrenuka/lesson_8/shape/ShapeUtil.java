package main.java.javaguru.sunday.student_jelena_lavrenuka.lesson_8.shape;

// lesson_8 task_20
// lesson_8 task_21
// lesson_8 task_22
// lesson_8 task_23
// lesson_8 task_24
// lesson_8 task_25
// lesson_8 task_26
// lesson_8 task_27

import java.util.Random;

class ShapeUtil {
    Random myRandom = new Random();

    Circle createRandomCircle(){
        double radius = myRandom.nextDouble();
        return new Circle(radius);
    }

    Square createRandomSquare(){
        double sideLength = myRandom.nextDouble();
        return new Square(sideLength);
    }

    Rectangle createRandomRectangle(){
        double rectangleLength = myRandom.nextDouble();
        double rectangleHeigth = myRandom.nextDouble();
        return new Rectangle(rectangleLength, rectangleHeigth);
    }

    Triangle createRandomTriangle(){
        double sideLength = myRandom.nextDouble();
        return new Triangle(sideLength);
    }

    Shape createRandomShape() {
        int randomNumber = myRandom.nextInt(4);
        if (randomNumber == 0) {
            return createRandomCircle();
        } else if (randomNumber == 1) {
            return createRandomSquare();
        } else if (randomNumber == 2) {
            return createRandomRectangle();
        } else {
            return createRandomTriangle();
        }
    }

    double calculateArea(Shape[] shapes){
        double sum;
        double totalSum = 0;
        for (int i = 0; i < shapes.length; i++) {
            sum = shapes[i].calculateArea();
            totalSum = totalSum + sum;
        }
        return totalSum;
    }

    double calculatePerimeter(Shape[] shapes){
        double sum;
        double totalSum = 0;
        for (int i = 0; i < shapes.length; i++) {
            sum = shapes[i].calculatePerimeter();
            totalSum = totalSum + sum;
        }
        return totalSum;
    }

    double calculateArea(Shape shape) {
        return shape.calculateArea();
    }

    double calculatePerimeter(Shape shape) {
        return shape.calculatePerimeter();
    }
}
