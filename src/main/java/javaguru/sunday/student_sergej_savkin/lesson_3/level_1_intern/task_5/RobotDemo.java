package javaguru.sunday.student_sergej_savkin.lesson_3.level_1_intern.task_5;

import javaguru.sunday.teacher.annotations.CodeReview;
import javaguru.sunday.teacher.annotations.CodeReviewComment;

@CodeReview(approved = false)
@CodeReviewComment(comment = "Вы могли бы наращивать это задание в одном package, чтобы не копировать постоянно классы." +
        "Можете переделать, оставив только конечный вариант задания, и указав в комментарии к нему, какие таски оно в себя включает? СПАСИБО!")
public class RobotDemo {
    public static void main(String[] args) {
        Robot robot = new Robot();
        robot.sayHello();
        robot.sayYourName();
    }
}
