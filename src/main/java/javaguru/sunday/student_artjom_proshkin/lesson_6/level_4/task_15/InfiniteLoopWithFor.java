package javaguru.sunday.student_artjom_proshkin.lesson_6.level_4.task_15;

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class InfiniteLoopWithFor {

    public static void main(String[] args) {
        for (; ; ) {
            System.out.println("JavaGuru");
        }
    }
}
