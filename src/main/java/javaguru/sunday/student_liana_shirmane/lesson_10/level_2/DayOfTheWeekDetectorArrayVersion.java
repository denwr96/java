package javaguru.sunday.student_liana_shirmane.lesson_10.level_2;

import javaguru.sunday.teacher.annotations.CodeReview;

//task4
@CodeReview(approved = true)
class DayOfTheWeekDetectorArrayVersion implements DayOfTheWeekDetector {

    @Override
    public String detectDayName(int number) {

        String[] weekDays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        if (number >= 1 && number <= 7) {
            return weekDays[number - 1];
        } else {
            return "Please input a valid number between 1 and 7";
        }
    }
}
