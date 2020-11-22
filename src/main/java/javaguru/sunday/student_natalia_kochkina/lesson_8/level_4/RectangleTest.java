package main.java.javaguru.sunday.student_natalia_kochkina.lesson_8.level_4;

//Task_18

public class RectangleTest {

    public static void main(String[] args) {
        RectangleTest rectangleTest = new RectangleTest();
        rectangleTest.perimeterTest();
        rectangleTest.areaTest();
    }

    public void perimeterTest() {
        Rectangle rectangle = new Rectangle("exampleRectangle", 3, 2);
        double perimeter = rectangle.calculatePerimeter();
        double expectedPerimeter = 10;
        if (expectedPerimeter == perimeter) {
            System.out.println("perimeterTest OK");
        } else {
            System.out.println("perimeterTest FAILED");
        }
    }

    public void areaTest() {
        Rectangle rectangle = new Rectangle("exampleRectangle", 3, 2);
        double area = rectangle.calculateArea();
        double expectedArea = 6;
        if (expectedArea == area) {
            System.out.println("areaTest OK");
        } else {
            System.out.println("areaTest FAILED");
        }
    }
}
