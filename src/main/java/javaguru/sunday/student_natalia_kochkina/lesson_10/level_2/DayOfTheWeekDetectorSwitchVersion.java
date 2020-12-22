package main.java.javaguru.sunday.student_natalia_kochkina.lesson_10.level_2;

//Task_4

public class DayOfTheWeekDetectorSwitchVersion implements DayOfTheWeekDetector {

    @Override
    public String detectDayName(int number) {
        String dayOfWeek = switch (number) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Please input a valid number between 1 and 7";
        };
        return dayOfWeek;
    }
}