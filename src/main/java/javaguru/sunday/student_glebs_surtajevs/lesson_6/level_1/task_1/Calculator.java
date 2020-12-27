package javaguru.sunday.student_glebs_surtajevs.lesson_6.level_1.task_1;

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class Calculator {

    public boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
    public boolean isEven2(int number) {
        return number % 2 == 0;
    }

}
