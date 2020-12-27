package javaguru.sunday.student_sergej_savkin.lesson_3.level_1_intern.task_6;

import javaguru.sunday.teacher.annotations.CodeReview;
import javaguru.sunday.teacher.annotations.CodeReviewComment;

@CodeReview(approved = false)
@CodeReviewComment(comment = "Вы могли бы наращивать это задание в одном package, чтобы не копировать постоянно классы." +
        "Можете переделать, оставив только конечный вариант задания, и указав в комментарии к нему, какие таски оно в себя включает? СПАСИБО!")
class RobotDemo {
    public static void main(String[] args) {
        Robot robot1 = new Robot();
        robot1.sayHello();
        robot1.sayYourName();

        Robot robot2 = new Robot();
        robot2.sayHello();
        robot2.sayYourName();
    }
}
