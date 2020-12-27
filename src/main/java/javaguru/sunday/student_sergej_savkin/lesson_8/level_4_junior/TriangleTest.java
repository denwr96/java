package javaguru.sunday.student_sergej_savkin.lesson_8.level_4_junior;

import javaguru.sunday.teacher.annotations.CodeReview;

//task_19
@CodeReview(approved = true)
class TriangleTest {
    public static void main(String[] args) {
        TriangleTest triangleTest = new TriangleTest();
        triangleTest.calculatePerimeterTest();
        triangleTest.calculateAreaTest();
    }

    public void calculatePerimeterTest() {
        Triangle test = new Triangle("Triangle", 3);
        check(9, test.calculatePerimeter(), "calculatePerimeterTest");
    }

    public void calculateAreaTest() {
        Triangle test = new Triangle("Triangle", 3);
        check(3.897, test.calculateArea(), "calculateAreaTest");
    }

    public void check(double expectedResult, double actualResult, String testName) {
        if(expectedResult == actualResult) {
            System.out.println(testName + " OK!");
        } else {
            System.out.println(testName + " failed!");
        }
    }
}
