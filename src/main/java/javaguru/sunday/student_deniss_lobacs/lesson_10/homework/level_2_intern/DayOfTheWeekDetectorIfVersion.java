package javaguru.sunday.student_deniss_lobacs.lesson_10.homework.level_2_intern;

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class DayOfTheWeekDetectorIfVersion implements  DayOfTheWeekDetector{

    public String detectDayName(int number) {
        if (number == 1) {
            return "Monday";
        } else if (number == 2) {
            return "Tuesday";
        } else if (number == 3) {
            return "Wednesday";
        } else if (number == 4) {
            return "Thursday";
        } else if (number == 5) {
            return "Friday";
        } else if (number == 6) {
            return "Saturday";
        } else if (number == 7) {
            return "Sunday";
        } else {
            return "Please input a valid number between 1 and 7";
        }
    }
}
