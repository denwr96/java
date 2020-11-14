package main.java.javaguru.sunday.student_jelena_lavrenuka.lesson_6.task_15;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class InfiniteLoopWhile {
    public static void main(String[] args) {
        boolean isBeautiful = true;
        while (true){
            System.out.println("You are beautiful");
        }
    }
}
