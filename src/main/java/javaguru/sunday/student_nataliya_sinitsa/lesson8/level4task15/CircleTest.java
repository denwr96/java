package main.java.javaguru.sunday.student_nataliya_sinitsa.lesson8.level4task15;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class CircleTest {

    public static void main(String[] args) {
        CircleTest test = new CircleTest();
        test.shouldCalculateCircleArea1();
        test.shouldCalculateCircleArea2();
        test.shouldCalculateCircleArea3();
        test.shouldCalculateCirclePerimeter1();
        test.shouldCalculateCirclePerimeter2();
        test.shouldCalculateCirclePerimeter3();
    }

    public void shouldCalculateCircleArea1() {
        Circle victim = new Circle("Circle", 2 * Math.PI);
        double actualResult = victim.calculateArea();
        check(actualResult == 4 * Math.PI * Math.PI * Math.PI, "shouldCalculateCircleArea1");
    }

    public void shouldCalculateCircleArea2() {
        Circle victim = new Circle("Circle", 0);
        double actualResult = victim.calculateArea();
        check(actualResult == 0, "shouldCalculateCircleArea2");
    }

    public void shouldCalculateCircleArea3() {
        Circle victim = new Circle("Circle", 3 / Math.PI);
        double actualResult = victim.calculateArea();
        check(actualResult == 9 / Math.PI, "shouldCalculateCircleArea3");
    }

    public void shouldCalculateCirclePerimeter1() {
        Circle victim = new Circle("Circle", 1 / Math.PI);
        double actualResult = victim.calculatePerimeter();
        check(actualResult == 2, "shouldCalculateCirclePerimeter1");
    }

    public void shouldCalculateCirclePerimeter2() {
        Circle victim = new Circle("Circle", 0);
        double actualResult = victim.calculatePerimeter();
        check(actualResult == 0, "shouldCalculateCirclePerimeter2");
    }

    public void shouldCalculateCirclePerimeter3() {
        Circle victim = new Circle("Circle", 1);
        double actualResult = victim.calculatePerimeter();
        check(actualResult == 2 * Math.PI, "shouldCalculateCirclePerimeter3");
    }


    public void check(boolean actualResult, String testName) {
        if (actualResult) {
            System.out.println(testName + " has passed!");
        } else {
            System.out.println(testName + " failed!");
        }
    }

}
