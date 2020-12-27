package main.java.javaguru.sunday.student_nataliya_sinitsa.lesson10.level2.task4;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class DayOfTheWeekDetectorArrayVersion implements DayOfTheWeekDetector {

    @Override
    public String detectDayName(int number) {
        String[] daysOfTheWeek = new String[8];
        daysOfTheWeek[0] = "Please input a valid number between 1 and 7";
        daysOfTheWeek[1] = "Monday";
        daysOfTheWeek[2] = "Tuesday";
        daysOfTheWeek[3] = "Wednesday";
        daysOfTheWeek[4] = "Thursday";
        daysOfTheWeek[5] = "Friday";
        daysOfTheWeek[6] = "Saturday";
        daysOfTheWeek[7] = "Sunday";
        if (number >= 1 && number <= 7) {
            return daysOfTheWeek[number];
        } else {
            return daysOfTheWeek[0];
        }
    }

}
