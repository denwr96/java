package javaguru.sunday.student_deniss_lobacs.lesson_8.level_2_intern.task8;

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class Player {

    private String name;

    Player(String name) {
        this.name = name;
    }

}

class HumanPlayer extends Player {

    HumanPlayer(String name) {
        super(name);
    }

}
