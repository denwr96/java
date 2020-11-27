package main.java.javaguru.sunday.student_konstantin_shestakov.lesson_8.level_4_and_5;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

// Task 27 (level 5)
@CodeReview(approved = true)
class ShapeDemo {

    public static void main(String[] args) {
        ShapeUtil shapeUtil = new ShapeUtil();
        Shape circle = shapeUtil.createRandomCircle();
        double circleArea = shapeUtil.calculateArea(circle);
        double circlePerimeter = shapeUtil.calculatePerimeter(circle);

        Shape square = shapeUtil.createRandomSquare();
        double squareArea = shapeUtil.calculateArea(square);
        double squarePerimeter = shapeUtil.calculatePerimeter(square);

        Shape rectangle = shapeUtil.createRandomRectangle();
        double rectangleArea = shapeUtil.calculateArea(rectangle);
        double rectanglePerimeter = shapeUtil.calculatePerimeter(rectangle);

        Shape triangle = shapeUtil.createRandomTriangle();
        double triangleArea = shapeUtil.calculateArea(triangle);
        double trianglePerimeter = shapeUtil.calculatePerimeter(triangle);

        Shape randomShape = shapeUtil.createRandomShape();
        double randomShapeArea = shapeUtil.calculateArea(randomShape);
        double randomShapePerimeter = shapeUtil.calculatePerimeter(randomShape);
    }

}
