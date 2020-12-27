package javaguru.sunday.student_artjom_proshkin.lesson_10.level_2_intern;

//Task_4

class DayOfTheWeekDetectorArrayVersion implements DayOfTheWeekDetector {

    @Override
    public String detectDayName(int number) {

        String[] weekDay = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        if (number >= 1 && number <= 7) {
            return weekDay[number - 1];
        } else {
            return "Please input a valid number between 1 and 7";
        }
    }
}
