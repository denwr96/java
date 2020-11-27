package main.java.javaguru.sunday.student_nataliya_sinitsa.lesson8.level4task15;

// Task 28

class ShapeUtilTest {

    public static void main(String[] args) {
        ShapeUtilTest test = new ShapeUtilTest();
        test.shouldCalculateRandomShapesArea1(); // Немного притянутый за уши тест, иногда фэйлиться.
        test.shouldCalculateRandomShapesArea();
        test.shouldCalculateRandomShapesPerimeter();
    }

    public void shouldCalculateRandomShapesArea1() {
        ShapeUtil shapeUtil = new ShapeUtil();
        Shape[] shapes = new Shape[4];
        shapes[0] = shapeUtil.createRandomCircle();
        shapes[1] = shapeUtil.createRandomSquare();
        shapes[2] = shapeUtil.createRandomRectangle();
        shapes[3] = shapeUtil.createRandomTriangle();

        // У всех площадей, кроме прямоугольника, есть зависимость от периметра. Площадь прямоугольника отнимаем
        double actualResult = shapeUtil.calculateArea(shapes) - shapeUtil.calculateArea(shapes[2]);


        double circlePerimeter = shapeUtil.calculatePerimeter(shapes[0]);
        double squarePerimeter = shapeUtil.calculatePerimeter(shapes[1]);
        double trianglePerimeter = shapeUtil.calculatePerimeter(shapes[3]);

        double circleAreaExpected = Math.round((circlePerimeter * circlePerimeter / 4 / Math.PI) * 100.0000) / 100.0000;
        double squareAreaExpected = Math.round((squarePerimeter * squarePerimeter / 16) * 100.0000) / 100.0000;
        double triangleAreaExpected = Math.round((trianglePerimeter * trianglePerimeter * Math.sqrt(3) / 9 / 4)
                                       * 100.0000) / 100.0000;

        // У всех площадей, кроме прямоугольника, есть зависимость от периметра. Площадь прямоугольника не берем
        double expectedResult = circleAreaExpected + squareAreaExpected + triangleAreaExpected;

        check(Math.round(actualResult * 100.0) / 100.0 == Math.round(expectedResult * 100.0) / 100.0,
                "shouldCalculateRandomShapesArea1");
    }

    public void shouldCalculateRandomShapesArea() {
        ShapeUtil shapeUtil = new ShapeUtil();
        Shape[] shapes = new Shape[4];
        shapes[0] = shapeUtil.createRandomCircle();
        shapes[1] = shapeUtil.createRandomSquare();
        shapes[2] = shapeUtil.createRandomRectangle();
        shapes[3] = shapeUtil.createRandomTriangle();
        double actualResult = shapeUtil.calculatePerimeter(shapes);
        check(actualResult > 0, "shouldCalculateRandomShapesArea");
    }

    public void shouldCalculateRandomShapesPerimeter() {
        ShapeUtil shapeUtil = new ShapeUtil();
        Shape[] shapes = new Shape[4];
        shapes[0] = shapeUtil.createRandomCircle();
        shapes[1] = shapeUtil.createRandomSquare();
        shapes[2] = shapeUtil.createRandomRectangle();
        shapes[3] = shapeUtil.createRandomTriangle();
        double actualResult = shapeUtil.calculatePerimeter(shapes);
        check(actualResult > 0, "shouldCalculateRandomShapesPerimeter");
    }

    public void check(boolean actualResult, String testName) {
        if (actualResult) {
            System.out.println(testName + " has passed!");
        } else {
            System.out.println(testName + " failed!");
        }
    }

}
