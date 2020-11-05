package main.java.javaguru.sunday.student_sergej_savkin.lesson_6.level_4.task_17;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class WhileLoop {

    public static void main(String[] args) {
        int number = 1;
        while(true){
            System.out.println(number);
            number++;
            if (number == 10){
                break;
            }
        }
    }

}
