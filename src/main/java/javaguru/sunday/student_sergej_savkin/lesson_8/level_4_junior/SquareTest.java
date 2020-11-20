package main.java.javaguru.sunday.student_sergej_savkin.lesson_8.level_4_junior;

//task_17

class SquareTest {
    public static void main(String[] args) {
        SquareTest squareTest = new SquareTest();
        squareTest.calculateAreaTest();
        squareTest.calculatePerimeterTest();
    }

    public void calculateAreaTest() {
        Square test = new Square("Square", 4);
        check(16, test.calculateArea(), "calculateAreaTest");
    }

    public void calculatePerimeterTest() {
        Square test = new Square("Square", 4);
        check(16, test.calculatePerimeter(), "calculatePerimeterTest");
    }

    public void check(double expectedResult, double actualResult, String testName) {
        if(expectedResult == actualResult) {
            System.out.println(testName + " OK!");
        } else {
            System.out.println(testName + " failed!");
        }
    }

}
