package javaguru.sunday.student_sergej_savkin.lesson_3.level_6_middle.task_24;

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class PersonalComputerDemo {
    public static void main(String[] args) {
        PersonalComputer PC = new PersonalComputer("Asus",55, 8);
        PC.pcLoad();
        PC.ramChange();

    }
}
