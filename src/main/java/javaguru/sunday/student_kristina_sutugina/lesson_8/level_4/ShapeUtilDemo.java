package main.java.javaguru.sunday.student_kristina_sutugina.lesson_8.level_4;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

//Task_27
@CodeReview(approved = true)
class ShapeUtilDemo {
    public static void main(String[] args) {
        ShapeUtil shapeUtil = new ShapeUtil();
        Shape circle = shapeUtil.createRandomCircle();
        double circleArea = shapeUtil.calculateArea(circle);
        System.out.println(circleArea);
        double circlePerimeter = shapeUtil.calculatePerimeter(circle);
        System.out.println(circlePerimeter);

        Shape square = shapeUtil.createRandomSquare();
        double squareArea = shapeUtil.calculateArea(square);
        System.out.println(squareArea);
        double squarePerimeter = shapeUtil.calculatePerimeter(square);
        System.out.println(squarePerimeter);

        Shape rectangle = shapeUtil.createRandomRectangle();
        double rectangleArea = shapeUtil.calculateArea(rectangle);
        System.out.println(rectangleArea);
        double rectanglePerimeter = shapeUtil.calculatePerimeter(rectangle);
        System.out.println(rectanglePerimeter);

        Shape triangle = shapeUtil.createRandomTriangle();
        double triangleArea = shapeUtil.calculateArea(triangle);
        System.out.println(triangleArea);
        double trianglePerimeter = shapeUtil.calculatePerimeter(triangle);
        System.out.println(trianglePerimeter);

        Shape random = shapeUtil.createRandomShape();
        double randomArea = shapeUtil.calculateArea(random);
        System.out.println(randomArea);
        double randomPerimeter = shapeUtil.calculatePerimeter(random);
        System.out.println(randomPerimeter);
    }
}
