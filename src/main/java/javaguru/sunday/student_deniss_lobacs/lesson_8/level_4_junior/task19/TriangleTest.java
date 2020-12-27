package javaguru.sunday.student_deniss_lobacs.lesson_8.level_4_junior.task19;

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class TriangleTest {
    public static void main(String[] args) {
        TriangleTest triangleTest = new TriangleTest();
        triangleTest.shouldCalculateTriangleArea();
        triangleTest.shouldCalculateTriangleAreaFailed();
        triangleTest.shouldCalculateTrianglePerimeter();
        triangleTest.shouldCalculateTrianglePerimeterFailed();
    }

    public void shouldCalculateTriangleArea(){
        Triangle test = new Triangle("Triangle", 5);
        check(test.calculateArea(), 10.825317547305483, "testCalculateTriangleArea");
    }

    public void shouldCalculateTriangleAreaFailed(){
        Triangle test = new Triangle("Triangle", 5);
        check(test.calculateArea(), 34.206145913796355, "testCalculateTriangleAreaFailed");
    }

    public void shouldCalculateTrianglePerimeter(){
        Triangle test = new Triangle("Triangle", 5);
        check(test.calculatePerimeter(), 15, "testCalculateTrianglePerimeter");
    }

    public void shouldCalculateTrianglePerimeterFailed(){
        Triangle test = new Triangle("Triangle", 5);
        check(test.calculatePerimeter(), 30, "testCalculateTrianglePerimeterFailed");
    }

    public void check(double actualResult, double expectedResult, String testName) {
        if (actualResult == expectedResult) {
            System.out.println(testName + ": OK!");
        } else {
            System.out.println(testName + ": FAIL!");
        }
    }
}
