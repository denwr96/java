package main.java.javaguru.sunday.student_konstantin_shestakov.lesson_3.level_7_senior.super_task_2;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class BowlingLauncher {

    public static void main(String[] args) {
        BowlingGame playerOne = new BowlingGame("PlayerOne", 0);
        BowlingGame playerTwo = new BowlingGame("PlayerTwo", 0);
        playerOne.roll();
        playerOne.score();
        playerTwo.roll();
        playerTwo.score();
    }
}
