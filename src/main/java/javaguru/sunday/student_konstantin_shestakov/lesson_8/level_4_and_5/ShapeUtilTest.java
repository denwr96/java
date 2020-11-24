package main.java.javaguru.sunday.student_konstantin_shestakov.lesson_8.level_4_and_5;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

// Task 28
@CodeReview(approved = true)
class ShapeUtilTest {

    public static void main(String[] args) {
        ShapeUtilTest shapeUtilTest = new ShapeUtilTest();
        shapeUtilTest.calculateAreaTest();
        shapeUtilTest.calculatePerimeterTest();
    }

    void calculateAreaTest() {
        ShapeUtil shapeUtil = new ShapeUtil();
        Shape[] shapes = new Shape[4];
        shapes[0] = shapeUtil.createRandomCircle();
//        shapeUtil.getRadius();
        shapes[1] = shapeUtil.createRandomSquare();
        shapes[2] = shapeUtil.createRandomRectangle();
        shapes[3] = shapeUtil.createRandomTriangle();
        double resultArea = shapeUtil.calculateArea(shapes);
        System.out.println("Area sum = " + resultArea);
        checkResults(resultArea <= 1.7976931348623157 * Math.pow(10, 308) && resultArea >= 4.9406564584124654 * Math.pow(10, -324), "Calculate shapes area test");
    }

    void calculatePerimeterTest() {
        ShapeUtil shapeUtil = new ShapeUtil();
        Shape[] shapes = new Shape[4];
        shapes[0] = shapeUtil.createRandomCircle();
        shapes[1] = shapeUtil.createRandomSquare();
        shapes[2] = shapeUtil.createRandomRectangle();
        shapes[3] = shapeUtil.createRandomTriangle();
        double resultPerimeter = shapeUtil.calculatePerimeter(shapes);
        System.out.println("Perimeter sum = " + resultPerimeter);
        checkResults(resultPerimeter <= 1.7976931348623157 * Math.pow(10, 308) && resultPerimeter >= 4.9406564584124654 * Math.pow(10, -324), "Calculate shapes area test");
    }

    public boolean checkResults(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK \n");
            return condition;
        } else {
            System.out.println(testName + " = FAIL \n");
            return !condition;
        }
    }
}
