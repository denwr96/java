package main.java.javaguru.sunday.student_nataliya_sinitsa.lesson8.level4task15;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

// NB! Только для равносторонних треугольников
@CodeReview(approved = true)
class TriangleTest {

    public static void main(String[] args) {
        TriangleTest test = new TriangleTest();
        test.shouldCalculateTriangleArea1();
        test.shouldCalculateTriangleArea2();
        test.shouldCalculateTrianglePerimeter1();
        test.shouldCalculateTrianglePerimeter2();
    }

    public void shouldCalculateTriangleArea1() {
        Triangle victim = new Triangle("Triangle", 4 / Math.sqrt(3));
        double actualResult = victim.calculateArea();
        check(actualResult == 4 / Math.sqrt(3), "shouldCalculateTriangleArea1");
    }

    public void shouldCalculateTriangleArea2() {
        Triangle victim = new Triangle("Triangle", 2);
        double actualResult = victim.calculateArea();
        check(actualResult == Math.sqrt(3), "shouldCalculateTriangleArea2");
    }

    public void shouldCalculateTrianglePerimeter1() {
        Triangle victim = new Triangle("Triangle", 1.7);
        double actualResult = victim.calculatePerimeter();
        check(actualResult == 5.1, "shouldCalculateTrianglePerimeter1");
    }

    public void shouldCalculateTrianglePerimeter2() {
        Triangle victim = new Triangle("Triangle", 0.5);
        double actualResult = victim.calculatePerimeter();
        check(actualResult == 1.5, "shouldCalculateTrianglePerimeter2");
    }

    public void check(boolean actualResult, String testName) {
        if (actualResult) {
            System.out.println(testName + " has passed!");
        } else {
            System.out.println(testName + " failed!");
        }
    }

}
