package javaguru.sunday.student_artjom_proshkin.lesson_8.level_4_junior;

import javaguru.sunday.teacher.annotations.CodeReview;

//Task_17
@CodeReview(approved = true)
class Square extends Shape{

    private double edgeLength;

    Square(String title, double edgeLength) {
        super(title);
        this.edgeLength = edgeLength;
    }

    @Override
    double calculateArea() {
        return edgeLength * edgeLength;
    }

    @Override
    double calculatePerimeter() {
        return 4 * edgeLength;
    }
}
