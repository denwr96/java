package javaguru.sunday.student_sergej_savkin.lesson_4.level_7_senior.super_task_2;

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class LeapYear {
    // return true - если год високосный
    // return false - если год обычный
    public boolean isLeapYear(int year) {
        if((year % 4 == 0) && (year % 100 != 0)){
            return true;
        } else if(year % 400 == 0){
            return true;
        } else {
            return false;
        }
    }
}
