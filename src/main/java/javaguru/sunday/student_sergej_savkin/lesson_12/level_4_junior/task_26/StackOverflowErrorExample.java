package javaguru.sunday.student_sergej_savkin.lesson_12.level_4_junior.task_26;

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class StackOverflowErrorExample {

    public static void main(String[] args) {
        StackOverflowErrorExample stackOverflowErrorExample = new StackOverflowErrorExample();
        stackOverflowErrorExample.crash(0);
    }

    public void crash(int num) {
        num++;
        crash(num);
    }
}
