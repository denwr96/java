package main.java.javaguru.sunday.student_artjom_proshkin.lesson_8.level_4_junior;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

//Task_28
@CodeReview(approved = true)
class ShapeUtilTest {

    public static void main(String[] args) {
        ShapeUtilTest test = new ShapeUtilTest();
        test.calculateTotalAreaTest();
        test.calculateTotalPerimeterTest();

    }

    void calculateTotalAreaTest() {
        ShapeUtil victim = new ShapeUtil();
        Shape[] shape = new Shape[5];
        shape[0] = victim.createRandomCircle();
        shape[1] = victim.createRandomSquare();
        shape[2] = victim.createRandomRectangle();
        shape[3] = victim.createRandomTriangle();
        shape[4] = victim.createRandomShape();
        checkResult(victim.calculateArea(shape),"calculateTotalAreaTest");
    }

    void calculateTotalPerimeterTest() {
        ShapeUtil victim = new ShapeUtil();
        Shape[] shape = new Shape[5];
        shape[0] = victim.createRandomCircle();
        shape[1] = victim.createRandomSquare();
        shape[2] = victim.createRandomRectangle();
        shape[3] = victim.createRandomTriangle();
        shape[4] = victim.createRandomShape();
        checkResult(victim.calculatePerimeter(shape),"calculateTotalPerimeterTest");
    }


    void checkResult(double result, String testName) {
        if (result > 0) {
            System.out.println(testName + " PASSED !");
        } else
            System.out.println(testName + " FAILED !");
    }


}
