package javaguru.sunday.student_konstantin_shestakov.lesson_4.level_7.super_task_2;

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class LeapYear {

    boolean leapYear;

    public boolean isLeapYear(int year) {

        if (year % 4 != 0){
            leapYear = false;
        }
        else if (year % 100 != 0){
            leapYear = true;
        }
        else if (year % 400 == 0){
            leapYear = true;
        }
        else {
            leapYear = false;
        }
        return leapYear;

    }

}
