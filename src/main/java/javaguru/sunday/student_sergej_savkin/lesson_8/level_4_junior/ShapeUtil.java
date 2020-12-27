package javaguru.sunday.student_sergej_savkin.lesson_8.level_4_junior;

//task_20
//task_21
//task_22
//task_23
//task_24
//task_25
//task_26
//task_27

import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Random;
@CodeReview(approved = true)
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
        double allArea = 0;
        for (int i = 0; i < shapes.length; i++) {
            allArea += shapes[i].calculateArea();
        }
        return allArea;
    }

    double calculatePerimeter(Shape[] shapes) {
        double allPerimeter = 0;
        for (int i = 0; i < shapes.length; i++) {
            allPerimeter += shapes[i].calculatePerimeter();
        }
        return allPerimeter;
    }

    double calculateArea(Shape shape) {
        return shape.calculateArea();
    }

    double calculatePerimeter(Shape shape) {
        return shape.calculatePerimeter();
    }
}
