package javaguru.sunday.student_natalia_kochkina.lesson_8.level_4;

import javaguru.sunday.teacher.annotations.CodeReview;

//Task_17
@CodeReview(approved = true)
public class SquareTest {

    public static void main(String[] args) {
        SquareTest squareTest = new SquareTest();
        squareTest.perimeterTest();
        squareTest.areaTest();
    }

    public void perimeterTest() {
        Square square = new Square("exampleSquare", 3);
        double perimeter = square.calculatePerimeter();
        double expectedPerimeter = 12;
        if (expectedPerimeter == perimeter) {
            System.out.println("perimeterTest OK");
        } else {
            System.out.println("perimeterTest FAILED");
        }
    }

    public void areaTest() {
        Square square = new Square("exampleSquare", 3);
        double area = square.calculateArea();
        double expectedArea = 9;
        if (expectedArea == area) {
            System.out.println("areaTest OK");
        } else {
            System.out.println("areaTest FAILED");
        }
    }
}
