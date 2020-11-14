package main.java.javaguru.sunday.student_jelena_lavrenuka.lesson_6.task_16;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class InfiniteLoopForStop {
    public static void main(String[] args) {
        for (int i = 0; i >= 0; i++) {
            System.out.println("You are beautiful");
            if (i == 10)
                break;
        }
    }
}
