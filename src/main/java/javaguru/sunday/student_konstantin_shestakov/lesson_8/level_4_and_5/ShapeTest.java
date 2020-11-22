package main.java.javaguru.sunday.student_konstantin_shestakov.lesson_8.level_4_and_5;

// Task 15 - 19 (level 4);

public class ShapeTest {

    public static void main(String[] args) {
        ShapeTest circleTest = new ShapeTest();
        circleTest.circleTest();
        ShapeTest squareTest = new ShapeTest();
        squareTest.squareTest();
        ShapeTest rectangleTest = new ShapeTest();
        rectangleTest.rectangleTest();
        ShapeTest triangleTest = new ShapeTest();
        triangleTest.triangleTest();
    }

    void circleTest () {
        Shape circleOne = new Circle("Circle 1", 4);
        double expectedAreaResult = 50.26544;
        double expectedPerimeterResult = 25.13272;
        double actualAreaResult = circleOne.calculateArea();
        double actualPerimeterResult = circleOne.calculatePerimeter();
        System.out.println("Calculate circle area actual result = " + actualAreaResult + ", expected = " + expectedAreaResult);
        checkResults(actualAreaResult == expectedAreaResult, "Circle calculate area test");
        System.out.println("Calculate circle perimeter actual result = " + actualPerimeterResult + ", expected = " + expectedPerimeterResult);
        checkResults(actualPerimeterResult == expectedPerimeterResult, "Circle calculate perimeter test");
        System.out.println();
    }

    void squareTest () {
        Shape squareOne = new Square("Square 1", 3);
        double expectedAreaResult = 9;
        double expectedPerimeterResult = 12;
        double actualAreaResult = squareOne.calculateArea();
        double actualPerimeterResult = squareOne.calculatePerimeter();
        System.out.println("Calculate square area actual result = " + actualAreaResult  + ", expected = " + expectedAreaResult);
        checkResults(actualAreaResult == expectedAreaResult, "Square calculate area test");
        System.out.println("Calculate square perimeter actual result = " + actualPerimeterResult  + ", expected = " + expectedPerimeterResult);
        checkResults(actualPerimeterResult == expectedPerimeterResult, "Square calculate perimeter test");
        System.out.println();
    }

    void rectangleTest () {
        Shape rectangleOne = new Rectangle("Rectangle 1", 4, 2);
        double expectedAreaResult = 8;
        double expectedPerimeterResult = 12;
        double actualAreaResult = rectangleOne.calculateArea();
        double actualPerimeterResult = rectangleOne.calculatePerimeter();
        System.out.println("Calculate rectangle area actual result = " + actualAreaResult  + ", expected = " + expectedAreaResult);
        checkResults(actualAreaResult == expectedAreaResult, "Rectangle calculate area test");
        System.out.println("Calculate rectangle perimeter actual result = " + actualPerimeterResult  + ", expected = " + expectedPerimeterResult);
        checkResults(actualPerimeterResult == expectedPerimeterResult, "Rectangle calculate perimeter test");
        System.out.println();
    }

    void triangleTest () {
        Shape triangleOne = new Triangle("Rectangle 1", 4);
        double expectedAreaResult = 6.928203230275509;
        double expectedPerimeterResult = 12;
        double actualAreaResult = triangleOne.calculateArea();
        double actualPerimeterResult = triangleOne.calculatePerimeter();
        System.out.println("Calculate triangle area actual result = " + actualAreaResult   + ", expected = " + expectedAreaResult);
        checkResults(actualAreaResult == expectedAreaResult, "Triangle calculate area test");
        System.out.println("Calculate triangle perimeter actual result = " + actualPerimeterResult  + ", expected = " + expectedPerimeterResult);
        checkResults(actualPerimeterResult == expectedPerimeterResult, "Triangle calculate perimeter test");
        System.out.println();
    }

    public boolean checkResults(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK");
            return condition;
        } else {
            System.out.println(testName + " = FAIL");
            return !condition;
        }
    }
}
