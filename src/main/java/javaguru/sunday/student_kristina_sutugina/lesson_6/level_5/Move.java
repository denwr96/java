package main.java.javaguru.sunday.student_kristina_sutugina.lesson_6.level_5;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;
import main.java.javaguru.sunday.teacher.annotations.CodeReviewComment;

//Task_25
@CodeReview(approved = true)
class Move {

    private int x;
    private int y;

    public Move(int firstCoordinate, int secondCoordinate) {
        this.x = firstCoordinate;
        this.y = secondCoordinate;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
