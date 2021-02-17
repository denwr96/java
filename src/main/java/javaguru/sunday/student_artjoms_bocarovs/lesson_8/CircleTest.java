package javaguru.sunday.student_artjoms_bocarovs.lesson_8;

public class CircleTest {

    public static void main(String[] args) {
        CircleTest circleTest = new CircleTest();
        circleTest.shouldCalculateCircleArea();
        circleTest.shouldCalculateCircleAreaFailed();
        circleTest.shouldCalculateCirclePerimeter();
        circleTest.shouldCalculateCirclePerimeterFailed();
    }

    public void shouldCalculateCircleArea(){
        Circle test = new Circle("Circle", 5);
        check(test.calculateArea(), 78.5, "testCalculateCircleArea");
    }

    public void shouldCalculateCircleAreaFailed(){
        Circle test = new Circle("Circle", 5);
        check(test.calculateArea(), 22.1, "testCalculateCircleAreaFailed");
    }

    public void shouldCalculateCirclePerimeter(){
        Circle test = new Circle("Circle", 6);
        check(test.calculatePerimeter(), 37.68, "testCalculateCirclePerimeter");
    }

    public void shouldCalculateCirclePerimeterFailed(){
        Circle test = new Circle("Circle", 5);
        check(test.calculatePerimeter(), 41.4, "testCalculateCirclePerimeterFailed");
    }

    public void check(double actualResult, double expectedResult, String testName) {
        if (actualResult == expectedResult) {
            System.out.println(testName + ": SUCCESS!");
        } else {
            System.out.println(testName + ": FAIL!");
        }
    }

}
