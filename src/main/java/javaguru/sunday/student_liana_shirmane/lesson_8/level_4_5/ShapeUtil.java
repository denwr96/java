package javaguru.sunday.student_liana_shirmane.lesson_8.level_4_5;
//task20
//task21
//task22
//task23
//task24
//task25
//task26
//task27


import java.util.Random;

public class ShapeUtil {
    Random random = new Random();

    Circle createRandomCircle() {
        double radius = random.nextDouble();
        return new Circle(radius);
    }

    Square createRandomSquare() {
        double side = random.nextDouble();
        return new Square(side);
    }

    Rectangle createRandomRectangle() {
        double sideA = random.nextDouble();
        double sideB = random.nextDouble();
        return new Rectangle(sideA, sideB);
    }

    Triangle createRandomTriangle() {
        double side = random.nextDouble();
        return new Triangle(side);
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
        double preSum;
        double Sum = 0;
        int i;
        for (i = 0; i < shapes.length; i++) {
            preSum = shapes[i].calculateArea();
            Sum = preSum + Sum;
        }
        return Sum;
    }

    double calculatePerimeter(Shape[] shapes) {
        double preSum;
        double Sum = 0;
        int i;
        for (i = 0; i < shapes.length; i++) {
            preSum = shapes[i].calculatePerimeter();
            Sum = preSum + Sum;
        }
        return Sum;
    }

    double calculateArea(Shape shape) {
        return shape.calculateArea();
    }

    double calculatePerimeter(Shape shape) {
        return shape.calculatePerimeter();
    }
}

