package main.java.javaguru.sunday.student_sergej_savkin.lesson_3.level_1_intern.task_1;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;
import main.java.javaguru.sunday.teacher.annotations.CodeReviewComment;

@CodeReview(approved = false)
@CodeReviewComment(comment = "Вы должны были создать класс Robot, и сделать так чтобы он мог говорить привет. Не надо было делать mail метод в классе, " +
        "который должен представлять собой объект реального мира. Вы могли бы наращивать это задание в одном package, чтобы не копировать постоянно классы." +
        "Можете переделать, оставив только конечный вариант задания, и указав в комментарии к нему, какие таски оно в себя включает? СПАСИБО!")
class Robot {
    public static void main(String[] args) {
        Robot robot = new Robot();
        robot.sayHello();
    }
    public void sayHello(){

        System.out.println("Hello!");
    }
}
