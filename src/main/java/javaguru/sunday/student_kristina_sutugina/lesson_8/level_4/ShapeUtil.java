package main.java.javaguru.sunday.student_kristina_sutugina.lesson_8.level_4;

import java.util.Random;
//Task_20
//Task_21
//Task_22
//Task_23
//Task_24
//Task_25
//Task_26
//Task_27

class ShapeUtil {

    Circle createRandomCircle() {
        Random rnd = new Random();
        double radius = rnd.nextDouble();
        System.out.println("Circle");
        return new Circle(radius);
    }

    Square createRandomSquare() {
        Random rnd = new Random();
        double lengthOfSide = rnd.nextDouble();
        System.out.println("Square");
        return new Square(lengthOfSide);
    }

    Rectangle createRandomRectangle() {
        Random rnd = new Random();
        double length = rnd.nextDouble();
        double width = rnd.nextDouble();
        System.out.println("Rectangle");
        return new Rectangle(length, width);
    }

    Triangle createRandomTriangle() {
        Random rnd = new Random();
        double length = rnd.nextDouble();
        System.out.println("Triangle");
        return new Triangle(length);
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
        double area = 0;
        for (int i = 0; i < shapes.length; i++) {
            area = area + shapes[i].calculateArea();
        }
        return area;
    }

    double calculatePerimeter(Shape[] shapes) {
        double perimeter = 0;
        for (int i = 0; i < shapes.length; i++) {
            perimeter = perimeter+shapes[i].calculatePerimeter();
        }
        return perimeter;
    }

    double calculateArea(Shape shape) {
        return shape.calculateArea();
    }

    double calculatePerimeter(Shape shape) {
        return shape.calculatePerimeter();
    }
}
