package main.java.javaguru.sunday.student_deniss_lobacs.lesson_8.level_5_middle;

import main.java.javaguru.sunday.student_deniss_lobacs.lesson_8.level_4_junior.task15.Shape;
// task27
public class ShapeUtilDemo {
    public static void main(String[] args) {

        ShapeUtil shapeUtil = new ShapeUtil();
        Shape square = shapeUtil.createRandomSquare();

        double squareArea = shapeUtil.calculateArea(square);
        double squarePerimeter = shapeUtil.calculatePerimeter(square);

        System.out.println(squareArea);
        System.out.println(squarePerimeter);

    }
}
