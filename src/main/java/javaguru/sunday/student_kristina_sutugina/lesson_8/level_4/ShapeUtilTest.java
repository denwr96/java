package main.java.javaguru.sunday.student_kristina_sutugina.lesson_8.level_4;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

//Task_28
@CodeReview(approved = true)
class ShapeUtilTest {
    public static void main(String[] args) {
        ShapeUtil shapeUtil = new ShapeUtil();
        Shape[] shapes = new Shape[4];
        shapes[0] = shapeUtil.createRandomCircle();
        shapes[1] = shapeUtil.createRandomSquare();
        shapes[2] = shapeUtil.createRandomRectangle();
        shapes[3] = shapeUtil.createRandomTriangle();
        System.out.println(shapeUtil.calculateArea(shapes));
        System.out.println(shapeUtil.calculatePerimeter(shapes));
    }
}
