package javaguru.sunday.student_deniss_lobacs.lesson_8.level_5_middle;

import javaguru.sunday.student_deniss_lobacs.lesson_8.level_4_junior.task15.Shape;
import javaguru.sunday.student_deniss_lobacs.lesson_8.level_4_junior.task16.Circle;
import javaguru.sunday.student_deniss_lobacs.lesson_8.level_4_junior.task17.Square;
import javaguru.sunday.student_deniss_lobacs.lesson_8.level_4_junior.task18.Rectangle;
import javaguru.sunday.student_deniss_lobacs.lesson_8.level_4_junior.task19.Triangle;
import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Random;
// task20, task21, task22, task23, task24, task25, task26, task27
@CodeReview(approved = true)
public class ShapeUtil {

    public Circle createRandomCircle() {
        Random random = new Random();
        double radius = random.nextInt(10);
        return new Circle("Circle", radius);
    }

    public Square createRandomSquare() {
        Random random = new Random();
        double side = random.nextInt(10);
        return new Square("Square", side);
    }

    public Rectangle createRandomRectangle() {
        Random random = new Random();
        double sideOne = random.nextInt(10);
        double sideTwo = random.nextInt(10);
        double sideThree = random.nextInt(10);
        return new Rectangle("Rectangle", sideOne, sideTwo, sideThree);
    }

    public Triangle createRandomTriangle() {
        Random random = new Random();
        double side = random.nextInt(10);
        return new Triangle("Triangle", side);
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

    public double calculateArea(Shape[] shapes) {
        double result = 0;
        for (int i = 0; i < shapes.length; i++) {
            result += shapes[i].calculateArea();
        }
        return result;
    }

    public double calculatePerimeter(Shape[] shapes) {
        double result = 0;
        for (int i = 0; i < shapes.length; i++) {
            result += shapes[i].calculatePerimeter();
        }
        return result;
    }

    public double calculateArea(Shape shape) {
        return shape.calculateArea();
    }

    public double calculatePerimeter(Shape shape) {
        return shape.calculatePerimeter();
    }
}
