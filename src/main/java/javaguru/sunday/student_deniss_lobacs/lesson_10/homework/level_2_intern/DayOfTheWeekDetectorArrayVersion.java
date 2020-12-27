package main.java.javaguru.sunday.student_deniss_lobacs.lesson_10.homework.level_2_intern;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class DayOfTheWeekDetectorArrayVersion implements DayOfTheWeekDetector{

    public String detectDayName(int number) {
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        if (number >= 1 && number <= 7) {
            return days[number - 1];
        } else {
            return "Please input a valid number between 1 and 7";
        }

    }
}
