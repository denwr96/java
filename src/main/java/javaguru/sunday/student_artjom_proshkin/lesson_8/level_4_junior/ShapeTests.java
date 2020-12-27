package javaguru.sunday.student_artjom_proshkin.lesson_8.level_4_junior;

import javaguru.sunday.teacher.annotations.CodeReview;

//Task_16, Task_17, Task_18, Task_19
@CodeReview(approved = true)
class ShapeTests {

    public static void main(String[] args) {
        ShapeTests test = new ShapeTests();
        test.calculateCircleAreaTest();
        test.calculateCirclePerimeterTest();
        test.calculateSquareAreaTest();
        test.calculateSquarePerimeterTest();
        test.calculateRectangleAreaTest();
        test.calculateRectanglePerimeterTest();
        test.calculateTriangleAreaTest();
        test.calculateTrianglePerimeterTest();

    }

    void calculateCircleAreaTest() {
        Circle victim = new Circle("Circle", 5);
        checkResult(78.53981633974483, victim.calculateArea(), "calculateCircleAreaTest");
    }

    void calculateCirclePerimeterTest() {
        Circle victim = new Circle("Circle", 5);
        checkResult(31.41592653589793, victim.calculatePerimeter(), "calculateCirclePerimeterTest");
    }

    void calculateSquareAreaTest() {
        Square victim = new Square("Square",4);
        checkResult(16,victim.calculateArea(),"calculateSquareAreaTest");
    }

    void calculateSquarePerimeterTest() {
        Square victim = new Square("Square",3);
        checkResult(12,victim.calculatePerimeter(),"calculateSquarePerimeterTest");
    }

    void calculateRectangleAreaTest (){
        Rectangle victim = new Rectangle("Rectangle",4,5);
        checkResult(20,victim.calculateArea(),"calculateRectangleAreaTest");
    }

    void calculateRectanglePerimeterTest (){
        Rectangle victim = new Rectangle("Rectangle",4,5);
        checkResult(18,victim.calculatePerimeter(),"calculateRectanglePerimeterTest");
    }

    void calculateTriangleAreaTest (){
        Triangle victim = new Triangle("Triangle", 3);
        checkResult(3.897114317029974,victim.calculateArea(),"calculateTriangleAreaTest");
    }

    void calculateTrianglePerimeterTest (){
        Triangle victim = new Triangle("Triangle", 3);
        checkResult(9,victim.calculatePerimeter(),"calculateTrianglePerimeterTest");
    }

    void checkResult(double expected, double actual, String testName) {
        if (expected == actual) {
            System.out.println(testName + " PASSED!");
        } else {
            System.out.println(testName + " FAILED!");
            System.out.println("Expected = " + expected + "; Actual = " + actual + " " + testName);
        }
    }
}