package main.java.javaguru.sunday.student_sergej_savkin.lesson_10.level_2_intern.task_4_5;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

//task4
@CodeReview(approved = true)
class DayOfTheWeekDetectorArrayVersion implements DayOfTheWeekDetector {

    String[] weekDayArray = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

    public String detectDayName(int number) {
        if((number >= 1) && (number <= 7)) {
            return weekDayArray[number - 1];
        } else {
            return "Please enter day number from 1 to 7";
        }
    }

}
