package main.java.javaguru.sunday.student_deniss_lobacs.lesson_4.level_7_senior.super_task_2;

public class LeapYear {

    public boolean isLeapYear(int year) {

        if ( !(year % 4 == 0) ) {
            return false;
        }  else if ( !(year % 100 == 0) ) {
            return true;
        }  else if (year % 400 == 0) {
            return true;
        }  else {
            return false;
        }
    }

}
