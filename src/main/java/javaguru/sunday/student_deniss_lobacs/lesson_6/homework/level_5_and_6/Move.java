package javaguru.sunday.student_deniss_lobacs.lesson_6.homework.level_5_and_6;

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class Move {
    private int x;
    private int y;

    Move(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

}
