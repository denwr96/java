package main.java.javaguru.sunday.student_deniss_lobacs.lesson_8.level_4_junior.task17;

public class SquareTest {
    public static void main(String[] args) {
        SquareTest squareTest = new SquareTest();
        squareTest.shouldCalculateSquareArea();
        squareTest.shouldCalculateSquareAreaFailed();
        squareTest.shouldCalculateSquarePerimeter();
        squareTest.shouldCalculateSquarePerimeterFailed();
    }

    public void shouldCalculateSquareArea(){
        Square test = new Square("Square", 5);
        check(test.calculateArea(), 25, "testCalculateSquareArea");
    }

    public void shouldCalculateSquareAreaFailed(){
        Square test = new Square("Square", 5);
        check(test.calculateArea(), 50, "testCalculateSquareAreaFailed");
    }

    public void shouldCalculateSquarePerimeter(){
        Square test = new Square("Square", 5);
        check(test.calculatePerimeter(), 20, "testCalculateSquarePerimeter");
    }

    public void shouldCalculateSquarePerimeterFailed(){
        Square test = new Square("Square", 5);
        check(test.calculatePerimeter(), 30, "testCalculateSquarePerimeterFailed");
    }

    public void check(double actualResult, double expectedResult, String testName) {
        if (actualResult == expectedResult) {
            System.out.println(testName + ": OK!");
        } else {
            System.out.println(testName + ": FAIL!");
        }
    }
}
