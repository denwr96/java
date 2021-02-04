package javaguru.sunday.student_liana_shirmane.lesson_6.level_5;

import javaguru.sunday.teacher.annotations.CodeReview;

//task25
@CodeReview(approved = true)
public class Move {
    private int x;
    private int y;

    Move (int x, int y) {
        this.x = x;
        this.y = y;
    }
    int getX() {
        return x;
    }

    int getY() {
        return y;
    }
}

