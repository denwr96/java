package javaguru.sunday.student_deniss_lobacs.lesson_8.level_4_junior.task17;
import javaguru.sunday.student_deniss_lobacs.lesson_8.level_4_junior.task15.Shape;
import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class Square extends Shape {

    private double side;

    public Square(String title , double side) {
        super(title);
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public double calculatePerimeter() {
        return side * 4;
    }

}