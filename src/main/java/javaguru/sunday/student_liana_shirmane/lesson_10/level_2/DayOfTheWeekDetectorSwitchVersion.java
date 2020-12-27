package javaguru.sunday.student_liana_shirmane.lesson_10.level_2;
//task4

class DayOfTheWeekDetectorSwitchVersion implements DayOfTheWeekDetector {

    String day;

    @Override
    public String detectDayName(int number) {
        if ((number >= 1) && (number <= 7)) {
//            switch (number) {
//                case 1 -> day = "Monday";
//                case 2 -> day = "Tuesday";
//                case 3 -> day = "Wednesday";
//                case 4 -> day = "Thursday";
//                case 5 -> day = "Friday";
//                case 6 -> day = "Saturday";
//                case 7 -> day = "Sunday";
//            }
        } else {
            day = "Please input a valid number between 1 and 7";
        }
        return day;
    }
}
