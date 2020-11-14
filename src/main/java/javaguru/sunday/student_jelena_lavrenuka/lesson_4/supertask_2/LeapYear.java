package main.java.javaguru.sunday.student_jelena_lavrenuka.lesson_4.supertask_2;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class LeapYear {
    public boolean isLeapYear (int year){
        if(year % 4 != 0){
            return false;
        }else if (year % 100 != 0) {
            return true;
        }if ((year % 100 == 0) && (year % 400 == 0)){
            return true;
        }else return false;
    }
}
