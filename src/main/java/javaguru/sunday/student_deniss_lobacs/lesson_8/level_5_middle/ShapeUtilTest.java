package javaguru.sunday.student_deniss_lobacs.lesson_8.level_5_middle;

import javaguru.sunday.student_deniss_lobacs.lesson_8.level_4_junior.task15.Shape;
import javaguru.sunday.teacher.annotations.CodeReview;

// task28;
@CodeReview(approved = true)
public class ShapeUtilTest {
    private ShapeUtil shapeUtil = new ShapeUtil();

    public static void main(String[] args) {
        ShapeUtilTest ShapeUtilTest = new ShapeUtilTest();
        ShapeUtilTest.shouldCalculateRandomShapesArea();
        ShapeUtilTest.shouldCalculateRandomShapesPerimeter();
    }

    public Shape[] generateShapes() {
        ShapeUtil shapeUtil = new ShapeUtil();
        Shape[] shapes = new Shape[4];
        shapes[0] = shapeUtil.createRandomCircle();
        shapes[1] = shapeUtil.createRandomSquare();
        shapes[2] = shapeUtil.createRandomRectangle();
        shapes[3] = shapeUtil.createRandomTriangle();
        return shapes;
    }

    public void shouldCalculateRandomShapesArea() {
        Shape[] shapes = generateShapes();
        double actualResult = shapeUtil.calculateArea(shapes);
        check(actualResult, "shouldCalculateRandomShapesArea");
    }

    public void shouldCalculateRandomShapesPerimeter() {
        Shape[] shapes = generateShapes();
        double actualResult = shapeUtil.calculatePerimeter(shapes);
        check(actualResult, "shouldCalculateRandomShapesPerimeter");
    }

    public void check(double actualResult, String testName) {
        if (actualResult >= 0) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FAILED");
        }
    }
}
