package javaguru.sunday.student_jelena_lavrenuka.lesson_8.shape;

import javaguru.sunday.teacher.annotations.CodeReview;

// lesson_8 task_15
// lesson_8 task_16
// lesson_8 task_17
// lesson_8 task_18
// lesson_8 task_19
@CodeReview(approved = true)
public class ShapeTest {
    public static void main(String[] args) {
        ShapeTest test = new ShapeTest();
        test.calculateAreaCircleTest();
        test.calculatePerimeterCircleTest();
        test.calculateAreaSquareTest();
        test.calculatePerimeterSquareTest();
        test.calculateAreaRectangleTest();
        test.calculatePerimeterRectangleTest();
        test.calculateAreaTriangleTest();
        test.calculatePerimeterTriangleTest();
    }

    public void calculateAreaCircleTest(){
        Circle victim = new Circle(5);
        double expectedResult = victim.calculateArea();
        double actualResult = 78.53981633974483;
        testResult(actualResult, expectedResult, "calculateAreaCircleTest");
    }

    public void calculatePerimeterCircleTest(){
        Circle victim = new Circle(5);
        double expectedResult = victim.calculatePerimeter();
        double actualResult = 31.41592653589793;
        testResult(actualResult, expectedResult, "calculatePerimeterCircleTest");
    }

    public void calculateAreaSquareTest(){
        Square victim = new Square(5);
        double expectedResult = victim.calculateArea();
        double actualResult = 25;
        testResult(actualResult, expectedResult, "calculateAreaSquareTest");
    }

    public void calculatePerimeterSquareTest(){
        Square victim = new Square(5);
        double expectedResult = victim.calculatePerimeter();
        double actualResult = 20;
        testResult(actualResult, expectedResult, "calculatePerimeterSquareTest");
    }

    public void calculateAreaRectangleTest(){
        Rectangle victim = new Rectangle(10, 5);
        double expectedResult = victim.calculateArea();
        double actualResult = 50;
        testResult(actualResult, expectedResult, "calculateAreaRectangleTest");
    }

    public void calculatePerimeterRectangleTest(){
        Rectangle victim = new Rectangle(10, 5);
        double expectedResult = victim.calculatePerimeter();
        double actualResult = 30;
        testResult(actualResult, expectedResult, "calculatePerimeterRectangleTest");
    }

    public void calculateAreaTriangleTest(){
        Triangle victim = new Triangle(5);
        double expectedResult = victim.calculateArea();
        double actualResult = 10.825317547305483;
        testResult(actualResult, expectedResult, "calculateAreaTriangleTest");
    }

    public void calculatePerimeterTriangleTest(){
        Triangle victim = new Triangle(5);
        double expectedResult = victim.calculatePerimeter();
        double actualResult = 15;
        testResult(actualResult, expectedResult, "calculatePerimeterTriangleTest");
    }

    public void testResult(double actualResult, double expectedResult, String testName) {
        if (expectedResult == actualResult) {
            System.out.println(testName + " is OK");
        } else {
            System.out.println(testName + " is failed");
        }
    }
}
