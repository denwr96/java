package main.java.javaguru.sunday.student_artjom_proshkin.lesson_8.level_6_middle.task_30;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class VarArgsDemo {

    public static void main(String[] args) {
        VarArgs varArgs = new VarArgs();
        varArgs.print("Learning", "Java", "every","day","!!!");
    }
}
