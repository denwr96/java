package javaguru.sunday.student_liana_shirmane.lesson_8.level_4_5;
//task16
//task17
//task18
//task19


public class ShapeTest {
    public static void main(String[] args) {
        ShapeTest test = new ShapeTest();
        test.calculateAreaCircle();
        test.calculatePerimeterCircle();
        test.calculateAreaSquare();
        test.calculatePerimeterSquare();
        test.calculateAreaRectangle();
        test.calculatePerimeterRectangle();
        test.calculateAreaTriangle();
        test.calculatePerimeterTriangle();
    }

    public void calculateAreaCircle(){
        Circle test = new Circle(2);
        double expectedResult = test.calculateArea();
        double actualResult = 12.566370614359172;
        check(actualResult, expectedResult, "calculateAreaCircle");
    }

    public void calculatePerimeterCircle(){
        Circle test = new Circle (2);
        double expectedResult = test.calculatePerimeter();
        double actualResult = 12.566370614359172;
        check(actualResult, expectedResult, "calculatePerimeterCircle");
    }

    public void calculateAreaSquare(){
        Square test = new Square (2);
        double expectedResult = test.calculateArea();
        double actualResult = 4;
        check(actualResult, expectedResult, "calculateAreaSquare");
    }

    public void calculatePerimeterSquare(){
        Square test = new Square (2);
        double expectedResult = test.calculatePerimeter();
        double actualResult = 8;
        check(actualResult, expectedResult, "calculatePerimeterSquare");
    }

    public void calculateAreaRectangle(){
        Rectangle test = new Rectangle (2, 4);
        double expectedResult = test.calculateArea();
        double actualResult = 8;
        check(actualResult, expectedResult, "calculateAreaRectangle");
    }

    public void calculatePerimeterRectangle(){
        Rectangle test = new Rectangle (2, 4);
        double expectedResult = test.calculatePerimeter();
        double actualResult = 12;
        check(actualResult, expectedResult, "calculatePerimeterRectangle");
    }

    public void calculateAreaTriangle(){
        Triangle test = new Triangle (2);
        double expectedResult = test.calculateArea();
        double actualResult = 6.9282032;
        check(actualResult, expectedResult, "calculateAreaRectangle");
    }

    public void calculatePerimeterTriangle(){
        Triangle test = new Triangle (2);
        double expectedResult = test.calculatePerimeter();
        double actualResult = 6;
        check(actualResult, expectedResult, "calculatePerimeterRectangle");
    }

    public void check(double expectedResult, double actualResult, String testName) {
        if (expectedResult == actualResult) {
            System.out.println(testName + " has passed!");
        } else {
            System.out.println(testName + " failed!");
            System.out.println("Expected: " + expectedResult + " but Actual: " + actualResult);
        }
    }
}
