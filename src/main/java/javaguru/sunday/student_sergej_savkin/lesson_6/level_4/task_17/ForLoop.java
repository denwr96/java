package javaguru.sunday.student_sergej_savkin.lesson_6.level_4.task_17;

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class ForLoop {

    public static void main(String[] args) {

        int number = 1;
        for (int i = 0; i < 100; i++) {
            System.out.println(number);
            number++;
            if(number == 10){
                break;
            }
        }
    }

}
