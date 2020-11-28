package main.java.javaguru.sunday.student_nataliya_sinitsa.lesson8.level4task15;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class RectangleTest {

    public static void main(String[] args) {
        RectangleTest test = new RectangleTest();
        test.shouldCalculateRectangleArea1();
        test.shouldCalculateRectangleArea2();
        test.shouldCalculateRectanglePerimeter1();
        test.shouldCalculateRectanglePerimeter2();
    }

    public void shouldCalculateRectangleArea1() {
        Rectangle victim = new Rectangle("Rectangle", 1, 2);
        double actualResult = victim.calculateArea();
        check(actualResult == 2, "shouldCalculateRectangleArea1");
    }

    public void shouldCalculateRectangleArea2() {
        Rectangle victim = new Rectangle("Rectangle", 2, 0.5);
        double actualResult = victim.calculateArea();
        check(actualResult == 1, "shouldCalculateRectangleArea2");
    }

    public void shouldCalculateRectanglePerimeter1() {
        Rectangle victim = new Rectangle("Rectangle", 1, 2);
        double actualResult = victim.calculatePerimeter();
        check(actualResult == 6, "shouldCalculateRectanglePerimeter1");
    }

    public void shouldCalculateRectanglePerimeter2() {
        Rectangle victim = new Rectangle("Rectangle", 0.5, 2);
        double actualResult = victim.calculatePerimeter();
        check(actualResult == 5, "shouldCalculateRectanglePerimeter2");
    }

    public void check(boolean actualResult, String testName) {
        if (actualResult) {
            System.out.println(testName + " has passed!");
        } else {
            System.out.println(testName + " failed!");
        }
    }

}
