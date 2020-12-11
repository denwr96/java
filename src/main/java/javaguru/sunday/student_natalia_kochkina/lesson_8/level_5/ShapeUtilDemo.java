package main.java.javaguru.sunday.student_natalia_kochkina.lesson_8.level_5;

//Task_27

import main.java.javaguru.sunday.student_natalia_kochkina.lesson_8.level_4.Shape;
import main.java.javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class ShapeUtilDemo {

    public static void main(String[] args) {

        ShapeUtil shapeUtil = new ShapeUtil();
        Shape circle = shapeUtil.createRandomCircle();
        double circleArea = shapeUtil.calculateArea(circle);
        double circlePerimeter = shapeUtil.calculatePerimeter(circle);
        System.out.println(circleArea);
        System.out.println(circlePerimeter);
    }
}
