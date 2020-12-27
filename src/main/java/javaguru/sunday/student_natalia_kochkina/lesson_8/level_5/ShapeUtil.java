package javaguru.sunday.student_natalia_kochkina.lesson_8.level_5;

//Task_20, 21, 22, 23, 24, 25, 26, 27

import javaguru.sunday.student_natalia_kochkina.lesson_8.level_4.*;
import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Random;

@CodeReview(approved = true)
public class ShapeUtil {

    public Circle createRandomCircle() {
        Random random = new Random();
        double radius = random.nextDouble();
        Circle circle = new Circle("randomCircle", radius);
        return circle;
    }

    public Square createRandomSquare() {
        Random random = new Random();
        double side = random.nextDouble();
        Square square = new Square("randomCircle", side);
        return square;
    }

    public Rectangle createRandomRectangle() {
        Random random = new Random();
        double lenght = random.nextDouble();
        double width = random.nextDouble();
        Rectangle rectangle = new Rectangle("randomRectangle", lenght, width);
        return rectangle;
    }

    public Triangle createRandomTriangle() {
        Random random = new Random();
        double side = random.nextDouble();
        Triangle triangle = new Triangle("randomTriangle", side);
        return triangle;
    }

    public Shape createRandomShape() {
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
        double areaOfShapes = 0;
        for (int i = 0; i < shapes.length; i++) {
            Shape shape = shapes[i];
            areaOfShapes = areaOfShapes + shape.calculateArea();
        }
        return areaOfShapes;
    }

    double calculatePerimeter(Shape[] shapes) {
        double perimeterOfShapes = 0;
        for (int i = 0; i < shapes.length; i++) {
            Shape shape = shapes[i];
            perimeterOfShapes = perimeterOfShapes + shape.calculateArea();
        }
        return perimeterOfShapes;
    }

    double calculateArea(Shape shape) {
        return shape.calculateArea();
    }

    double calculatePerimeter(Shape shape) {
        return shape.calculatePerimeter();
    }
}
