package main.java.javaguru.sunday.student_natalia_kochkina.lesson_8.level_5;

//Task_28

import main.java.javaguru.sunday.student_natalia_kochkina.lesson_8.level_4.Shape;

public class ShapeUtilTest {

    public static void main(String[] args) {
        ShapeUtilTest shapeUtilTest = new ShapeUtilTest();
        shapeUtilTest.shouldCalculatePerimeterTest();
        shapeUtilTest.shouldCalculateAreaTest();
    }

    public void shouldCalculatePerimeterTest() {
        ShapeUtil shapeUtil = new ShapeUtil();

        Shape[] shapes = new Shape[4];
        shapes[0] = shapeUtil.createRandomCircle();
        shapes[1] = shapeUtil.createRandomSquare();
        shapes[2] = shapeUtil.createRandomRectangle();
        shapes[3] = shapeUtil.createRandomTriangle();

        double perimeter = shapeUtil.calculatePerimeter(shapes);
        if (perimeter != 0) {
            System.out.println("Perimeter test Ok");
        } else {
            System.out.println("Perimeter test Failed");
        }
    }

    public void shouldCalculateAreaTest() {
        ShapeUtil shapeUtil = new ShapeUtil();

        Shape[] shapes = new Shape[4];
        shapes[0] = shapeUtil.createRandomCircle();
        shapes[1] = shapeUtil.createRandomSquare();
        shapes[2] = shapeUtil.createRandomRectangle();
        shapes[3] = shapeUtil.createRandomTriangle();

        double area = shapeUtil.calculateArea(shapes);
        if (area != 0) {
            System.out.println("Area test Ok");
        } else {
            System.out.println("Area test Failed");
        }
    }
}
