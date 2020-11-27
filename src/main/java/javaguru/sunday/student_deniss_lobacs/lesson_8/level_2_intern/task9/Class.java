package main.java.javaguru.sunday.student_deniss_lobacs.lesson_8.level_2_intern.task9;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class Player {

    private String name;

    Player(String name) {
        this.name = name;
    }

}

class ComputerPlayer extends Player {
    public ComputerPlayer(String name) {
        super(name);
    }
}