package main.java.javaguru.sunday.student_sergej_savkin.lesson_6.level_4.task_16;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class InfiniteLoopForWithExit {

    public static void main(String[] args) {
        int result = 0;
        for ( ; ; ){
            System.out.println(result);
            result++;
            if(result == 10){
                break;
            }
        }
    }

}
