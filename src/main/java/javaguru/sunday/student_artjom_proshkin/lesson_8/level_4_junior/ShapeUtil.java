package main.java.javaguru.sunday.student_artjom_proshkin.lesson_8.level_4_junior;

//Task_20, Task_21, Task_22, Task_23, Task_24, Task_25, Task_26

import java.util.Random;

class ShapeUtil {

    Random random = new Random();

    Circle createRandomCircle() {

        return new Circle("Circle", random.nextDouble());
    }

    Square createRandomSquare() {

        return new Square("Square", random.nextDouble());
    }

    Rectangle createRandomRectangle() {

        return new Rectangle("Rectangle", random.nextDouble(), random.nextDouble());
    }

    Triangle createRandomTriangle() {

        return new Triangle("Triangle", random.nextDouble());
    }

    Shape createRandomShape() {
        Random rnd = new Random();
        int randomNumber = rnd.nextInt(4);
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

    double calculateArea(Shape[] shapes) {
        double totalArea = 0;
        for (Shape shape : shapes) {
            totalArea = totalArea + shape.calculateArea();
        }
        return totalArea;
    }

    double calculatePerimeter(Shape[] shapes) {
        double totalPerimeter = 0;
        for (Shape shape : shapes) {
            totalPerimeter = totalPerimeter + shape.calculatePerimeter();
        }
        return totalPerimeter;
    }

    double calculateArea(Shape shape) {
        return shape.calculateArea();
    }

    double calculatePerimeter(Shape shape) {
        return shape.calculatePerimeter();
    }

}
