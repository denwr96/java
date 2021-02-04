package javaguru.sunday.student_liana_shirmane.lesson_8.level_4_5;

import javaguru.sunday.teacher.annotations.CodeReview;

//task27
@CodeReview(approved = true)
public class ShapeUtilDemo {

    public static void main(String[] args) {
        ShapeUtil shapeUtil = new ShapeUtil();

        Shape circle = shapeUtil.createRandomCircle();
        double circleArea = shapeUtil.calculateArea(circle);
        double circlePerimeter = shapeUtil.calculatePerimeter(circle);
        System.out.println(circleArea);
        System.out.println(circlePerimeter);

        Shape square = shapeUtil.createRandomSquare();
        double squareArea = shapeUtil.calculateArea(square);
        double squarePerimeter = shapeUtil.calculatePerimeter(square);
        System.out.println(squareArea);
        System.out.println(squarePerimeter);

        Shape rectangle = shapeUtil.createRandomRectangle();
        double rectangleArea = shapeUtil.calculateArea(rectangle);
        double rectanglePerimeter = shapeUtil.calculatePerimeter(rectangle);
        System.out.println(rectangleArea);
        System.out.println(rectanglePerimeter);

        Shape triangle = shapeUtil.createRandomTriangle();
        double triangleArea = shapeUtil.calculateArea(triangle);
        double trianglePerimeter = shapeUtil.calculatePerimeter(triangle);
        System.out.println(triangleArea);
        System.out.println(trianglePerimeter);
    }
}

