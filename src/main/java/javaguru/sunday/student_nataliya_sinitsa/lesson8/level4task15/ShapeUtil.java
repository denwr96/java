package main.java.javaguru.sunday.student_nataliya_sinitsa.lesson8.level4task15;

import java.util.Random;

// Task 20 - > Task 28

class ShapeUtil {

    Random random = new Random();

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
        double shapesArea = 0;
        for (Shape shape : shapes) {
            shapesArea = shapesArea + shape.calculateArea();
        }
        return shapesArea;
    }

    double calculatePerimeter(Shape[] shapes) {
        double shapesPerimeter = 0;
        for (Shape shape : shapes) {
            shapesPerimeter = shapesPerimeter + shape.calculatePerimeter();
        }
        return shapesPerimeter;
    }

    double calculateArea(Shape shape) {
        return shape.calculateArea();
    }

    double calculatePerimeter(Shape shape) {
        return shape.calculatePerimeter();
    }

    Circle createRandomCircle() {
        double randomRadius = random.nextDouble();
        return new Circle("Random circle", randomRadius);
    }

    Square createRandomSquare() {
        double randomLength = random.nextDouble();
        return new Square("Random square", randomLength);
    }

    Rectangle createRandomRectangle() {
        double randomLength = random.nextDouble();
        double randomHeight = random.nextDouble();
        return new Rectangle("Random rectangle", randomLength, randomHeight);
    }

    Triangle createRandomTriangle() {
        double randomLength = random.nextDouble();
        return new Triangle("Random triangle", randomLength);
    }

}
