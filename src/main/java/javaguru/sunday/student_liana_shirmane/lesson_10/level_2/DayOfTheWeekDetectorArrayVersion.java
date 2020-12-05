package main.java.javaguru.sunday.student_liana_shirmane.lesson_10.level_2;
//task4

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
