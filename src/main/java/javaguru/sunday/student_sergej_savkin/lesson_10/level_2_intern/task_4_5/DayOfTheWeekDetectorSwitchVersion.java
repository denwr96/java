package javaguru.sunday.student_sergej_savkin.lesson_10.level_2_intern.task_4_5;

import javaguru.sunday.teacher.annotations.CodeReview;

//task4
@CodeReview(approved = true)
class DayOfTheWeekDetectorSwitchVersion implements DayOfTheWeekDetector {

    @Override
    public String detectDayName(int number) {
        String weekDay = "Please enter day number from 1 to 7";
        switch (number) {
            case 1 -> weekDay = "Monday";
            case 2 -> weekDay = "Tuesday";
            case 3 -> weekDay = "Wednesday";
            case 4 -> weekDay = "Thursday";
            case 5 -> weekDay = "Friday";
            case 6 -> weekDay = "Saturday";
            case 7 -> weekDay = "Sunday";
        }
        return weekDay;
    }
}
