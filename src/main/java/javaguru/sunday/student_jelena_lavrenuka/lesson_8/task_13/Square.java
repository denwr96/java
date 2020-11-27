package main.java.javaguru.sunday.student_jelena_lavrenuka.lesson_8.task_13;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class Square extends Shape{
    double squareLength;
    double squareHeigth;

    public Square(String shapeName) {
        super(shapeName);
        this.squareHeigth = squareHeigth;
        this.squareLength = squareLength;
    }

    @Override
    void shapeArea() {
        double shapeArea = squareHeigth * squareHeigth;
        System.out.println("Squares area is " + shapeArea);
    }
}
