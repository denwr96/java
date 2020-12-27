package javaguru.sunday.student_natalia_kochkina.lesson_8.level_4;

import javaguru.sunday.teacher.annotations.CodeReview;

//Task_16
@CodeReview(approved = true)
public class CircleTest {

    public static void main(String[] args) {
        CircleTest circleTest = new CircleTest();
        circleTest.perimeterTest();
        circleTest.areaTest();
    }

    public void perimeterTest() {
        Circle circle = new Circle("exampleCircle", 2);
        double perimeter = circle.calculatePerimeter();
        double expectedPerimeter = 12.56;
        if (expectedPerimeter == perimeter) {
            System.out.println("perimeterTest OK");
        } else {
            System.out.println("perimeterTest FAILED");
        }
    }

    public void areaTest() {
        Circle circle = new Circle("exampleCircle", 3);
        double area = circle.calculateArea();
        double expectedArea = 28.26;
        if (expectedArea == area) {
            System.out.println("areaTest OK");
        } else {
            System.out.println("areaTest FAILED");
        }
    }
}
