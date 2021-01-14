package javaguru.sunday.student_liana_shirmane.lesson_8.level_4_5;

import javaguru.sunday.teacher.annotations.CodeReview;

//task28
@CodeReview(approved = true)
public class ShapeUtilTest {
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

