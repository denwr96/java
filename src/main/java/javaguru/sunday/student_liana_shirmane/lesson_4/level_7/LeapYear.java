package main.java.javaguru.sunday.student_liana_shirmane.lesson_4.level_7;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class LeapYear {

    public boolean isLeapYear(int year) {
        if (!divBy4(year)) {
            return false;
        }
        if (!divBy100(year)) {
            return true;
        }
        else return divBy400(year);

    }

    private boolean divBy4(int year) {
        return year % 4 == 0;
    }

    private boolean divBy100(int year) {
        return year % 100 == 0;
    }

    private boolean divBy400(int year) {
        return year % 400 == 0;
    }
}

