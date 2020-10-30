package main.java.javaguru.sunday.student_konstantin_shestakov.lesson_4.level_7.super_task_2;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class LeapYearList {

    public static void main(String[] args) {

        boolean leapYear;
        int year = 1;

        for (year = 1; year <= 2020; year++) {

            if (year % 4 != 0) {
                leapYear = false;

            } else if (year % 100 != 0) {
                leapYear = true;

            } else if (year % 400 == 0) {
                leapYear = true;

            } else {
                leapYear = false;
            }

            if (leapYear) {
                System.out.println("Year: " + year + " - leap year");
            } else {
                System.out.println("Year: " + year);
            }
        }
    }
}


