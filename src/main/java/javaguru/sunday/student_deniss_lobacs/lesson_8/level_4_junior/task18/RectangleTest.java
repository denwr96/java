package main.java.javaguru.sunday.student_deniss_lobacs.lesson_8.level_4_junior.task18;

public class RectangleTest {
    public static void main(String[] args) {
        RectangleTest rectangleTest = new RectangleTest();
        rectangleTest.shouldCalculateRectangleArea();
        rectangleTest.shouldCalculateRectangleAreaFailed();
        rectangleTest.shouldCalculateRectanglePerimeter();
        rectangleTest.shouldCalculateRectanglePerimeterFailed();
    }

    public void shouldCalculateRectangleArea(){
        Rectangle test = new Rectangle("Rectangle", 5 , 10 , 10);
        check(test.calculateArea(), 24.206145913796355, "testCalculateRectangleArea");
    }

    public void shouldCalculateRectangleAreaFailed(){
        Rectangle test = new Rectangle("Rectangle", 5 , 10, 10);
        check(test.calculateArea(), 34.206145913796355, "testCalculateRectangleAreaFailed");
    }

    public void shouldCalculateRectanglePerimeter(){
        Rectangle test = new Rectangle("Rectangle", 5 , 10 , 5);
        check(test.calculatePerimeter(), 20, "testCalculateRectanglePerimeter");
    }

    public void shouldCalculateRectanglePerimeterFailed(){
        Rectangle test = new Rectangle("Rectangle", 5 , 10 , 5);
        check(test.calculatePerimeter(), 30, "testCalculateRectanglePerimeterFailed");
    }

    public void check(double actualResult, double expectedResult, String testName) {
        if (actualResult == expectedResult) {
            System.out.println(testName + ": OK!");
        } else {
            System.out.println(testName + ": FAIL!");
        }
    }
}
