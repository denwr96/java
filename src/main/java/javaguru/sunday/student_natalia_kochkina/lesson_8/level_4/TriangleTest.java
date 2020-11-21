package main.java.javaguru.sunday.student_natalia_kochkina.lesson_8.level_4;

//Task_19

public class TriangleTest {

    public static void main(String[] args) {
        TriangleTest triangleTest = new TriangleTest();
        triangleTest.perimeterTest();
        triangleTest.areaTest();
    }

    public void perimeterTest() {
        Triangle triangle = new Triangle("exampleTriangle", 4);
        double perimeter = triangle.calculatePerimeter();
        double expectedPerimeter = 12;
        if (expectedPerimeter == perimeter) {
            System.out.println("perimeterTest OK");
        } else {
            System.out.println("perimeterTest FAILED");
        }
    }

    public void areaTest() {
        Triangle triangle = new Triangle("exampleTriangle", 4);
        double area = triangle.calculateArea();
        double expectedArea = 6.928203230275509;
        if (expectedArea == area) {
            System.out.println("areaTest OK");
        } else {
            System.out.println("areaTest FAILED");
        }
    }
}
