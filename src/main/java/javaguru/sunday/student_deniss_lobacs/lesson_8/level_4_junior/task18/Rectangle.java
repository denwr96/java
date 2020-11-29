package main.java.javaguru.sunday.student_deniss_lobacs.lesson_8.level_4_junior.task18;
import main.java.javaguru.sunday.student_deniss_lobacs.lesson_8.level_4_junior.task15.Shape;
import main.java.javaguru.sunday.teacher.annotations.CodeReview;

import static java.lang.Math.sqrt;

@CodeReview(approved = true)
public class Rectangle extends Shape {
    private double sideOne;
    private double sideTwo;
    private double sideThree;

    public Rectangle(String title , double sideOne , double sideTwo , double sideThree) {
        super(title);
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
        this.sideThree = sideThree;
    }

    @Override
    public double calculateArea() {
        double semiPerimeter = (calculatePerimeter()/2);
        return sqrt(semiPerimeter * (semiPerimeter - sideOne) * (semiPerimeter - sideTwo) * (semiPerimeter - sideThree));
    }

    @Override
    public double calculatePerimeter() {
        return sideOne + sideTwo + sideThree;
    }
}
