package main.java.javaguru.sunday.student_sergej_savkin.lesson_8.level_4_junior;

class ShapeUtilTest {
    public static void main(String[] args) {

        ShapeUtil shapeUtil = new ShapeUtil();
        Shape[] shape = new Shape[4];
        shape[0] = shapeUtil.createRandomCircle();
        shape[1] = shapeUtil.createRandomSquare();
        shape[2] = shapeUtil.createRandomRectangle();
        shape[3] = shapeUtil.createRandomTriangle();
        System.out.println(shapeUtil.calculateArea(shape));
        System.out.println(shapeUtil.calculatePerimeter(shape));
    }
}
