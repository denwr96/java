package main.java.javaguru.sunday.student_kristina_sutugina.lesson_8.level_4;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class AllShapesTest {
    public static void main(String[] args) {
        AllShapesTest victim = new AllShapesTest();
        victim.calculateAreaOfCircleTest();
        victim.calculatePerimeterOfCircleTest();
        victim.calculateAreaOfSquareTest();
        victim.calculatePerimeterOfSquareTest();
        victim.calculateAreaOfRectangleTest();
        victim.calculatePerimeterOfRectangleTest();
        victim.calculateAreaOfTriangleTest();
        victim.calculatePerimeterOfTriangleTest();

    }

    public void calculateAreaOfCircleTest() {
        Circle circle = new Circle(5);
        double expectedResult = 78.53981633974483;
        double result = circle.calculateArea();
        check(expectedResult, result, "calculateAreaOfCircleTest");
    }

    public void calculatePerimeterOfCircleTest() {
        Circle circle = new Circle(5);
        double expectedResult = 31.41592653589793;
        double result = circle.calculatePerimeter();
        check(expectedResult, result, "calculatePerimeterOfCircleTest");
    }

    public void calculateAreaOfSquareTest() {
        Square square = new Square(5);
        double expectedResult = 25;
        double result = square.calculateArea();
        check(expectedResult, result, "calculateAreaOfSquareTest");
    }

    public void calculatePerimeterOfSquareTest() {
        Square square = new Square(5);
        double expectedResult = 20;
        double result = square.calculatePerimeter();
        check(expectedResult, result, "calculatePerimeterOfSquareTest");
    }

    public void calculateAreaOfRectangleTest() {
        Rectangle rectangle = new Rectangle(3, 5);
        double expectedResult = 15;
        double result = rectangle.calculateArea();
        check(expectedResult, result, "calculateAreaOfRectangleTest");
    }

    public void calculatePerimeterOfRectangleTest() {
        Rectangle rectangle = new Rectangle(3, 5);
        double expectedResult = 16;
        double result = rectangle.calculatePerimeter();
        check(expectedResult, result, "calculatePerimeterOfRectangleTest");
    }

    public void calculateAreaOfTriangleTest() {
        Triangle triangle = new Triangle(8);
        double expectedResult = 27.712812921102035;
        double result = triangle.calculateArea();
        check(expectedResult, result, "calculateAreaOfTriangleTest");
    }

    public void calculatePerimeterOfTriangleTest() {
        Triangle triangle = new Triangle(8);
        double expectedResult = 24;
        double result = triangle.calculatePerimeter();
        check(expectedResult, result, "calculatePerimeterOfTriangleTest");
    }

    public void check(double expectedResult, double actualResult, String testName) {
        if (expectedResult == actualResult) {
            System.out.println(testName + " passed.");
        } else {
            System.out.println(testName + " failed.");
        }
    }
}
