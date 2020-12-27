package javaguru.sunday.student_artjom_proshkin.lesson_6.level_5;

import javaguru.sunday.teacher.annotations.CodeReview;

//Task_25
@CodeReview(approved = true)
class Move {

    private int x;
    private int y;

    Move(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {

        return x;
    }

    public int getY() {

        return y;
    }
}
