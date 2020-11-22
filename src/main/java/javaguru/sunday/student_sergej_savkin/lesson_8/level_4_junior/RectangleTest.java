package main.java.javaguru.sunday.student_sergej_savkin.lesson_8.level_4_junior;

//task_18

class RectangleTest {
    public static void main(String[] args) {
        RectangleTest rectangleTest = new RectangleTest();
        rectangleTest.calculateAreaTest();
        rectangleTest.calculatePerimeterTest();
    }

    public void calculateAreaTest() {
        Rectangle test = new Rectangle("Rectangle", 4, 5);
        check(20, test.calculateArea(), "calculateAreaTest");
    }

    public void calculatePerimeterTest() {
        Rectangle test = new Rectangle("Rectangle", 4, 5);
        check(18, test.calculatePerimeter(), "calculatePerimeterTest");
    }

    public void check(double expectedResult, double actualResult, String testName) {
        if(expectedResult == actualResult) {
            System.out.println(testName + " OK!");
        } else {
            System.out.println(testName + " failed!");
        }
    }
}
