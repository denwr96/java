package main.java.javaguru.sunday.student_nataliya_sinitsa.lesson8.level4task15;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class SquareTest {

    public static void main(String[] args) {
        SquareTest test = new SquareTest();
        test.shouldCalculateSquareArea1();
        test.shouldCalculateSquareArea2();
        test.shouldCalculateSquarePerimeter1();
        test.shouldCalculateSquarePerimeter2();
    }

    public void shouldCalculateSquareArea1() {
        Square victim = new Square("Square", 1.2);
        double actualResult = victim.calculateArea();
        check(actualResult == 1.44, "shouldCalculateSquareArea1");
    }

    public void shouldCalculateSquareArea2() {
        Square victim = new Square("Square", 0.5);
        double actualResult = victim.calculateArea();
        check(actualResult == 0.25, "shouldCalculateSquareArea2");
    }

    public void shouldCalculateSquarePerimeter1() {
        Square victim = new Square("Square", 1.2);
        double actualResult = victim.calculatePerimeter();
        check(actualResult == 4.8, "shouldCalculateSquarePerimeter1");
    }

    public void shouldCalculateSquarePerimeter2() {
        Square victim = new Square("Square", 0.5);
        double actualResult = victim.calculatePerimeter();
        check(actualResult == 2, "shouldCalculateSquarePerimeter2");
    }

    public void check(boolean actualResult, String testName) {
        if (actualResult) {
            System.out.println(testName + " has passed!");
        } else {
            System.out.println(testName + " failed!");
        }
    }

}
