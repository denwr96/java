package javaguru.sunday.student_konstantin_shestakov.lesson_8.level_4_and_5;

// Task 20 - 27 (level 5)

import javaguru.sunday.teacher.annotations.CodeReview;
import javaguru.sunday.teacher.annotations.CodeReviewComment;

import java.util.Random;

@CodeReview(approved = true)
@CodeReviewComment(comment = "В качестве цикла можно было использовать расширенный for")
class ShapeUtil {

    Random random = new Random();
    int radius;

    Circle createRandomCircle() {
        radius = random.nextInt(10);
        return new Circle("Random circle", radius);
    }

//    int getRadius() {
//        System.out.println("Radius = " + radius);
//        return radius;
//    }

    Square createRandomSquare() {
        return new Square("Random square", random.nextInt(10));
    }

    Rectangle createRandomRectangle() {
        return new Rectangle("Random rectangle", random.nextInt(10), random.nextInt(10));
    }

    Triangle createRandomTriangle() {
        return new Triangle("Random triangle", random.nextInt(10));
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
        double sum = 0;

        for (int i = 0; i < shapes.length; i++) {
//            System.out.println("Shape " + (i + 1) + " area = " + shapes[i].calculateArea());
            sum = sum + shapes[i].calculateArea();
        }
        return sum;
    }

    double calculatePerimeter(Shape[] shapes) {
        double sum = 0;

        for (int i = 0; i < shapes.length; i++) {
            sum = sum + shapes[i].calculatePerimeter();
        }
        return sum;
    }

    double calculateArea(Shape shape) {
        return shape.calculateArea();
    }

    double calculatePerimeter(Shape shape) {
        return shape.calculatePerimeter();
    }

    public static void main(String[] args) {
        ShapeUtil shapeUtil = new ShapeUtil();
        shapeUtil.createRandomCircle();
        shapeUtil.createRandomSquare();
    }
}
